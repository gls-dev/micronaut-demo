package com.example.config

import io.micronaut.context.annotation.EachProperty
import io.micronaut.context.annotation.Parameter
import javax.validation.constraints.NotNull

@EachProperty("cars")
class CarConfiguration(@param:Parameter val name: String) {

    var enabled: Boolean = false
    @NotNull
    var cylinders: Int? = null
}