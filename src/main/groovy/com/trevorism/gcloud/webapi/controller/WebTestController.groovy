package com.trevorism.gcloud.webapi.controller

import com.trevorism.https.SecureHttpClient
import com.trevorism.model.TestResult
import com.trevorism.model.TestSuite
import com.trevorism.secure.Roles
import com.trevorism.secure.Secure
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller("/test")
class WebTestController {
    private static final Logger log = LoggerFactory.getLogger(WebTestController.class.name)
    private SecureHttpClient secureHttpClient

    WebTestController(SecureHttpClient secureHttpClient) {
        this.secureHttpClient = secureHttpClient
    }

    @Tag(name = "Test Endpoint Operations")
    @Operation(summary = "Tests itself **Secure")
    @Post(produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    @Secure(Roles.USER)
    TestResult webTest(@Body TestSuite testSuite) {
        //Start a millisecond timer
        long startTime = System.currentTimeMillis()

        if (testSuite.source != "endpoint-tester" || testSuite.kind != "web") {
            //Get duration in milliseconds
            log.info("Attempting to test an invalid test suite")
            return createTestResult(testSuite, false, 0, startTime)
        }

        try {
            String result = secureHttpClient.post("https://endpoint-tester.testing.trevorism.com/secure/json", "{}")
            if (result == "{}") {
                log.info("Successfully ran sample test")
                return createTestResult(testSuite, true, 1, startTime)
            }
        } catch (Exception e) {
            log.warn("Failed to run sample test", e)
        }
        return createTestResult(testSuite, false, 1, startTime)
    }

    private static TestResult createTestResult(TestSuite testSuite, boolean success, int numberOfTests, long startTime) {
        int duration = (int) (System.currentTimeMillis() - startTime)
        new TestResult([
                service       : testSuite.source,
                kind          : testSuite.kind,
                success       : success,
                numberOfTests : numberOfTests,
                durationMillis: duration
        ])
    }
}
