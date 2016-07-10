package com.tk.lister.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Todd on 7/10/2016.
 */
public class ListerListItem {

    @Id
    private String id;
    private String name;
    private ListItemStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListItemStatus getStatus() {
        return status;
    }

    public void setStatus(ListItemStatus status) {
        this.status = status;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
