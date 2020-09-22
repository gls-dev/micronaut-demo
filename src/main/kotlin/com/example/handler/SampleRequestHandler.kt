package com.example.handler

import io.micronaut.context.ApplicationContextBuilder
import io.micronaut.function.aws.MicronautRequestHandler

class SampleRequestHandler: MicronautRequestHandler<String, Void>() {

    override fun execute(input: String?): Void {
        TODO("Not yet implemented")
    }

    // uncommenting this method has no effect on the outcome of the test
//    override fun newApplicationContextBuilder(): ApplicationContextBuilder {
//        val builder = super.newApplicationContextBuilder()
//        builder.eagerInitConfiguration(false)
//        builder.eagerInitSingletons(false)
//        return builder
//    }
}