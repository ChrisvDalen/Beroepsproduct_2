package applicatieCode;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import menuToevoegingen.MyMenu;

public class Main extends Application {

	private Color bg;

	public static void main(String[] args) {
		launch(args);

	}

	public Main() {
//	bg = Color.web("0x0000FF",0.7);
		bg = Color.WHITESMOKE;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		StackPane root = new StackPane();
		root.setPrefSize(700, 700);
		MenuBar menubar = new MyMenu(root);
		VBox vbox = new VBox(menubar, root);

		Scene scene = new Scene(vbox, 700, 700);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		vbox.setBackground(new Background(new BackgroundFill(bg, CornerRadii.EMPTY, Insets.EMPTY)));
		primaryStage.setScene(scene);
		primaryStage.setTitle("Beroepsproduct-2 Overheid Data");
		primaryStage.show();
		

	}

}
