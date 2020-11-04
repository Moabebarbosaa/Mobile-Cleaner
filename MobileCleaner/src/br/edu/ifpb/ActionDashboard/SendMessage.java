package br.edu.ifpb.ActionDashboard;

import br.edu.ifpb.Model.User.UserManager;

public class SendMessage {

    UserManager userManager;


    public SendMessage(UserManager userManager) {
        this.userManager = userManager;
    }

    public boolean send(String login, String message) {
        return this.userManager.sendMenssage(login, message);
    }
}
