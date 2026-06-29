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

    @Test
    void testGreetingWithNamedParameter() {
        RootController rootController = new RootController()
        Optional<String> name = Optional.of("Micronaut")
        assert rootController.greeting(name) == "Hello, Micronaut!"
    }

    @Test
    void testGreetingWithBlankName() {
        RootController rootController = new RootController()
        Optional<String> name = Optional.of("")
        assert rootController.greeting(name) == "Hello, World!"
    }

    @Test
    void testGreetingWithMissingName() {
        RootController rootController = new RootController()
        Optional<String> name = Optional.empty()
        assert rootController.greeting(name) == "Hello, World!"
    }

}
