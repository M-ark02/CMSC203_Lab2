package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXDriver extends Application {	
	@Override
	public void start(Stage primaryStage) {
		
		FXMainPane root = new FXMainPane();
		
		Scene scene = new Scene(root, 500, 200);
		
		primaryStage.setTitle("Lab 2 GUI 'Hello'");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
		launch(args);
	}
	
}
