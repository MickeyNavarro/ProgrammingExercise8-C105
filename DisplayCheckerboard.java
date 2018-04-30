//Almicke "Mickey" Navarro
//CST105
//Date:Apr 28, 2018
//This is my own work.
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class DisplayCheckerboard extends Application{
	@Override
	public void start(Stage primaryStage) {
		//create a new pane
		Pane pane = new Pane();

		//LOOPS: creates the first 2 rows of the checkerboard 
		//loop to create 8 black tiles 
		for(int black = 0; black < 8; black++) {
			//loop to create 8 white tiles 
			for (int white = 0; white < 8; white++) {
				//creates a new rectangle with the tiles we created
				//---sets the size of each tile to create a square tile
				Rectangle rec = new Rectangle(50 * white, 50 * black, 30, 50);
				//fills the colors of the tile respectively with either black or white
				if (black % 2 == white % 2) {
					rec.setFill(Color.BLACK);
				}
				else {
					rec.setFill(Color.WHITE);
				}
				//adds rectangle to pane
				pane.getChildren().add(rec);
			}
		}
		//create a new scene
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise 6: Display a Checkerboard");
		primaryStage.setScene(scene);
		primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(400);
		primaryStage.show();
	}
	public static void main(String[] args) {
		//output
		launch(args);
	}
}
