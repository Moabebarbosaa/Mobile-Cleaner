package br.edu.ifpb.ActionDashboard.AdapterSend;

public class BaseTIM {

    // Simular API
    public String textsTIM(String login, String message){

        String output = "";

        output += "SMS enviado!\n\n";
        output += "\nLogin: " + login;
        output += "\nMensagem: " + message;

        return output;
    }
}
