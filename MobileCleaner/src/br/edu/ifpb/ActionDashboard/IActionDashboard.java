package br.edu.ifpb.ActionDashboard;

import br.edu.ifpb.Model.CleanPlace.CleanPlaceManager;
import br.edu.ifpb.Model.User.UserManager;

public interface IActionDashboard {

    public UserList showUserList(UserManager userManager);

    public SendMessage sendMessage(UserManager userManager);

    public void listUserBehind(UserManager userManager);

    public void performCleaning(UserManager userManager);

    public void nextClean(UserManager userManager);

    public VerifyNotification verifyNotification(UserManager userManager);

    public PlacesClean placesClean(CleanPlaceManager cleanPlaceManager);

    public AddCleanPlace addCleanPlace(CleanPlaceManager cleanPlaceManager);

}
