package org.hibernate.tutorial.domain;

import javax.persistence.Embeddable;

/**
 * Created by xzh on 2017/4/21.
 */
@Embeddable
public class Name {
    private String first;
    private String middle;
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
