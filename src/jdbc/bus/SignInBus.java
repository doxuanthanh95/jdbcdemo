package jdbc.bus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdbc.dao.SignInDao;
import jdbc.gui.SinhVienGUI;

public class SignInBus {
	@FXML private Text actiontarget;
	@FXML private TextField tfUserName;
	@FXML private TextField tfPassword;
	@FXML private Button btnSignIn;
    
    @FXML protected void signIn(ActionEvent event) {
        //actiontarget.setText("Sign in button pressed");
    	String userName = this.tfUserName.getText();
    	String password = this.tfPassword.getText();
    	if(SignInDao.getUserFromDB(userName, password)){
    		//this.actiontarget.setText("Sign in successful!");
    		Stage stage = (Stage) this.btnSignIn.getScene().getWindow();
    		stage.close();
    		new SinhVienGUI();
    	}
    	else{
    		this.actiontarget.setText("Sign in failed!");
    	}
    	
    }    
}
