package br.edu.ifpb.ActionDashboard.AdapterSend;

public class BaseGmail {

    public String textsGmail(String login, String message){

        String output = "";

        output += "Email do Google enviado!\n\n";
        output += "\nLogin: " + login;
        output += "\nMensagem: " + message;

        return output;
    }
}
