package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML
	private Button btTest2;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("So vi verdades!");
	}
	
	@FXML
	public void onBtTest2Action() {
		System.out.println("Não, ele não é lindo. Ele é maravilhoso!");
	}
}
