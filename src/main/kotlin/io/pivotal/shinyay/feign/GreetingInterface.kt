package io.pivotal.shinyay.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("eureka-client")
interface GreetingInterface {

    @RequestMapping("/greeting")
    fun greeting(): String
}