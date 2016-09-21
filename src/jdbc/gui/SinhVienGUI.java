package jdbc.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SinhVienGUI {
	private Stage stage;
	private Scene scene;
	public SinhVienGUI() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("SinhVienGUI.fxml"));
			this.scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("SinhVienGUI.css").toExternalForm());
			this.stage = new Stage();
			this.stage.setTitle("JavaFx fxml Demo");
			this.stage.setScene(scene);
			this.stage.setResizable(false);
			this.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
