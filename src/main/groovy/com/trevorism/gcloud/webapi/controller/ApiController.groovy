package com.trevorism.gcloud.webapi.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.Logger
import org.slf4j.LoggerFactory


@Controller("/api")
class ApiController {

    private static final Logger log = LoggerFactory.getLogger(ApiController.class.name)

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "Json response")
    @Get(value = "json", produces = MediaType.APPLICATION_JSON)
    String getJson() {
        log.info("In getJson")
        "hello json"
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "XML response")
    @Get(value = "xml", produces = MediaType.TEXT_XML)
    String getXml() {
        log.info("In getXml")
        "hello xml"
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "A response")
    @Get(value = "nospec", produces = MediaType.TEXT_PLAIN)
    String getNotSpecifiedMediaType() {
        log.info("In getNotSpecifiedMediaType")
        "hello"
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "Json creation")
    @Post(value = "json", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    def createJson(@Body def json) {
        log.info("In createJson: ${json}")
        json
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "XML creation")
    @Post(value = "xml", produces = MediaType.TEXT_XML, consumes = MediaType.TEXT_XML)
    def createXml(@Body def xml) {
        log.info("In createXml: ${xml}")
        xml
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "Creation")
    @Post(value = "nospec", produces = MediaType.TEXT_PLAIN, consumes = MediaType.TEXT_PLAIN)
    def create(@Body def data) {
        log.info("In create: ${data}")
        data
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "Json update")
    @Put(value = "json", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    def updateJson(@Body def json) {
        log.info("In updateJson: ${json}")
        json
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "XML update")
    @Put(value = "xml", produces = MediaType.TEXT_XML, consumes = MediaType.TEXT_XML)
    def updateXml(@Body def xml) {
        log.info("In updateXml: ${xml}")
        xml
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "Update")
    @Put(value = "nospec", produces = MediaType.TEXT_PLAIN, consumes = MediaType.TEXT_PLAIN)
    def update(@Body def data) {
        log.info("In update: ${data}")
        data
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "Json delete")
    @Delete(value = "json", produces = MediaType.APPLICATION_JSON)
    String deleteJson() {
        log.info("In deleteJson")
        "delete json"
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "XML delete")
    @Delete(value = "xml", produces = MediaType.TEXT_XML)
    String deleteXml() {
        log.info("In deleteXml")
        "delete xml"
    }

    @Tag(name = "Endpoint Operations")
    @Operation(summary = "delete")
    @Delete(value = "nospec", produces = MediaType.TEXT_PLAIN)
    String deleteNotSpecifiedMediaType() {
        log.info("In deleteNotSpecifiedMediaType")
        "delete"
    }
}
