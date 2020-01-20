package cup.example;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ViewController implements Initializable {
	
	@FXML
	private Button novi;
	
	
	@FXML
	private Button b0;
	
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;
	@FXML
	private Button b6;
	@FXML
	private Button b7;
	
	@FXML
	private Button b8;
	
	@FXML
	private Button b9;
	
	@FXML
	private TextField result;
	
	@FXML
	private Button puta;
	
	@FXML
	private Button podeljeno;
	
	@FXML
	private Button blz;
	@FXML
	private Button bdz;
	
	@FXML
	private Button koren;
	@FXML
	private Button stepen;
	
	@FXML
	private Button cos;
	
	@FXML
	private Button sin;
	
	
	@FXML
	private Button jednako;
	
	@FXML
	private Button ret;
	
	@FXML
	private Button minus;
	
	@FXML
	private Button plus;
//	
	
	@FXML
	private Button dot;
	
	public ViewController() {
		// TODO Auto-generated constructor stub
	}

	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	
		if(b8!=null)
			System.out.println("uspeh");
		else System.out.println("neeeuspeh");
		
	
		
		
		b0.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+0);
				
			}
		});
		b1.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+1);
				
			}
		});
		b2.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+2);
				
			}
		});
		b3.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+3);
				
			}
		});
		b4.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+4);
				
			}
		});
		
		b5.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+5);
				
			}
		});
		b6.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+6);
				
			}
		});
		b7.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+7);
				
			}
		});
		b7.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+7);
				
			}
		});
		b8.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+8);
				
			}
		});
		b9.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+9);
				
			}
		});
		
		cos.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"cos");
				
			}
		});
		sin.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"sin");
				
			}
		});
		puta.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"*");
				
			}
		});
		podeljeno.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"/");
				
			}
		});
		stepen.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"^");
				
			}
		});
		koren.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"" + "sqrt");
				
			}
		});
		
		blz.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"" + "(");
				
			}
		});
		bdz.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"" + ")");
				
			}
		});
		plus.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"" + "+");
				
			}
		});
		minus.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"" + "-");
				
			}
		});
		
		dot.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText(result.getText()+"" + ".");
				
			}
		});
		jednako.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				CUP_proxy.calculateExpression(result);
				
			}
		});
		
		ret.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				String currentDisplay = result.getText();
				if(currentDisplay.length()>0)
				{
				String newDisplay = currentDisplay.substring(0, currentDisplay.length()-1);
				result.setText(newDisplay);
				}
				
			}
		});
		novi.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				result.setText("");
				
			}
		});
		//result.setText("Aa");
	
		
		
	}

		


}
