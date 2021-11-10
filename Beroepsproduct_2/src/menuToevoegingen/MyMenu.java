
package menuToevoegingen;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MyMenu extends MenuBar {

	private Menu mPagina1,mPagina2, mHomePage;
	private MenuItem miPagina1,miPagina2, miHomePage;

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

		mPagina1 = new Menu("Pagina-1");
		miPagina1 = new MenuItem("Pagina-1");
		mPagina1.getItems().add(miPagina1);
		miPagina1.setOnAction(event -> {
			root.getChildren().clear();
			root.getChildren().add(new Pagina1());
		});
		
		mPagina2 = new Menu("Pagina-2");
		miPagina2 = new MenuItem("Pagina-2");
		mPagina2.getItems().add(miPagina2);
		miPagina2.setOnAction(event -> {
			root.getChildren().clear();
			root.getChildren().add(new Pagina2());
		});
		
		
		
		
		this.getMenus().addAll(mHomePage,mPagina1,mPagina2);
	}

}
