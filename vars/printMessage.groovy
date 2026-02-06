#!/usr/bin/env groovy

def call(message, body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo """
>>> [${message}]"""

    return this
}