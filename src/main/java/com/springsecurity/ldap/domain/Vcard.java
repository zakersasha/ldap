package com.springsecurity.ldap.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
@ToString(of = {"login", "last_name", "first_name", "second_name", "masked_pan", "state", "created", "iden", "description",})
@EqualsAndHashCode(of = {"login"})
public class Vcard {
    @Id
    private Long login;
    private String last_name;
    private String first_name;
    private String second_name;
    private String masked_pan;
    private String state;
    private Date created;
    private String iden;

    public Long getLogin() {

        return login;
    }

    public void setLogin(Long login) {
        this.login = login;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getMasked_pan() {
        return masked_pan;
    }

    public void setMasked_pan(String masked_pan) {
        this.masked_pan = masked_pan;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }
}