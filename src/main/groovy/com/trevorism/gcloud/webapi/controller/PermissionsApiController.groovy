package com.trevorism.gcloud.webapi.controller

import com.trevorism.secure.Permissions
import com.trevorism.secure.Roles
import com.trevorism.secure.Secure
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag

@Controller("/permission")
class PermissionsApiController {

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Internal")
    @Get(value = "internal", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, allowInternal = true)
    def getInternal() {
        "{\"secure\": \"internal\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "System level permissions")
    @Get(value = "system", produces = MediaType.APPLICATION_JSON)
    @Secure(Roles.SYSTEM)
    String getSystem() {
        "{\"secure\": \"system\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Admin level permissions")
    @Get(value = "admin", produces = MediaType.APPLICATION_JSON)
    @Secure(Roles.ADMIN)
    String getAdmin() {
        "{\"secure\": \"admin\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Tenant Admin level permissions")
    @Get(value = "tenant", produces = MediaType.APPLICATION_JSON)
    @Secure(Roles.TENANT_ADMIN)
    String getTenant() {
        "{\"secure\": \"tenant\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Create permissions")
    @Get(value = "create", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, permissions = Permissions.CREATE)
    String getCreate() {
        "{\"secure\": \"create\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Read permissions")
    @Get(value = "read", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, permissions = Permissions.READ)
    String getRead() {
        "{\"secure\": \"read\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Update permissions")
    @Get(value = "update", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, permissions = Permissions.UPDATE)
    String getUpdate() {
        "{\"secure\": \"update\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Delete permissions")
    @Get(value = "delete", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, permissions = Permissions.DELETE)
    String getDelete() {
        "{\"secure\": \"delete\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Execute permissions")
    @Get(value = "execute", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, permissions = Permissions.EXECUTE)
    String getExecute() {
        "{\"secure\": \"execute\"}"
    }

    @Tag(name = "Advanced Permissions Operations")
    @Operation(summary = "Any permissions")
    @Get(value = "any", produces = MediaType.APPLICATION_JSON)
    @Secure(value = Roles.USER, permissions = "CRUDE")
    String getAny() {
        "{\"secure\": \"any\"}"
    }
}
