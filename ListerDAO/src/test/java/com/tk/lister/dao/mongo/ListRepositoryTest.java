package com.tk.lister.dao.mongo;

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
public class ListRepositoryTest {

    Logger logger = LoggerFactory.getLogger(ListRepositoryTest.class);

    @Autowired
    private ListRepository listRepository;

    @Test
    public void testSaveList()
    {

    }


}
