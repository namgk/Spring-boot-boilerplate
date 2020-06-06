package kyng.work.boilerplate.service

import kyng.work.boilerplate.BoilerplateApplication
import kyng.work.boilerplate.repository.UserRepo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@ActiveProfiles(profiles = ["dev"])
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@RunWith(SpringRunner::class)
@SpringBootTest(classes = [BoilerplateApplication::class])
internal class UserServiceTest {
    @Autowired
    lateinit var userService: UserService

    @Autowired
    lateinit var userRepo: UserRepo

    @Test
    fun newUser() {
        val newUser = userService.newUser("new name")
        assertNotNull(newUser.id)

        val findingUser = userRepo.findByNameContaining("new")
        assertTrue(findingUser.isNotEmpty())
    }
}
