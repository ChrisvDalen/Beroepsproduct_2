
package menuToevoegingen;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MyMenu extends MenuBar {

	private Menu mPagina1,mPagina2, mHomePage, mPagina3;
	private MenuItem miPagina1,miPagina2, miHomePage, miPagina3;

	private Pane root;

	public MyMenu(Pane root) {
		this.root = root;
		
		mHomePage = new Menu("Home");
		miHomePage = new MenuItem("Home");
		mHomePage.getItems().add(miHomePage);
		miHomePage.setOnAction(event -> {
			root.getChildren().clear();
			root.getChildren().add(new HomePage());
		});

		mPagina1 = new Menu("Auto");
		miPagina1 = new MenuItem("Auto");
		mPagina1.getItems().add(miPagina1);
		miPagina1.setOnAction(event -> {
			root.getChildren().clear();
			root.getChildren().add(new Auto());
		});
		
		mPagina2 = new Menu("Eigenaar");
		miPagina2 = new MenuItem("Eigenaar");
		mPagina2.getItems().add(miPagina2);
		miPagina2.setOnAction(event -> {
			root.getChildren().clear();
			root.getChildren().add(new Eigenaar());
		});
		
		mPagina3 = new Menu("Overzicht");
		miPagina3 = new MenuItem("Overzicht");
		mPagina3.getItems().add(miPagina3);
		miPagina3.setOnAction(event -> {
			root.getChildren().clear();
			root.getChildren().add(new Overzicht());
		});
		
		
		
		
		
		this.getMenus().addAll(mHomePage,mPagina1,mPagina2, mPagina3);
	}

}
