package config

import repository.{AccountRepository,UserRepository}

final case class ApplicationConfig(accountRepository: AccountRepository, userRepository: UserRepository)