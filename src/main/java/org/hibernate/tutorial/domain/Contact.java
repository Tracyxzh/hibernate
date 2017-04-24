package org.hibernate.tutorial.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xzh on 2017/4/21.
 */
@Entity(name = "Contact")
public class Contact {
    @Id
    private int id;
    private Name name;
    private String note;
    private boolean starred;
    private String website;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
