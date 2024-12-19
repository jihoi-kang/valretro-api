package io.valretro.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("valretro")
data class AppConfig(
    val github: GithubConfig,
)

data class GithubConfig(
    val token: String,
)