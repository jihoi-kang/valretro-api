package io.valretro

import io.valretro.config.property.EnvConfigProperty
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(EnvConfigProperty::class)
class ValretroApplication

fun main(args: Array<String>) {
    runApplication<ValretroApplication>(*args)
}
