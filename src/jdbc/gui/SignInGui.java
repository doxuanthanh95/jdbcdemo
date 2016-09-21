package jdbc.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignInGui {
	private Stage stage;
	private Scene scene;
	
	public SignInGui(){
		try {
			this.stage = new Stage();
			this.stage.setTitle("Sign In");
			Parent root = FXMLLoader.load(getClass().getResource("JdbcGui.fxml"));
			this.scene = new Scene(root);
			this.stage.setScene(this.scene);
			//this.stage.setResizable(false);
			this.stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
