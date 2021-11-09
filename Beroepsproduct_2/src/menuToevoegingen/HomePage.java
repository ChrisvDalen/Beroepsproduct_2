package menuToevoegingen;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;

public class HomePage extends StackPane {
	
	public HomePage() {
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 650, 650);
		
		Image img = new Image("C:\\Users\\chris\\git\\Beroepsproduct_2\\Beroepsproduct_2\\src/download1.png");
//		ImageView iv = new ImageView(img);
		BackgroundImage bImg = new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
		Background bGround = new Background(bImg);
		root.setBackground(bGround);
		

	}
	
	

}
