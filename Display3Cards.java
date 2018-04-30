// Almicke "Mickey" Navarro
// CST105
// Date:Apr 28, 2018
// This is my own work.
package application;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Display3Cards extends Application{
	@Override
	
	public void start(Stage primaryStage) throws FileNotFoundException{
		//creates a new deck as an arraylist
		ArrayList<Integer> deck = new ArrayList<>();
		
		//adds 52 "cards" to the deck in place of an int
		for (int i = 1; i <= 52; i++) {
			deck.add(i);
		}
		//shuffle the deck of cards
		Collections.shuffle(deck);
		
		//create a new HBox
		HBox hbox = new HBox(10);
		
		//position to center 
		hbox.setAlignment(Pos.CENTER);
		
		//show the card images on the Hbox
		hbox.getChildren().add(new ImageView("Cards/" + deck.get(0) + ".png"));
		hbox.getChildren().add(new ImageView("Cards/" + deck.get(1) + ".png"));
		hbox.getChildren().add(new ImageView("Cards/" + deck.get(2) + ".png"));
		
		//create a new scene with the hbox
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("Exercise 3: Display 3 Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		//output
		launch(args);
	}
	}

