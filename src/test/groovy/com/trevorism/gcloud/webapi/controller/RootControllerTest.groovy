package com.trevorism.gcloud.webapi.controller

import org.junit.jupiter.api.Test

class RootControllerTest {

    @Test
    void testRootControllerEndpoints(){
        RootController rootController = new RootController()
        assert rootController.index().getBody().get().contains("ping")
        assert rootController.index().getBody().get().contains("help")
    }

    @Test
    void testRootControllerPing(){
        RootController rootController = new RootController()
        assert rootController.ping() == "pong"
    }

}
