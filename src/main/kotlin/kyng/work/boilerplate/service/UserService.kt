package kyng.work.boilerplate.service

import kyng.work.boilerplate.entity.User
import kyng.work.boilerplate.repository.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    lateinit var userRepo: UserRepo

    fun newUser(name: String) : User{
        return userRepo.save(User(name))
    }
}
