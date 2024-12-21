package com.trevorism.gcloud.webapi.controller

import com.google.gson.Gson
import com.trevorism.https.SecureHttpClient
import com.trevorism.model.TestResult
import com.trevorism.model.TestSuite
import org.junit.jupiter.api.Test

class WebTestControllerTest {

    @Test
    void testWebTestInvalidTestSuite() {
        WebTestController controller = new WebTestController([post: {x,y -> "{}"}] as SecureHttpClient)
        TestResult testResult = controller.webTest(new TestSuite())
        assert testResult
        assert !testResult.success
    }

    @Test
    void testWebTest() {
        WebTestController controller = new WebTestController([post: {x,y -> "{}"}] as SecureHttpClient)
        TestResult testResult = controller.webTest(new TestSuite(source: "endpoint-tester", "kind":"web"))
        assert testResult
        assert testResult.success
    }

    @Test
    void testWebTestWithError() {
        WebTestController controller = new WebTestController([post: {x,y -> throw new RuntimeException()}] as SecureHttpClient)
        TestResult testResult = controller.webTest(new TestSuite(source: "endpoint-tester", "kind":"web"))
        assert testResult
        assert !testResult.success
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
