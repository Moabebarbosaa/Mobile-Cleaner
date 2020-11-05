package br.edu.ifpb.ActionDashboard;

import br.edu.ifpb.Model.CleanPlace.CleanPlaceManager;
import br.edu.ifpb.Model.User.UserManager;

public class ActionDashboardFactory implements IActionDashboard{

    UserManager userManager;

    public ActionDashboardFactory(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public UserList showUserList(UserManager userManager) {
        return new UserList(userManager);
    }

    @Override
    public SendMessage sendMessage(UserManager userManager) {
        return new SendMessage(userManager);
    }

    @Override
    public void listUserBehind(UserManager userManager) {

    }

    @Override
    public CleanUp cleanUp(UserManager userManager) {
        return new CleanUp(userManager);
    }

    @Override
    public void nextClean(UserManager userManager) {

    }

    @Override
    public VerifyNotification verifyNotification(UserManager userManager) {
        return new VerifyNotification(userManager);
    }

    @Override
    public PlacesClean placesClean(CleanPlaceManager cleanPlaceManager) {
        return new PlacesClean(cleanPlaceManager);
    }

    @Override
    public AddCleanPlace addCleanPlace(CleanPlaceManager cleanPlaceManager) {
        return new AddCleanPlace(cleanPlaceManager);
    }
}
