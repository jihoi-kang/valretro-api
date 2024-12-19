package io.valretro.config.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding

@ConfigurationProperties("valretro")
data class EnvConfigProperty @ConstructorBinding constructor(
    val github: GithubConfigProperty,
)