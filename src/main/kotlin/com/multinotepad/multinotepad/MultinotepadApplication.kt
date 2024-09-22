package com.multinotepad.multinotepad

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultinotepadApplication

fun main(args: Array<String>) {
	runApplication<MultinotepadApplication>(*args)
}
