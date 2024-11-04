public class Main {
    public static void main(String[] args) {
        // 1. Initialize the Model with initial data
        DataModel model = new DataModel("Initial Data");

        // 2. Initialize the View
        ConsoleView view = new ConsoleView();

        // 3. Initialize the Presenter with the Model and View
        DataPresenter presenter = new DataPresenter(model, view);

        // 4. Display initial data and prompt for new data, updating the model
        presenter.updateData();

        // 5. Perform additional operations
        System.out.println("Performing more operations...");

        // 6. Collect more data, append it to existing data, and display final result
        presenter.addMoreData();
    }
}
