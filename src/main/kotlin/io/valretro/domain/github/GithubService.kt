package io.valretro.domain.github

import io.valretro.config.property.EnvConfigProperty
import okhttp3.OkHttpClient
import org.springframework.stereotype.Service

@Service
class GithubService(
    private val envConfigProperty: EnvConfigProperty,
    private val okHttpClient: OkHttpClient,
)