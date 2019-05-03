package io.pivotal.shinyay.feign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
@EnableFeignClients
@Controller
class FeignApplication(val greetingInterface: GreetingInterface) {

	@RequestMapping("/greeting")
	fun greeting(model: Model):String {
		model.addAttribute("greeting", greetingInterface.greeting())
		return "greeting-view"
	}
}

fun main(args: Array<String>) {
	runApplication<FeignApplication>(*args)
}
