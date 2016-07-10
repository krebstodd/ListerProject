package com.tk.lister.dao.mongo;

import com.tk.lister.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Todd on 7/10/2016.
 */
public interface UserRepository extends MongoRepository<User, String>{

    User findByName(String name);
}
