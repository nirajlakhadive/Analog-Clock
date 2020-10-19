package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AnalogClock extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Circle cir = new Circle(100,100, 100);
		
		cir.setTranslateX(150);
		cir.setTranslateY(150);
		cir.setFill(Color.DARKCYAN);
		cir.setStroke(Color.BEIGE);
//		cir.getOnTouchStationary();
		
		Group root = new Group();
		Scene scene = new Scene(root,500,500);
		root.getChildren().addAll(cir);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Analog Clock");
		primaryStage.show();
			
		
	}
	

}
