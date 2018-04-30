// Almicke "Mickey" Navarro
// CST105
// Date:Apr 28, 2018
// This is my own work.

package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ColorAndFont extends Application {
	@Override
	public void start(Stage primaryStage) {
		//create a new pane
		GridPane pane = new GridPane();
		//position to center
		pane.setAlignment(Pos.CENTER);
		//create a new label 
		Label[] text = new Label[5];
		//loop to add text to label 
		for (int i = 0; i < text.length; i++) {
			text[i] = new Label("Java");
			text[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,22));
			text[i].setTextFill(getRandomColor());
			text[i].setRotate(90);
			
			pane.add(text[i], i, 0);
		}
		//create a new scene 
		Scene scene = new Scene(pane, 250, 100);
		primaryStage.setTitle("Exercise 4: Color and Font");
		primaryStage.setScene(scene);
		//output
		primaryStage.show();
	}

	private Color getRandomColor() {
		return new Color(Math.random(), Math.random(), Math.random(), Math.random());
		
	}
	public static void main(String[] args) {
		//output
		Application.launch(args);
	}
}