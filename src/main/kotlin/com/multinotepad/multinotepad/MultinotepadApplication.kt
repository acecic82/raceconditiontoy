package com.multinotepad.multinotepad

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude=[ DataSourceAutoConfiguration::class ])
class MultinotepadApplication

fun main(args: Array<String>) {
	runApplication<MultinotepadApplication>(*args)
}
