package pt.unl.fct.di.iadl.pratica1.domain

import org.springframework.stereotype.Service

@Service
class UserDomain {
    fun validUsername(name:String) = name.length > 2
}