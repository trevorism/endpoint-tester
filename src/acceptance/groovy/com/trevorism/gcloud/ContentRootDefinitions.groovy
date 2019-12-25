package com.trevorism.gcloud

/**
 * @author tbrooks
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(/the endpoint-tester application is alive/) {  ->
    try{
        new URL("http://endpoint-tester.endpoint-tester.trevorism.com/ping").text
    }
    catch (Exception ignored){
        Thread.sleep(10000)
        new URL("http://endpoint-tester.endpoint-tester.trevorism.com/ping").text
    }
}

When(/I navigate to {word}/) { String url ->
    contextRootContent = new URL(url).text
}

When(/I navigate to \\/ping on {word}/) { String url ->
    pingContent = new URL("${url}/ping").text
}

Then(/the API returns a link to the help page/) {  ->
    assert contextRootContent
    assert contextRootContent.contains("/help")
}

Then(/pong is returned, to indicate the service is alive/) {  ->
    assert pingContent == "pong"
}