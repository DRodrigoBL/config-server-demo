package com.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class AppServiceDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<AppServiceDiscoveryApplication>(*args)
}
