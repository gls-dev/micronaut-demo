package com.example.handler

import io.micronaut.context.exceptions.BeanInstantiationException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SampleRequestHandlerTest {

    @Test
    fun shouldTestApplicationContextFails() {
        assertThrows<BeanInstantiationException> { SampleRequestHandler() }
    }
}