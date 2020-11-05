package br.edu.ifpb.Model.User;


public class User implements IUser{

    private int id;
    private String name;
    private String login;
    private String pass;
    private String permission;
    private String notification;
    private String modelSmartphone;
    private String dateSingUp;
    private String dateNextClean;

    public User(String name, String login, String pass, String modelSmartphone) {
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.modelSmartphone = modelSmartphone;
    }

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public User() {
    }


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getDateSingUp() {
        return dateSingUp;
    }

    @Override
    public void setDateSingUp(String dateSingUp) {
        this.dateSingUp = dateSingUp;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String getPermission() {
        return permission;
    }

    @Override
    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String getNotification() {
        return notification;
    }

    @Override
    public void setNotification(String notification) {
        this.notification = notification;
    }

    @Override
    public String getModelSmartphone() {
        return modelSmartphone;
    }

    @Override
    public void setModelSmartphone(String modelSmartphone) {
        this.modelSmartphone = modelSmartphone;
    }

    @Override
    public String toString() {
        return  "ID: " + id + "   " + "Login: " + login;
    }
}
