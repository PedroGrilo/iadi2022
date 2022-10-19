package pt.unl.fct.di.iadl.pratica1.data


import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserDAO(@Id val id:Long, val name:String)

