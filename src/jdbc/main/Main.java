package jdbc.main;
	
import javafx.application.Application;
import javafx.stage.Stage;
import jdbc.gui.SignInGui;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		new SignInGui();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
