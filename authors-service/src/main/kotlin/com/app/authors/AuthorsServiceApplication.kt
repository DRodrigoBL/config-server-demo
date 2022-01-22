package com.app.authors

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthorsServiceApplication

fun main(args: Array<String>) {
	runApplication<AuthorsServiceApplication>(*args)
}
