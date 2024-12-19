package io.valretro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ValretroApplication

fun main(args: Array<String>) {
    runApplication<ValretroApplication>(*args)
}
