import java.util.ArrayList;
import java.util.List;

public class UserApp {
    private List<UserModel> users;
    private UserView view;
    private UserActionHandler actionHandler;

    public UserApp() {
        users = new ArrayList<>();
        view = new UserView();
        actionHandler = new UserActionHandler(this);
    }

    public void run() {
        while (true) {
            int option = view.displayMenu();
            actionHandler.handleAction(option);

            if (option == 3) {
                break;
            }
        }
    }

    public void addUser(String name) {
        users.add(new UserModel(name));
    }

    public List<UserModel> getUsers() {
        return users;
    }

    public UserView getView() {
        return view;
    }

    public static void main(String[] args) {
        UserApp app = new UserApp();
        app.run();
    }
}
