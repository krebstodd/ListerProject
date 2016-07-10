package com.tk.lister.dao.mongo;

import com.tk.lister.model.ListerList;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Todd on 7/10/2016.
 */
public interface ListRepository extends MongoRepository<ListerList, String> {

    ListerList findByName(String name);

}
