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
	
	public static JTextField log, pas;
	
	public admin() {
	JFrame main_GUI = new JFrame("���������� ����������� � ��������������");	// �������� ������������ ����
	main_GUI.setTitle ("�����������");
	main_GUI.setBounds(300,200,400,320);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	main_panel.setVisible(true);
        main_GUI.setVisible(true);
        
        JTextField log = new JTextField(""); //��������� ���� ����� ������
    	log.setBounds(20, 100, 150, 30);
    	main_panel.add(log);
    	log.setVisible(true);
    	
    	JTextField pas = new JTextField(""); //��������� ���� ����� ������
    	pas.setBounds(220, 100, 150, 30);
    	main_panel.add(pas);
    	pas.setVisible(true);
    	
    	JButton aut = new JButton("���������"); //��������� ������ ���������
    	aut.setBounds(200, 150, 140, 40);
    	ActionListener actionCreate = new Apply(); 
        aut.addActionListener(actionCreate);
    	
    	JButton back = new JButton("�����"); //��������� ������ �����
    	back.setBounds(50, 150, 140, 40);
    	back.addActionListener(new ActionListener() { // ��������� ��������� ������� ������
			@Override
    	public void actionPerformed(ActionEvent e) {
    		main_GUI.setVisible(false);
			Login back = new Login();
    	}
    	});
    	main_panel.add(back);
    	
    	main_panel.add(aut);
    	
    	JLabel promo = new JLabel("����� ��������");
    	promo.setBounds(30, 50, 150, 80);
    	main_panel.add(promo);
    	
    	JLabel can = new JLabel("����� ���");
    	can.setBounds(230, 50, 150, 80);
    	main_panel.add(can);
    	
    	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
}
