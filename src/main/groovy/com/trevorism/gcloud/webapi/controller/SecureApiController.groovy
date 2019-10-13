package com.trevorism.gcloud.webapi.controller

import com.trevorism.secure.Secure
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

@Api("Secure API Operations")
@Path("/secure")
class SecureApiController {

    @ApiOperation(value = "Json response")
    @GET
    @Secure
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    String getJson(){
        "secure hello json"
    }

    @ApiOperation(value = "XML response")
    @GET
    @Secure
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    String getXml(){
        "secure hello xml"
    }

    @ApiOperation(value = "A response")
    @GET
    @Secure
    @Path("/nospec")
    @Consumes(MediaType.TEXT_PLAIN)
    String getNotSpecifiedMediaType(){
        "secure hello"
    }

    @ApiOperation(value = "Json creation")
    @POST
    @Secure
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    def createJson(def json){
        json
    }

    @ApiOperation(value = "XML creation")
    @POST
    @Secure
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    @Consumes(MediaType.TEXT_XML)
    def createXml(def xml){
        xml
    }

    @ApiOperation(value = "Creation")
    @POST
    @Secure
    @Path("/nospec")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    def create(def data){
        data
    }


    @ApiOperation(value = "Json update")
    @PUT
    @Secure
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    def updateJson(def json){
        json
    }

    @ApiOperation(value = "XML update")
    @PUT
    @Secure
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    @Consumes(MediaType.TEXT_XML)
    def updateXml(def xml){
        xml
    }

    @ApiOperation(value = "Update")
    @PUT
    @Secure
    @Path("/nospec")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    def update(def data){
        data
    }

    @ApiOperation(value = "Json delete")
    @DELETE
    @Secure
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    String deleteJson(){
        "secure delete json"
    }

    @ApiOperation(value = "XML delete")
    @DELETE
    @Secure
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    String deleteXml(){
        "secure delete xml"
    }

    @ApiOperation(value = "delete")
    @DELETE
    @Secure
    @Path("/nospec")
    @Produces(MediaType.TEXT_PLAIN)
    String deleteNotSpecifiedMediaType(){
        "secure delete"
    }
}
