package com.trevorism.gcloud.webapi.controller

import com.google.gson.Gson
import com.trevorism.model.TestResult
import com.trevorism.model.TestSuite
import org.junit.jupiter.api.Test

class WebTestControllerTest {

    @Test
    void testWebTestInvalidTestSuite() {
        WebTestController controller = new WebTestController()
        TestResult testResult = controller.webTest(new TestSuite())
        assert testResult
        assert !testResult.success
        assert testResult.numberOfTests == 0
    }

    @Test
    void testWebTestWrongKind() {
        WebTestController controller = new WebTestController()
        TestResult testResult = controller.webTest(new TestSuite(source: "endpoint-tester", "kind":"unit"))
        assert testResult
        assert !testResult.success
    }

    @Test
    void testWebTest() {
        WebTestController controller = new WebTestController()
        TestResult testResult = controller.webTest(new TestSuite(source: "endpoint-tester", "kind":"web"))
        assert testResult
        assert testResult.success
        assert testResult.numberOfTests == 1
    }

    @Test
    void testTestResultSerialization(){
        Gson gson = new Gson()
        String json = gson.toJson(new TestResult())
        assert json
        assert json.contains("T")
        assert json.contains("Z")

    }
}
