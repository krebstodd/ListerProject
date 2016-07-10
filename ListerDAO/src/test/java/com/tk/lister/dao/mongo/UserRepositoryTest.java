package com.tk.lister.dao.mongo;

import com.tk.lister.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Created by Todd on 7/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoConfiguration.class, loader=AnnotationConfigContextLoader.class)
public class UserRepositoryTest {

    Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    public static final String NAME = "Titus";
    public static final String USERNAME = "neoBob";

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserSave()
    {
        User user = new User();
        user.setUsername(USERNAME);
        user.setName(NAME);
        user.setAge(20);
        user.setStatus("Active");
        Assert.assertNotNull(user);

        logger.debug("Before save User -> " + user);
        Assert.assertNull(user.getId());
        userRepository.save(user);
        Assert.assertNotNull(user.getId());
        logger.debug("Post save User -> " + user);

        User found = userRepository.findByName(NAME);
        Assert.assertNotNull(found);
        logger.debug("User found -> " + found);

        userRepository.delete(found);
        found = userRepository.findByName(NAME);
        Assert.assertNull(found);
        logger.debug("User successfully deleted.");
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
