package com.tk.lister.dao.mongo;

import com.tk.lister.model.ListItemStatus;
import com.tk.lister.model.ListerList;
import com.tk.lister.model.ListerListItem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

/**
 * Created by Todd on 7/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoConfiguration.class, loader=AnnotationConfigContextLoader.class)
public class ListRepositoryTest {

    Logger logger = LoggerFactory.getLogger(ListRepositoryTest.class);
    public static final String NAME = "Test List";

    @Autowired
    private ListRepository listRepository;

    @Test
    public void testSaveList()
    {
        ListerList list = new ListerList();
        list.setName(NAME);
        list.setCategory("Test Category");
        for (int i=0; i<5; i++)
        {
            ListerListItem listItem = new ListerListItem();
            listItem.setName("Name" + i);
            listItem.setStatus(ListItemStatus.NEW);
            list.getListItems().add(listItem);
        }
        listRepository.save(list);

        ListerList found = listRepository.findByName(NAME);
        Assert.assertNotNull(found);

        listRepository.delete(found);

        found = listRepository.findByName(NAME);
        Assert.assertNull(found);

    }


}
