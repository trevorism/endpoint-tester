package com.trevorism.gcloud.webapi.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation

import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.PUT
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import java.util.logging.Logger

@Api("API Operations")
@Path("/api")
class ApiController {

    private static final Logger log = Logger.getLogger(ApiController.class.name)

    @ApiOperation(value = "Json response")
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    String getJson() {
        log.info("In getJson")
        "hello json"
    }

    @ApiOperation(value = "XML response")
    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    String getXml() {
        log.info("In getXml")
        "hello xml"
    }

    @ApiOperation(value = "A response")
    @GET
    @Path("/nospec")
    @Produces(MediaType.TEXT_PLAIN)
    String getNotSpecifiedMediaType() {
        log.info("In getNotSpecifiedMediaType")
        "hello"
    }

    @ApiOperation(value = "Json creation")
    @POST
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    def createJson(def json) {
        log.info("In createJson: ${json}")
        json
    }

    @ApiOperation(value = "XML creation")
    @POST
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    @Consumes(MediaType.TEXT_XML)
    def createXml(def xml) {
        log.info("In createXml: ${xml}")
        xml
    }

    @ApiOperation(value = "Creation")
    @POST
    @Path("/nospec")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    def create(def data) {
        log.info("In create: ${data}")
        data
    }


    @ApiOperation(value = "Json update")
    @PUT
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    def updateJson(def json) {
        log.info("In updateJson: ${json}")
        json
    }

    @ApiOperation(value = "XML update")
    @PUT
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    @Consumes(MediaType.TEXT_XML)
    def updateXml(def xml) {
        log.info("In updateXml: ${xml}")
        xml
    }

    @ApiOperation(value = "Update")
    @PUT
    @Path("/nospec")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    def update(def data) {
        log.info("In update: ${data}")
        data
    }

    @ApiOperation(value = "Json delete")
    @DELETE
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    String deleteJson() {
        log.info("In deleteJson")
        "delete json"
    }

    @ApiOperation(value = "XML delete")
    @DELETE
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    String deleteXml() {
        log.info("In deleteXml")
        "delete xml"
    }

    @ApiOperation(value = "delete")
    @DELETE
    @Path("/nospec")
    @Produces(MediaType.TEXT_PLAIN)
    String deleteNotSpecifiedMediaType() {
        log.info("In deleteNotSpecifiedMediaType")
        "delete"
    }
}
