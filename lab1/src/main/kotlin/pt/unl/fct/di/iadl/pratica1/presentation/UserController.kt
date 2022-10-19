package pt.unl.fct.di.iadl.pratica1.presentation

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import pt.unl.fct.di.iadl.pratica1.service.UsersService
import java.security.InvalidParameterException

data class AddUserDTO(val name:String)

@RestController
@RequestMapping("api/users")
class UserController(val users: UsersService) {
    @PostMapping
    fun addUser(@RequestBody req:AddUserDTO) = users.addUser(req.name)

    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidParameterException::class)
    fun badRequest(){}
}