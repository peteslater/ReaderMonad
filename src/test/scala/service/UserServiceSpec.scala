package service

import org.scalatest._

import config.ApplicationConfig
import model.User
import repository.{RealAccountRepository,UserRepository}

class UserServiceSpec extends FlatSpec with Matchers {

  class TestUserRepository extends UserRepository {
    def getUser(id: String): User = User("00002", "James", "Kirk")
  }

  "The UserService" should "find a user when getUser is called with a UserRepository" in {
    val userService = new RealUserService()
    val userRepository = new TestUserRepository()

    val user = userService.getUser("00002").run(userRepository)

    user.surname shouldBe "Kirk"
  }
}
