package com.cheflit.ems

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmsBackendApplication

fun main(args: Array<String>) {
	runApplication<EmsBackendApplication>(*args)
}
