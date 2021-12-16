package menuToevoegingen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import sqlConnectie.DBCPDataSource;

public class Auto extends Pane {

	private ChoiceBox<String> boxKenteken;
	private Label lblKenteken, lblMerk, lblBSN;
	private Connection con;

	public Auto() {

		lblKenteken = new Label("Kenteken");
		lblKenteken.relocate(10, 10);

		lblMerk = new Label("Merk");
		lblMerk.relocate(10, 60);

		lblBSN = new Label("BSN");
		lblBSN.relocate(10, 110);

		ChoiceBox<String> boxKenteken = new ChoiceBox<>();
		boxKenteken.setPrefWidth(200);
		boxKenteken.relocate(180, 5);
		try {
			con = DBCPDataSource.getConnection();
			Statement stat = con.createStatement();
			ResultSet result = stat.executeQuery("select kenteken from auto");
			while (result.next()) {
				String kenteken = result.getString("kenteken");
				boxKenteken.getItems().add(kenteken);
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
		
		ChoiceBox<String> boxMerk = new ChoiceBox<>();
		boxKenteken.setPrefWidth(200);
		boxKenteken.relocate(180, 60);
		try {
			con = DBCPDataSource.getConnection();
			Statement stat = con.createStatement();
			ResultSet result = stat.executeQuery("select merk from auto");
			while (result.next()) {
				String merk = result.getString("merk");
				boxMerk.getItems().add(merk);
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
		boxKenteken.setPrefWidth(200);
		boxKenteken.relocate(180, 100);
		try {
			con = DBCPDataSource.getConnection();
			Statement stat = con.createStatement();
			ResultSet result = stat.executeQuery("select bsn from auto");
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
		

		this.getChildren().addAll(lblKenteken, boxKenteken, lblMerk, boxMerk, lblBSN, boxBSN);
	}

}
