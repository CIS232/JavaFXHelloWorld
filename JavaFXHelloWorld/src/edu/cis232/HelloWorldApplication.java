package edu.cis232;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Load the FXML/Scenebuilder Layout file
		Parent parent = FXMLLoader.load(getClass().getResource("helloworld.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Display the window using the scene graph
		stage.setScene(scene);
		
		stage.show();
	}

}
