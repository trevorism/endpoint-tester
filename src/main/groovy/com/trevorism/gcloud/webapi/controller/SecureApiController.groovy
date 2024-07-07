package com.trevorism.gcloud.webapi.controller

import com.trevorism.secure.Roles
import com.trevorism.secure.Secure
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag


@Controller("/secure")
class SecureApiController {

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Json get")
    @Get(value = "json", produces = MediaType.APPLICATION_JSON)
    @Secure(Roles.USER)
    String getJson() {
        "{\"secure\": \"hello json\"}"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "XML get")
    @Get(value = "xml", produces = MediaType.TEXT_XML)
    @Secure(Roles.USER)
    String getXml() {
        "<hello> secure </hello>"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Text get")
    @Get(value = "nospec", produces = MediaType.TEXT_PLAIN)
    @Secure(Roles.USER)
    String getNotSpecifiedMediaType() {
        "secure hello"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Json creation")
    @Post(value = "json", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    @Secure(Roles.USER)
    def createJson(@Body def json) {
        json
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "XML creation")
    @Post(value = "xml", produces = MediaType.TEXT_XML, consumes = MediaType.TEXT_XML)
    @Secure(Roles.USER)
    def createXml(@Body def xml) {
        xml
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Text creation")
    @Post(value = "nospec", produces = MediaType.TEXT_PLAIN, consumes = MediaType.TEXT_PLAIN)
    @Secure(Roles.USER)
    def create(@Body def data) {
        data
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Json update")
    @Put(value = "json", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    @Secure(Roles.USER)
    def updateJson(@Body def json) {
        json
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "XML update")
    @Put(value = "xml", produces = MediaType.TEXT_XML, consumes = MediaType.TEXT_XML)
    @Secure(Roles.USER)
    def updateXml(@Body def xml) {
        xml
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Text update")
    @Secure(Roles.USER)
    @Put(value = "nospec", produces = MediaType.TEXT_PLAIN, consumes = MediaType.TEXT_PLAIN)
    def update(@Body def data) {
        data
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Json delete")
    @Delete(value = "json", produces = MediaType.APPLICATION_JSON)
    @Secure(Roles.USER)
    String deleteJson() {
        "{\"secure\": \"delete json\"}"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "XML delete")
    @Delete(value = "xml", produces = MediaType.TEXT_XML)
    @Secure(Roles.USER)
    String deleteXml() {
        "<delete> secure </delete>"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Text delete")
    @Delete(value = "nospec", produces = MediaType.TEXT_PLAIN)
    @Secure(Roles.USER)
    String deleteNotSpecifiedMediaType() {
        "secure delete"
    }

}
