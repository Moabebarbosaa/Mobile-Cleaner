package br.edu.ifpb.Model.User;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface IUser {

    public String setPermission();

    public String setNotification();

    public String setDateSingUp();

    public String setDateNextClean(String date, int days);

}