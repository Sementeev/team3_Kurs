package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import calculator.form;

public class Apply implements ActionListener {
	public static File file;
	public static String k1;
	public static String k2;
	public static PrintWriter writer;
	@Override
	public void actionPerformed(ActionEvent arg0) {
	k1 = admin.log.getText();
	k2 = admin.pas.getText();	
	
	file = new File("promo.txt");
	
	try {
		writer = new PrintWriter(file, "UTF-8");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		writer.println(k1);
		writer.println(k2);
		writer.close();
		

}
}
