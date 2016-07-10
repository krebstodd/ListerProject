package com.tk.lister.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todd on 7/10/2016.
 */
@Document(collection = "list")
public class ListerList {

    @Id
    private String id;
    private String user_id;
    private String name;
    private String category;
    private List<ListerListItem> listItems = new ArrayList<ListerListItem>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ListerListItem> getListItems() {
        return listItems;
    }

    public void setListItems(List<ListerListItem> listItems) {
        this.listItems = listItems;
    }
}
