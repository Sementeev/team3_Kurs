package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //áèáëèîòåêà äëÿ ñîáûòèÿ ñëóøàòåëÿ
import java.io.File;

import javax.swing.*; // Áèáëèîòåêà äëÿ GUI (ïîñòðîåíà íà îñíîâå awt)

public class form {
	static JComboBox<?> combobox; // äîáàâëåíèå JComboBox
	public static JTextField sum_field;
	public static JTextField term_field;
	public static JTextField rate_field;
	
	public form() {
		JFrame main_GUI = new JFrame("Äåïîçèòíûé êàëüêóëÿòîð ñ êàïèòàëèçàöèåé");	// ñîçäàíèå ãðàôè÷åñêîãî îêíà
		main_GUI.setTitle ("Êàëüêóëÿòîð");
		main_GUI.setBounds(500,200,400,400);
		main_GUI.setResizable(false); // ôèêñèðîâàííûé ðàçìåð îêíà
		
		
		final JPanel main_panel = new JPanel(); // Ïàíåëü - èñïîëüçóåòñÿ äëÿ îðãàíèçàöèè êîìïîíåíòîâ â îêíå
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
	
		JLabel laba_info = new JLabel("Äåïîçèòíûé êàëüêóëÿòîð"); // Îòîáðàæåíèå òåêñòà èëè èçîáðàæåíèÿ
		laba_info.setBounds(135,0,150,30);
		main_panel.add(laba_info);
		
	
		JButton button_exit = new JButton("Âûõîä"); // äîáàâëÿåì êíîïêó Âûõîä
		button_exit.setBounds(270,250,100,40);
		ActionListener actionListener = new ListenerButton(); //ñîçäàåì ñëóøàòåëü
		button_exit.addActionListener(actionListener); // äîáàâëÿåì ñëóøàòåëü ê êíîïêå
		main_panel.add(button_exit);
		
		JLabel sum_label = new JLabel ("Ñóììà âêëàäà: "); // Äîáàâëÿåì íàäïèñü 
		sum_label.setBounds(10,50,100,40);
		main_panel.add(sum_label);
		
		sum_field = new JTextField ();  // Äîáàâëÿåì ïîëå ââîäà
		sum_field.setBounds(135, 55, 100, 30);
		main_panel.add(sum_field);
		
		String [] item = { // Ñîçäàåì ìàññèâ  
				"Ðóáëè" , "Äîëëàðû" , "Åâðî" 		
			};

		JComboBox currency_box = new JComboBox(item); // Ñîçäàåì âûïàäàþùèé áîêñ
		currency_box.setBounds(250,55,100,30);
		main_panel.add(currency_box);
		
		JLabel term_label = new JLabel ("Ñðîê ðàçìåùåíèÿ: "); // Äîáàâëÿåì íàäïèñü
		term_label.setBounds(10,85,115,40);
		main_panel.add(term_label);
		term_field = new JTextField ();  // Äîáàâëÿåì ïîëå äëÿ ââîäà
		term_field.setBounds(135, 90, 100, 30);
		main_panel.add(term_field);
		
		JLabel rate_label = new JLabel ("Ñòàâêà (%): ");  // Äîáàâëÿåì íàäïèñü
		rate_label.setBounds(10,120,115,40);
		main_panel.add(rate_label);
		rate_field = new JTextField ();  // Äîáàâëÿåì ïîëå äëÿ ââîäà 
		rate_field.setBounds(135, 125, 100, 30);
		main_panel.add(rate_field);
		
		JLabel resident_label = new JLabel ("ß - ðåçèäåíò ÐÔ: "); // Äîáàâëÿåì íàäïèñü 
		resident_label.setBounds(10,199,115,40);
		main_panel.add(resident_label);
		
		JCheckBox resident_cbox = new JCheckBox();
		resident_cbox.setBounds(135,200,40,40);
		main_panel.add(resident_cbox);
		
		JMenuBar bar = new JMenuBar();  
		main_GUI.setJMenuBar(bar);
		JMenu menu = new JMenu("Ìåíþ");
		main_panel.add(menu);
		bar.add(menu);
		JMenuItem info = new JMenuItem("Èíôîðìàöèÿ î ðàñ÷åòå íàëîãà");
		main_panel.add(info);
		menu.add(info);
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(main_panel, "Íàëîãîâûé êîäåêñ ÐÔ ïðåäóñìàòðèâàåò ïðåäóñìàòðèâàåò íàëîãîîáëàæåíèå \nâêëàäîâ â ñëåäóþùèõ ñëó÷àÿõ:\n"
						+ "- ïðîöåíòíàÿ ñòàâêà ïî ðóáëåâîìó âêëàäó ïðåâûøàåò 9.25% \n"
						+ "- ïðîöåíòíàÿ ñòàâêà ïî âàëþòíîìó âêëàäó ïðåâûøàåò 9%");
			}
		});
		
		JMenuItem students = new JMenuItem("Èíôîðìàöèÿ î ðàçðàáîò÷èêàõ");
		menu.add(students); // äîáàâëÿåì êíîïêó íà âûïàäàþçåå ìåíþ
		students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				Info Information = new Info("Èíôîðìàöèÿ î ðàçðàáîò÷èêàõ", 500, 110); 
				JLabel students_label1 = new JLabel ("Ìîäåðàòîð - Ñåìåíòååâ Àíòîí"); // Äîáàâëÿåì íàäïèñü 
				students_label1.setBounds(20,10,250,30); // çàäàåì ðàçìåð
				Information.add(students_label1);
				JLabel students_label2 = new JLabel ("Ðàçðàáîò÷èê 1 - Èëüÿñîâ Ìàêñèì"); // Äîáàâëÿåì íàäïèñü 
				students_label2.setBounds(20,35,250,30); // çàäàåì ðàçìåð
				Information.add(students_label2); 
				JLabel students_label3 = new JLabel ("Ðàçðàáîò÷èê 2 - Èáðàãèìîâ Àéäàð"); // Äîáàâëÿåì íàäïèñü 
				students_label3.setBounds(260,10,250,30); // çàäàåì ðàçìåð
				Information.add(students_label3);
				JLabel students_label4 = new JLabel ("Ðàçðàáîò÷èê 3 - Ñóíàãàòîâ Èëüãèç"); // Äîáàâëÿåì íàäïèñü 
				students_label4.setBounds(260,35,250,30); // çàäàåì ðàçìåð
				Information.add(students_label4);
				JLabel students_label5 = new JLabel (""); // Äîáàâëÿåì íàäïèñü 
				students_label5.setBounds(260,35,250,30); // çàäàåì ðàçìåð
				Information.add(students_label5);
				
			}
		});
		
		JMenuItem exit = new JMenuItem("Âûõîä");
		main_panel.add(exit);
		menu.add(exit);
		exit.addActionListener(actionListener);
		
		
		
		String [] tax = { "Âêëþ÷àòü â ðàñ÷åò", "Íå âêëþ÷àòü â ðàñ÷åò"
		};
		
		JComboBox tax_box = new JComboBox(tax); // Ñîçäàåì âûïàäàþùèé áîêñ
		tax_box.setBounds(135,165,215,30);
		main_panel.add(tax_box);
		
		
		JButton calc = new JButton("Ðàññ÷èòàòü");
		calc.addActionListener(new ActionListener() { // Äîáàâëÿåì ñëóøàòåëÿ íàæàòèÿ êíîïêè
			@Override
			public void actionPerformed(ActionEvent e) {
				String nalogstr = tax_box.getSelectedItem().toString();
				boolean ychitivatNalog = true;
				if(nalogstr == "Íå âêëþ÷àòü â ðàñ÷åò")
					ychitivatNalog = false;
				calculate calc = new calculate(rate_field.getText(),term_field.getText(),sum_field.getText(),resident_cbox.isSelected(),ychitivatNalog,currency_box.getSelectedItem().toString());
			}
	    });
		calc.setBounds(20, 250, 100, 40);
		main_panel.add(calc);
		
		JLabel tax_label = new JLabel ("Íàëîã: "); // Äîáàâëÿåì íàäïèñü 
		tax_label.setBounds(10,160,115,40);
		main_panel.add(tax_label);
				
		main_GUI.setVisible(true);
		
		
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // çàêðûòèå îêíà JFrame è ïðîöåññà Java
		}
		
		
		public static void main(String[] args) { // èíòåðåñíûå çàìåòêè: http://www.mstu.edu.ru/study/materials/java/
			Login student = new Login();
			
		}
		

	}

