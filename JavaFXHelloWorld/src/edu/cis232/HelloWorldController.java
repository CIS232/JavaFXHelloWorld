package edu.cis232;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloWorldController {
	
	@FXML
	private Button button;
	
	@FXML
	private Label label;
	
	public void buttonClickListener(){
		label.setText("Hooray!");
	}
}
