package br.com.pandacontrol.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.pandacontrol.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
