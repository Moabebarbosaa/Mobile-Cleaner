package br.edu.ifpb.models;

public class User {

    private String name;
    private int id;
    private String login;
    private String pass;
    private String modelSmartphone;
    private String companyName;



    public User(String name, String login, String pass, String modelSmartphone, String companyName) {
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.modelSmartphone = modelSmartphone;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getModelSmartphone() {
        return modelSmartphone;
    }

    public String getCompanyName() {
        return companyName;
    }

}

