package calculator;

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
	
	public static JTextField log;
	public static JTextField pas;
	
	public admin() {
	JFrame main_GUI = new JFrame("Депозитный калькулятор с капитализацией");	// создание графического окна
	main_GUI.setTitle ("Калькулятор");
	main_GUI.setBounds(300,200,400,320);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	main_panel.setVisible(true);
        main_GUI.setVisible(true);
        
        log = new JTextField(""); //Добавляем поле ввода логина
    	log.setBounds(20, 100, 150, 30);
    	main_panel.add(log);
    	log.setVisible(true);
    	
    	
    	pas = new JTextField(""); //Добавляем поле ввода пароля
    	pas.setBounds(220, 100, 150, 30);
    	main_panel.add(pas);
    	pas.setVisible(true);
    	
    	JButton ap = new JButton("Применить"); //Добавляем кнопку применить
    	ap.setBounds(200, 150, 140, 40);
    	ActionListener actionCreate1 = new Apply(); 
        ap.addActionListener(actionCreate1);
   
    	JButton back = new JButton("Назад"); //Добавляем кнопку назад
    	back.setBounds(50, 150, 140, 40);
    	back.addActionListener(new ActionListener() { // Добавляем слушателя нажатия кнопки
			@Override
    	public void actionPerformed(ActionEvent e) {
    		main_GUI.setVisible(false);
			Login back = new Login();
    	}
    	});
    	main_panel.add(back);
    	
    	main_panel.add(ap);
    	
    	JLabel promo = new JLabel("Новый коэффициент"); 
    	promo.setBounds(30, 50, 150, 80);
    	main_panel.add(promo);
    	
    	JLabel can = new JLabel("Новый коэффициент");
    	can.setBounds(230, 50, 150, 80);
    	main_panel.add(can);
    	
    	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
}
