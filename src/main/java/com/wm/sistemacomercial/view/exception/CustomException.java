package exception;

import gui.util.Alerts;
import javafx.scene.control.Alert.AlertType;

public class CustomException extends Exception{


	private static final long serialVersionUID = 1L;

	public CustomException(String msg, Exception e) {
//		System.out.println(msg);
//		System.out.println(e.getMessage());
//		System.out.println(e.getStackTrace());
//	     e.printStackTrace();
	    
	     Alerts.showAlert("Erro de Sistema - Sistema Comercial", msg, e.getMessage() + e.getStackTrace(), AlertType.ERROR);
	     
	}
		
	
}
