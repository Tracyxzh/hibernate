package org.hibernate.tutorial.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by xzh on 2017/4/21.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;

    private String lastname;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "cell_phone")
    private String cellPhone;

    public Employee(String firstname, String lastname, Date birthDate, String cellPhone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.cellPhone = cellPhone;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
