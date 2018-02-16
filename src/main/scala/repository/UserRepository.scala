package repository

import model.User

trait UserRepository {
    def getUser(id: String): User
}

class RealUserRepository extends UserRepository {
    def getUser(id: String): User = User("00001", "Pete", "Slater")
}