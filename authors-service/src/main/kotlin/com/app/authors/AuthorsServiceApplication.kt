package com.app.authors

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AuthorsServiceApplication

fun main(args: Array<String>) {
	runApplication<AuthorsServiceApplication>(*args)
}


@RestController
@RefreshScope
class MyController(@Value("\${authors.platform-classification.gold:oreilly-default}") val goldAuthors: String){

	@GetMapping("/api/authors/gold")
	fun retrieveGoldAuthros(): String{
		return goldAuthors
	}

}