package cup.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javafx.scene.control.TextField;

public class CUP_proxy {
	
	
	public static void calculateExpression(TextField result)
	{
		String expression = result.getText();
	
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("input.txt"), "utf-8"));
		    writer.write(expression + ';' );
		} catch (IOException ex) {
		
			System.out.println("nezgodan izraz");
			result.setText("Los izraz");
		    // Report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		   
		}
		
		try
		{
		Parser p = new Parser();
		
		p.parse();
		
		result.setText(""+p.numericalResult);
		
		}
		catch(Exception e)
		{
			result.setText("los izraz");
		}
		
		
	}

}
