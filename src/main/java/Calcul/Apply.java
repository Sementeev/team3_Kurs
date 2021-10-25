package Calcul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Apply implements ActionListener {
	public static File file;
	public static String k1;
	public static String k2;
	public static PrintWriter writer;
	@Override
	public void actionPerformed(ActionEvent arg0) {

	String sepka = File.separator;
	String filepath = "";
    try {
        filepath = new File("").getCanonicalPath();
    } catch (IOException e3) {
        // TODO Auto-generated catch block
        e3.printStackTrace();
    }
    filepath+= sepka+"prem.txt";
    
	file = new File(filepath);

	k1 = admin.coef1.getText();	
	k2 = admin.coef2.getText();	
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
		System.out.println("Операция прошла успешно");

}
}
