package pt.unl.fct.di.iadl.pratica1.application

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import pt.unl.fct.di.iadl.pratica1.service.UsersService

@Service
class HelloApplication(val users: UsersService) {
    fun generalGreeting() = "Hello, World!"

    fun customGreeting(name:String) =
        if(users.exists(name)) "Hello, ${name}"
        else "Hello, stranger"
}