package br.edu.ifpb.models;

import java.util.Date;

public class User {

    private String name;
    private Integer id;
    private String login;
    private String pass;
    private Integer admin;
    private String notification;
    private String modelSmartphone;
    private Date dateSingUp;


    public User(String name, String login, String pass, String modelSmartphone) {
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.admin = 0;
        this.notification = "";
        this.modelSmartphone = modelSmartphone;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getModelSmartphone() {
        return modelSmartphone;
    }

    public void setModelSmartphone(String modelSmartphone) {
        this.modelSmartphone = modelSmartphone;
    }

    public Date getDateSingUp() {
        return dateSingUp;
    }

    public void setDateSingUp(Date dateSingUp) {
        this.dateSingUp = dateSingUp;
    }

    @Override
    public String toString() {
        return  "ID: " + id + "   " +
                "Login: " + login + "\n";
    }
}