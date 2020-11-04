package br.edu.ifpb.Model.User;

import java.sql.Date;

public class User {

    private int id;
    private String name;
    private String login;
    private String pass;
    private String permission;
    private String notification;
    private String modelSmartphone;
    private java.sql.Date dateSingUp;

    public User(String name, String login, String pass, String modelSmartphone) {
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.notification = "";
        this.modelSmartphone = modelSmartphone;
    }

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateSingUp() {
        return dateSingUp;
    }

    public void setDateSingUp(Date dateSingUp) {
        this.dateSingUp = dateSingUp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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


    @Override
    public String toString() {
        return  "ID: " + id + "   " + "Login: " + login;
    }
}
