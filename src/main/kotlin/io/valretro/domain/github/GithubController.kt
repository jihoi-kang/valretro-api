package io.valretro.domain.test

import io.valretro.config.property.EnvConfigProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    val envConfig: EnvConfigProperty,
) {

    @GetMapping("/test")
    fun test(): String {
        return envConfig.github.token
    }

}