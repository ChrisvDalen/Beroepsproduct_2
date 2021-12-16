package menuToevoegingen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import sqlConnectie.DBCPDataSource;

public class Eigenaar extends Pane {

	private Label lblEigenaarnaam, lblBSN;
	private Connection con;

	public Eigenaar() {
		
		getStyleClass().add("Eigenaar");
		
		lblEigenaarnaam = new Label("Deelnemernaam");
		lblEigenaarnaam.relocate(10, 10);

		lblBSN = new Label("Burgerservicenummer");
		lblBSN.relocate(10, 60);
		
		
		ChoiceBox<String> boxDeelnemernaam = new ChoiceBox<>();
		boxDeelnemernaam.setPrefWidth(200);
		boxDeelnemernaam.relocate(180, 5);
		try {
			con = DBCPDataSource.getConnection();
			Statement stat = con.createStatement();
			ResultSet result = stat.executeQuery("select deelnemernaam from eigenaar");
			while (result.next()) {
				String deelnemernaam = result.getString("deelnemernaam");
				boxDeelnemernaam.getItems().add(deelnemernaam);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		
		ChoiceBox<String> boxBSN = new ChoiceBox<>();
		boxBSN.setPrefWidth(200);
		boxBSN.relocate(180, 5);
		try {
			con = DBCPDataSource.getConnection();
			Statement stat = con.createStatement();
			ResultSet result = stat.executeQuery("select bsn from eigenaar");
			while (result.next()) {
				String bsn = result.getString("bsn");
				boxBSN.getItems().add(bsn);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}

		this.getChildren().addAll(lblEigenaarnaam, lblBSN, boxDeelnemernaam, boxBSN);
		
		
	}
	
	

}
