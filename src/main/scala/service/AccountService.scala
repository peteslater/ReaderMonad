package scala

import cats.data.Reader

import config.ApplicationConfig
import model.{Account,User}
import repository.AccountRepository

trait AccountService {
    def getAccount(user: User): Reader[AccountRepository,Account]
}

class RealAccountService extends AccountService {
    def getAccount(user: User): Reader[AccountRepository,Account] = Reader[AccountRepository,Account] { accountRepository =>
        accountRepository.getAccount(user)
    }
}