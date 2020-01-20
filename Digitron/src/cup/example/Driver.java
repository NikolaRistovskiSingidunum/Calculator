package cup.example;

import java_cup.runtime.*;

//class Driver {
//
//	private static View view;
//	
//	public static void main(String[] args) throws Exception {
//		
//		//java_cup.runtime.Scanner scanner = new java.cup
//		Parser parser = new Parser();
//		
//		//parser.
//		parser.parse();
//		
//		//parser.
//		System.out.println("EEEE");
//		
//		//System.out.println(Math.pow(2, 2));
//		
//		view = new View();
//		view.launch(args);
//		
//	}
//	
//}

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.Node;

public class Driver extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = FXMLLoader.load(getClass().getResource("view_document.fxml"));
			Scene scene = new Scene(root);
			//new Sce
			primaryStage.setScene(scene);
			primaryStage.show();
	
		} catch(Exception e) {
			e.printStackTrace();
			//System.out
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
	
}