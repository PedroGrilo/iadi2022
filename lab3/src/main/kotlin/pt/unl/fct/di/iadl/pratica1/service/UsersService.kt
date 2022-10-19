package pt.unl.fct.di.iadl.pratica1.service

import org.springframework.stereotype.Service
import pt.unl.fct.di.iadl.pratica1.data.UserDAO
import pt.unl.fct.di.iadl.pratica1.data.UsersRepository
import pt.unl.fct.di.iadl.pratica1.domain.UserDomain
import java.security.InvalidParameterException

@Service
class UsersService(val userDomain: UserDomain, val users:UsersRepository) {

    //val users:MutableList<String> = mutableListOf("Joao")

    fun exists(name: String): Boolean = users.findByName(name).isPresent

    fun addUser(name: String) = if(userDomain.validUsername(name))
        users.save(
            UserDAO(0,name))
    else
        throw InvalidParameterException("${name} is invalid")
}