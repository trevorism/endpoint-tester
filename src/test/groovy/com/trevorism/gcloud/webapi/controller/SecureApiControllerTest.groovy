package com.trevorism.gcloud.webapi.controller

import org.junit.jupiter.api.Test

class SecureApiControllerTest {

    private SecureApiController controller = new SecureApiController()

    @Test
    void testGetJson() {
        assert "{\"secure\": \"hello json\"}" == controller.getJson()
    }

    @Test
    void testGetXml() {
        assert "<hello> secure </hello>" == controller.getXml()
    }

    @Test
    void testGetNotSpecifiedMediaType() {
        assert "secure hello" == controller.getNotSpecifiedMediaType()
    }

    @Test
    void testCreateJson() {
        assert "testj" == controller.createJson("testj")
    }

    @Test
    void testCreateXml() {
        assert "testx" == controller.createXml("testx")
    }

    @Test
    void testCreate() {
        assert "test" == controller.create("test")
    }

    @Test
    void testUpdateJson() {
        assert "utestj" == controller.updateJson("utestj")
    }

    @Test
    void testUpdateXml() {
        assert "utestx" == controller.updateXml("utestx")
    }

    @Test
    void testUpdate() {
        assert "utest" == controller.update("utest")
    }

    @Test
    void testDeleteJson() {
        assert "{\"secure\": \"delete json\"}" == controller.deleteJson()
    }

    @Test
    void testDeleteXml() {
        assert "<delete> secure </delete>" == controller.deleteXml()
    }

    @Test
    void testDeleteNotSpecifiedMediaType() {
        assert "secure delete" == controller.deleteNotSpecifiedMediaType()
    }

}
