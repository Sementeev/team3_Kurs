package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import java.io.File;

import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class form {
	static JComboBox<?> combobox; // ���������� JComboBox
		
	public form() {
		JFrame main_GUI = new JFrame("���������� ����������� � ��������������");	// �������� ������������ ����
		main_GUI.setTitle ("�����������");
		main_GUI.setBounds(500,200,400,400);
		main_GUI.setResizable(false); // ������������� ������ ����
		
		
		final JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JLabel laba_info = new JLabel("���������� �����������"); // ����������� ������ ��� �����������
		laba_info.setBounds(135,0,150,30);
		main_panel.add(laba_info);
		
	
		JButton button_exit = new JButton("�����"); // ��������� ������ �����
		button_exit.setBounds(270,250,100,40);
		ActionListener actionListener = new ListenerButton(); //������� ���������
		button_exit.addActionListener(actionListener); // ��������� ��������� � ������
		main_panel.add(button_exit);
		
		JLabel sum_label = new JLabel ("����� ������: "); // ��������� ������� 
		sum_label.setBounds(10,50,100,40);
		main_panel.add(sum_label);
		
		JTextField sum_field = new JTextField ();  // ��������� ���� �����
		sum_field.setBounds(135, 55, 100, 30);
		main_panel.add(sum_field);
		
		String [] item = { // ������� ������  
				"�����" , "�������" , "����" 		
			};
		
		JComboBox currency_box = new JComboBox(item); // ������� ���������� ����
		currency_box.setBounds(250,55,100,30);
		main_panel.add(currency_box);
		
		JLabel term_label = new JLabel ("���� ����������: "); // ��������� �������
		term_label.setBounds(10,85,115,40);
		main_panel.add(term_label);
		JTextField term_field = new JTextField ();  // ��������� ���� ��� �����
		term_field.setBounds(135, 90, 100, 30);
		main_panel.add(term_field);
		
		JLabel rate_label = new JLabel ("������ (%): ");  // ��������� �������
		rate_label.setBounds(10,120,115,40);
		main_panel.add(rate_label);
		JTextField rate_field = new JTextField ();  // ��������� ���� ��� ����� 
		rate_field.setBounds(135, 125, 100, 30);
		main_panel.add(rate_field);
		
		JLabel resident_label = new JLabel ("� - �������� ��: "); // ��������� ������� 
		resident_label.setBounds(10,199,115,40);
		main_panel.add(resident_label);
		
		JCheckBox resident_cbox = new JCheckBox();
		resident_cbox.setBounds(135,200,40,40);
		main_panel.add(resident_cbox);
		
		JMenuBar bar = new JMenuBar();  
		main_GUI.setJMenuBar(bar);
		JMenu menu = new JMenu("����");
		main_panel.add(menu);
		bar.add(menu);
		JMenuItem info = new JMenuItem("���������� � ������� ������");
		main_panel.add(info);
		menu.add(info);
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(main_panel, "��������� ������ �� ��������������� ��������������� ��������������� \n������� � ��������� �������:\n"
						+ "- ���������� ������ �� ��������� ������ ��������� 9.25% \n"
						+ "- ���������� ������ �� ��������� ������ ��������� 9%");
			}
		});
		
		JMenuItem students = new JMenuItem("���������� � �������������");
		menu.add(students); // ��������� ������ �� ���������� ����
		students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				Info Information = new Info("���������� � �������������", 500, 110); 
				JLabel students_label1 = new JLabel ("��������� - ��������� �����"); // ��������� ������� 
				students_label1.setBounds(20,10,250,30); // ������ ������
				Information.add(students_label1);
				JLabel students_label2 = new JLabel ("����������� 1 - ������� ������"); // ��������� ������� 
				students_label2.setBounds(20,35,250,30); // ������ ������
				Information.add(students_label2); 
				JLabel students_label3 = new JLabel ("����������� 2 - ��������� �����"); // ��������� ������� 
				students_label3.setBounds(260,10,250,30); // ������ ������
				Information.add(students_label3);
				JLabel students_label4 = new JLabel ("����������� 3 - ��������� ������"); // ��������� ������� 
				students_label4.setBounds(260,35,250,30); // ������ ������
				Information.add(students_label4);
				JLabel students_label5 = new JLabel (""); // ��������� ������� 
				students_label5.setBounds(260,35,250,30); // ������ ������
				Information.add(students_label5);
				
			}
		});
		
		JMenuItem exit = new JMenuItem("�����");
		main_panel.add(exit);
		menu.add(exit);
		exit.addActionListener(actionListener);
		
		
		
		String [] tax = { "�������� � ������", "�� �������� � ������"
		};
		
		JComboBox tax_box = new JComboBox(tax); // ������� ���������� ����
		tax_box.setBounds(135,165,215,30);
		main_panel.add(tax_box);
		
		
		JButton calc = new JButton("����������");
		calc.addActionListener(new ActionListener() { // ��������� ��������� ������� ������
			@Override
			public void actionPerformed(ActionEvent e) {
				String nalogstr = tax_box.getSelectedItem().toString();
				boolean ychitivatNalog = true;
				if(nalogstr == "�� �������� � ������")
					ychitivatNalog = false;
				calculate calc = new calculate(rate_field.getText(),term_field.getText(),sum_field.getText(),resident_cbox.isSelected(),ychitivatNalog,currency_box.getSelectedItem().toString());
			}
	    });
		calc.setBounds(20, 250, 100, 40);
		main_panel.add(calc);
		
		JLabel tax_label = new JLabel ("�����: "); // ��������� ������� 
		tax_label.setBounds(10,160,115,40);
		main_panel.add(tax_label);
				
		main_GUI.setVisible(true);
		
		
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
		}
		
		
		public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
			Login student = new Login();
			
		}
		

	}

