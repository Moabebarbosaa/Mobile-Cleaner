package br.edu.ifpb.models;

public class User {

    private String name;
    private int id;
    private String login;
    private String pass;
    private Integer admin;
    private String notification;
    private String modelSmartphone;


    public User(String name, String login, String pass, String modelSmartphone) {
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.admin = 0;
        this.notification = "";
        this.modelSmartphone = modelSmartphone;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public Integer getAdmin() {
        return admin;
    }

    public String getNotification() {
        return notification;
    }

    public String getModelSmartphone() {
        return modelSmartphone;
    }
}