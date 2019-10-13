package com.trevorism.gcloud.webapi.controller

import org.junit.Test

class ApiControllerTest {
    private ApiController controller = new ApiController()

    @Test
    void testGetJson() {
        assert "hello json" == controller.getJson()
    }

    @Test
    void testGetXml() {
        assert "hello xml" == controller.getXml()
    }

    @Test
    void testGetNotSpecifiedMediaType() {
        assert "hello" == controller.getNotSpecifiedMediaType()
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
        assert "delete json" == controller.deleteJson()
    }

    @Test
    void testDeleteXml() {
        assert "delete xml" == controller.deleteXml()
    }

    @Test
    void testDeleteNotSpecifiedMediaType() {
        assert "delete" == controller.deleteNotSpecifiedMediaType()
    }
}
