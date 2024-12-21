package com.trevorism.model

import com.fasterxml.jackson.annotation.JsonFormat

class TestSuite {
    String id
    String name
    String kind
    String source

    boolean lastRunSuccess
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    Date lastRunDate
    long lastRuntimeSeconds
}
