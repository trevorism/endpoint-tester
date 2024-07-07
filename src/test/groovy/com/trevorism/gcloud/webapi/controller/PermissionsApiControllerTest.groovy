package com.trevorism.gcloud.webapi.controller

import org.junit.jupiter.api.Test

class PermissionsApiControllerTest {

    private PermissionsApiController controller = new PermissionsApiController()

    @Test
    void testGetInternal() {
        assert "{\"secure\": \"internal\"}" == controller.getInternal()
    }

    @Test
    void testGetSystem() {
        assert "{\"secure\": \"system\"}" == controller.getSystem()
    }

    @Test
    void testGetAdmin() {
        assert "{\"secure\": \"admin\"}" == controller.getAdmin()
    }

    @Test
    void testGetTenant() {
        assert "{\"secure\": \"tenant\"}" == controller.getTenant()
    }

    @Test
    void testGetCreate() {
        assert "{\"secure\": \"create\"}" == controller.getCreate()
    }

    @Test
    void testGetRead() {
        assert "{\"secure\": \"read\"}" == controller.getRead()
    }

    @Test
    void testGetUpdate() {
        assert "{\"secure\": \"update\"}" == controller.getUpdate()
    }

    @Test
    void testGetDelete() {
        assert "{\"secure\": \"delete\"}" == controller.getDelete()
    }

    @Test
    void testGetExecute() {
        assert "{\"secure\": \"execute\"}" == controller.getExecute()
    }

    @Test
    void testGetAny() {
        assert "{\"secure\": \"any\"}" == controller.getAny()
    }

}
