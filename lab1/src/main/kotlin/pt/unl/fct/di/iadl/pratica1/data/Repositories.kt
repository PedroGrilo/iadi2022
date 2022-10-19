package pt.unl.fct.di.iadl.pratica1.data

import org.springframework.data.repository.CrudRepository
import java.util.*

interface UsersRepository: CrudRepository<UserDAO, Long>{
    fun findByName(name:String): Optional<UserDAO>
}