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
    @Operation(summary = "Json response")
    @Get(value = "json", produces = io.micronaut.http.MediaType.APPLICATION_JSON)
    @Secure(Roles.USER)
    String getJson() {
        "secure hello json"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "XML response")
    @Get(value = "xml", produces = MediaType.TEXT_XML)
    @Secure(Roles.USER)
    String getXml() {
        "secure hello xml"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "A response")
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
    @Operation(summary = "Creation")
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
    @Operation(summary = "Update")
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
        "secure delete json"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "XML delete")
    @Delete(value = "xml", produces = MediaType.TEXT_XML)
    @Secure(Roles.USER)
    String deleteXml() {
        "secure delete xml"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "delete")
    @Delete(value = "nospec", produces = MediaType.TEXT_PLAIN)
    @Secure(Roles.USER)
    String deleteNotSpecifiedMediaType() {
        "secure delete"
    }

    @Tag(name = "Secure Endpoint Operations")
    @Operation(summary = "Internal")
    @Get(value = "internal", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, allowInternal = true)
    def getInternal() {
        "secure internal"
    }
}
