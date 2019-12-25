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

@Api("API Operations")
@Path("/api")
class ApiController {

    @ApiOperation(value = "Json response")
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    String getJson() {
        "hello json"
    }

    @ApiOperation(value = "XML response")
    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    String getXml() {
        "hello xml"
    }

    @ApiOperation(value = "A response")
    @GET
    @Path("/nospec")
    @Produces(MediaType.TEXT_PLAIN)
    String getNotSpecifiedMediaType() {
        "hello"
    }

    @ApiOperation(value = "Json creation")
    @POST
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    def createJson(def json) {
        json
    }

    @ApiOperation(value = "XML creation")
    @POST
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    @Consumes(MediaType.TEXT_XML)
    def createXml(def xml) {
        xml
    }

    @ApiOperation(value = "Creation")
    @POST
    @Path("/nospec")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    def create(def data) {
        data
    }


    @ApiOperation(value = "Json update")
    @PUT
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    def updateJson(def json) {
        json
    }

    @ApiOperation(value = "XML update")
    @PUT
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    @Consumes(MediaType.TEXT_XML)
    def updateXml(def xml) {
        xml
    }

    @ApiOperation(value = "Update")
    @PUT
    @Path("/nospec")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    def update(def data) {
        data
    }

    @ApiOperation(value = "Json delete")
    @DELETE
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    String deleteJson() {
        "delete json"
    }

    @ApiOperation(value = "XML delete")
    @DELETE
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    String deleteXml() {
        "delete xml"
    }

    @ApiOperation(value = "delete")
    @DELETE
    @Path("/nospec")
    @Produces(MediaType.TEXT_PLAIN)
    String deleteNotSpecifiedMediaType() {
        "delete"
    }
}
