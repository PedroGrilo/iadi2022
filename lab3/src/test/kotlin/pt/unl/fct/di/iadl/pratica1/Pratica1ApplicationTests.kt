package pt.unl.fct.di.iadl.pratica1

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import pt.unl.fct.di.iadl.pratica1.service.UsersService


@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc

class Pratica1ApplicationTests {


    @Autowired
    lateinit var mvc: MockMvc

    @Autowired
    lateinit var mapper: ObjectMapper

    @MockBean
    lateinit var userService: UsersService

    companion object {
        const val helloURL = "/api/helloworld"

        const val greetingURL = "/api/hello"

    }


    @Test
    fun contextLoads() {
    }

    @Test
    fun `test HelloWorld`(){

    }

}
