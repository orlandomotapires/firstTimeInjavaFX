package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML
	private Button btTest2;
	
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Lindo, as egrilos amam!", null, "So vi verdades!", AlertType.CONFIRMATION);
	}
	
	@FXML
	public void onBtTest2Action() {
		Alerts.showAlert("Tão Linduuu", null, "Não, ele não é lindo. Ele é maravilhoso!", AlertType.ERROR);
	}
}
