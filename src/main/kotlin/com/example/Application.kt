package com.example

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	build()
		.eagerInitSingletons(false) // setting this to true causes an error starting the Micronaut server
	    .args(*args)
		.packages("com.example")
		.start()
}

