package com.example.config

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class CarFactoryTest {

    @Inject
    lateinit var cars: List<Car>

    @Test
    fun shouldTestCarFactory() {
        Assertions.assertEquals(1, cars.size)
        Assertions.assertEquals("ford", cars.first().getName())
        Assertions.assertEquals(8, cars.first().getCylinders())
    }
}