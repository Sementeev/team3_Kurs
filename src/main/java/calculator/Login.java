package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Login {
	
	String i="u"; String a="y"; String w="q"; String v="q";
	
	public static JTextField log;
	
	public Login() {
	JFrame main_GUI = new JFrame("���������� ����������� � ��������������");	// �������� ������������ ����
	main_GUI.setTitle ("�����������");
	main_GUI.setBounds(300,200,400,320);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	main_panel.setVisible(true);
	
	
	JTextField log = new JTextField(""); //��������� ���� ����� ������
	log.setBounds(20, 100, 150, 30);
	main_panel.add(log);
	log.setVisible(true);
	
	JTextField password = new JTextField(""); //��������� ���� ����� ������
	password.setBounds(220, 100, 150, 30);
	main_panel.add(password);
	password.setVisible(true);
	
	JButton aut = new JButton("�����������"); //��������� ������ �����������
	aut.setBounds(200, 150, 140, 40);
    aut.addActionListener(new ActionListener() {						//���������� ��������� � ������ �����	
		
		
		public void actionPerformed(ActionEvent e) {									//��������� ��������� ��� �����
			if(log.getText().equals(i) && password.getText().equals(a)) {
				
				JOptionPane.showMessageDialog(null, "Welcome", "welcome", 1);
				main_GUI.setVisible(false);
				form student1 = new form();
			}
			else if (log.getText().equals(w)&&password.getText().equals(v)) {
					JOptionPane.showMessageDialog(null, "Welcome", "welcome", 1);
					main_GUI.setVisible(false);
					admin student2 = new admin();
					
			}
			else {
            	JOptionPane.showMessageDialog(null, "Error", "Check youre login or password", 0);  //�������� ������ � ������
            	password.setText("");
            	log.setText("");
            
			}	
			
		}
	
	});
    
	main_panel.add(aut);
	
	JLabel cal = new JLabel("�����");
	cal.setBounds(30, 50, 150, 80);
	main_panel.add(cal);
	
	JLabel can = new JLabel("������");
	can.setBounds(230, 50, 150, 80);
	main_panel.add(can);
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
   }
} 