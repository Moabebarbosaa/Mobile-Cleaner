package br.edu.ifpb.Model.User;

import java.sql.Date;

public interface IUser {

    public Integer getId();

    public void setId(Integer id);

    public String getDateSingUp();

    public void setDateSingUp(String dateSingUp);

    public String getName();

    public void setName(String name);

    public String getLogin();

    public void setLogin(String login);

    public String getPass();

    public void setPass(String pass);

    public String getPermission();

    public void setPermission(String permission);

    public String getNotification();

    public void setNotification(String notification);

    public String getModelSmartphone();

    public void setModelSmartphone(String modelSmartphone);

}