package service

import cats.data.Reader

import config.ApplicationConfig
import model.User
import repository.UserRepository

trait UserService {
  def getUser(id: String): Reader[UserRepository,User]
}

class RealUserService extends UserService {
  def getUser(id: String): Reader[UserRepository,User] = Reader[UserRepository,User] { userRepository =>
    userRepository.getUser(id)
  }
}
