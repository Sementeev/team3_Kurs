package Calcul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class admin {
	
	public static JTextField coef1;
	public static JTextField coef2;
	
	public admin() {
	JFrame main_GUI = new JFrame("Calculator. Time form salary");	// создание графического окна
	main_GUI.setTitle ("Calculator");
	main_GUI.setBounds(300,200,400,320);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	main_panel.setVisible(true);
        main_GUI.setVisible(true);
        
        coef1 = new JTextField(""); //Добавляем поле ввода логина
        coef1.setBounds(20, 100, 150, 30);
    	main_panel.add(coef1);
    	coef1.setVisible(true);
    	
    	coef2 = new JTextField(""); //Добавляем поле ввода логина
    	coef2.setBounds(200, 100, 150, 30);
    	main_panel.add(coef2);
    	coef2.setVisible(true);
    	
    	JButton ap = new JButton("Apply"); //Добавляем кнопку применить
    	ap.setBounds(200, 150, 140, 40);
    	ActionListener actionCreate1 = new Apply(); 
        ap.addActionListener(actionCreate1);
   
    	JButton back = new JButton("Back"); //Добавляем кнопку назад
    	back.setBounds(50, 150, 140, 40);
    	back.addActionListener(new ActionListener() { // Добавляем слушателя нажатия кнопки
			@Override
    	public void actionPerformed(ActionEvent e) {
    		main_GUI.setVisible(false);
    		Avtorization back = new Avtorization();
    	}
    	});
    	main_panel.add(back);
    	
    	main_panel.add(ap);
    	
    	JLabel promo = new JLabel("New coefficient"); 
    	promo.setBounds(30, 50, 150, 80);
    	main_panel.add(promo);
    	
    	
    	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
}
