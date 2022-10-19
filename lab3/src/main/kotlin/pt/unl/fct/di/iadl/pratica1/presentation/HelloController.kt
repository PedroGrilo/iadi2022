package pt.unl.fct.di.iadl.pratica1.presentation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pt.unl.fct.di.iadl.pratica1.application.HelloApplication


@RestController
@RequestMapping("api")
class HelloController(val app: HelloApplication) {

    @GetMapping("hello")
    fun hello()= GreetingResponse("Hello World")

    @PostMapping("hello")
    fun helloPerson(@RequestBody req:GreetingRequest)  = GreetingResponse("Hello ${app.customGreeting(req.name)}")

}