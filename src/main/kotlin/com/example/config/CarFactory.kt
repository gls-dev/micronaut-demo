package com.example.config

import io.micronaut.context.annotation.EachBean
import io.micronaut.context.annotation.Factory
import io.micronaut.context.exceptions.DisabledBeanException

interface Car {
    fun getName(): String
    fun getCylinders(): Int
}

@Factory
class CarFactory {

    @EachBean(CarConfiguration::class)
    fun buildEngine(carConfiguration: CarConfiguration): Car? {
        return if (carConfiguration.enabled) {
            object : Car {
                override fun getName(): String {
                    return carConfiguration.name
                }
                override fun getCylinders(): Int {
                    return carConfiguration.cylinders!!
                }
            }
        } else {
            throw DisabledBeanException("Car configuration disabled")
        }
    }
}