
package menuToevoegingen;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MyMenu extends MenuBar {

	private Menu mPagina1;
	private MenuItem miPagina1;

	private Pane root;

	public MyMenu(Pane root) {
		this.root = root;

		mPagina1 = new Menu("Pagina-1");
		miPagina1 = new MenuItem("Pagina-1");
		mPagina1.getItems().add(miPagina1);
		miPagina1.setOnAction(event -> {
			root.getChildren().clear();
			root.getChildren().add(new Pagina1());
		});

		this.getMenus().addAll(mPagina1);
	}

}
