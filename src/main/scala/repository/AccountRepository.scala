package repository

import model.{Account,User}

trait AccountRepository {
    def getAccount(user: User): Account
}

class RealAccountRepository extends AccountRepository {
    def getAccount(user: User): Account = Account("Real Account", user)
}