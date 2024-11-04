import java.util.List;

public class UserActionHandler {
    private UserApp app;

    public UserActionHandler(UserApp app) {
        this.app = app;
    }

    public void handleAction(int option) {
        switch (option) {
            case 1:
                String name = app.getView().getUserInput();
                app.addUser(name);
                app.getView().showUserAdded();
                break;
            case 2:
                app.getView().displayUsers(app.getUsers());
                break;
            case 3:
                app.getView().showExitMessage();
                app.getView().closeScanner();
                break;
            default:
                app.getView().showInvalidOptionMessage();
                break;
        }
    }
}
