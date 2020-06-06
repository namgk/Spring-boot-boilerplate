package kyng.work.boilerplate.repository

import kyng.work.boilerplate.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface UserRepo : CrudRepository<User, Long> {
    fun findByNameContaining(name: String): List<User>
    fun findByEmail(email: String): User?
}
