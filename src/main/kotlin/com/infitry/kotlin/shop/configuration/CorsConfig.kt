package com.infitry.kotlin.shop.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import java.util.List


@Configuration
class CorsConfig {
    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val configuration = CorsConfiguration()
        configuration.allowedOrigins = List.of("http://localhost:3000") // TODO 알맞게 변경
        configuration.allowedMethods = List.of("HEAD", "GET", "POST", "PUT")
        configuration.allowedHeaders = List.of("*")
        configuration.allowCredentials = true
        configuration.maxAge = 3600L
        val configurationSource = UrlBasedCorsConfigurationSource()
        configurationSource.registerCorsConfiguration("/**", configuration)
        return configurationSource
    }
}