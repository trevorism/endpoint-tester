package com.trevorism.model

import com.fasterxml.jackson.annotation.JsonFormat

class TestSuite {
    String id
    String name
    String kind
    String source

    boolean lastRunSuccess
    Date lastRunDate
    long lastRuntimeSeconds
}
