package Calcul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //Р±РёР±Р»РёРѕС‚РµРєР° РґР»СЏ СЃРѕР±С‹С‚РёСЏ СЃР»СѓС€Р°С‚РµР»СЏ
import java.io.File;

import javax.swing.*; // Р‘РёР±Р»РёРѕС‚РµРєР° РґР»СЏ GUI (РїРѕСЃС‚СЂРѕРµРЅР° РЅР° РѕСЃРЅРѕРІРµ awt)

public class Form {
	static JComboBox<?> combobox; // РґРѕР±Р°РІР»РµРЅРёРµ JComboBox
	public static JTextField sum_field;
	public static JTextField term_field;
	public static JTextField rate_field;
	
	public Form() {
		JFrame main_GUI = new JFrame("Deposit calculator with capitalization");	// СЃРѕР·РґР°РЅРёРµ РіСЂР°С„РёС‡РµСЃРєРѕРіРѕ РѕРєРЅР°
		main_GUI.setTitle ("Calculator");
		main_GUI.setBounds(500,200,400,400);
		main_GUI.setResizable(false); // С„РёРєСЃРёСЂРѕРІР°РЅРЅС‹Р№ СЂР°Р·РјРµСЂ РѕРєРЅР°
		
		
		final JPanel main_panel = new JPanel();  //РџР°РЅРµР»СЊ - РёСЃРїРѕР»СЊР·СѓРµС‚СЃСЏ РґР»СЏ РѕСЂРіР°РЅРёР·Р°С†РёРё РєРѕРјРїРѕРЅРµРЅС‚РѕРІ РІ РѕРєРЅРµ
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
	
		JLabel laba_info = new JLabel("Deposit Calculator"); // РћС‚РѕР±СЂР°Р¶РµРЅРёРµ С‚РµРєСЃС‚Р° РёР»Рё РёР·РѕР±СЂР°Р¶РµРЅРёСЏ
		laba_info.setBounds(135,0,150,30);
		main_panel.add(laba_info);
		
		JButton button_create = new JButton("Create PDF"); // РґРѕР±Р°РІР»СЏРµРј РєРЅРѕРїРєСѓ
		button_create.setBounds(150,250,100,40);
		ActionListener actionCreate = new ListenerCreate(); //СЃРѕР·РґР°РµРј СЃР»СѓС€Р°С‚РµР»СЊ РґР»СЏ РєРЅРѕРїРєРё PDF
		button_create.addActionListener(actionCreate); // РґРѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЊ Рє РєРЅРѕРїРєРµ
		main_panel.add(button_create);
		
	
		JButton button_exit = new JButton("Exit"); // РґРѕР±Р°РІР»СЏРµРј РєРЅРѕРїРєСѓ Р’С‹С…РѕРґ
		button_exit.setBounds(270,250,100,40);
		ActionListener actionListener = new ListenerButton(); //СЃРѕР·РґР°РµРј СЃР»СѓС€Р°С‚РµР»СЊ
		button_exit.addActionListener(actionListener); // РґРѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЊ Рє РєРЅРѕРїРєРµ
		main_panel.add(button_exit);
		
		JLabel sum_label = new JLabel ("Deposit amount:"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ  
		sum_label.setBounds(10,50,100,40);
		main_panel.add(sum_label);
		
		sum_field = new JTextField ();  // Adding an input field
		sum_field.setBounds(135, 55, 100, 30);
		main_panel.add(sum_field);
		
		String [] item = { // РЎРѕР·РґР°РµРј РјР°СЃСЃРёРІ   
				"Rubles\", \"Dollars\", \"Euros" 		
			};

		JComboBox currency_box = new JComboBox(item); // РЎРѕР·РґР°РµРј РІС‹РїР°РґР°СЋС‰РёР№ Р±РѕРєСЃ
		currency_box.setBounds(250,55,100,30);
		main_panel.add(currency_box);
		
		JLabel term_label = new JLabel ("Term of placement:"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ
		term_label.setBounds(10,85,115,40);
		main_panel.add(term_label);
		term_field = new JTextField ();  // Р”РѕР±Р°РІР»СЏРµРј РїРѕР»Рµ РґР»СЏ РІРІРѕРґР°
		term_field.setBounds(135, 90, 100, 30);
		main_panel.add(term_field);
		
		JLabel rate_label = new JLabel ("Bid (%):");  // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ
		rate_label.setBounds(10,120,115,40);
		main_panel.add(rate_label);
		rate_field = new JTextField ();  // Р”РѕР±Р°РІР»СЏРµРј РїРѕР»Рµ РґР»СЏ РІРІРѕРґР° 
		rate_field.setBounds(135, 125, 100, 30);
		main_panel.add(rate_field);
		
		JLabel resident_label = new JLabel ("I'am a resident of the RF:"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
		resident_label.setBounds(10,199,115,40);
		main_panel.add(resident_label);
		
		JCheckBox resident_cbox = new JCheckBox();
		resident_cbox.setBounds(135,200,40,40);
		main_panel.add(resident_cbox);
		
		JMenuBar bar = new JMenuBar();  
		main_GUI.setJMenuBar(bar);
		JMenu menu = new JMenu("Menu");
		main_panel.add(menu);
		bar.add(menu);
		JMenuItem info = new JMenuItem("Information about tax calculation");
		main_panel.add(info);
		menu.add(info);
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(main_panel, "The Tax Code of the Russian Federation provides for the taxation \n of deposits in the following cases:\n"
						+ "- the interest rate on the ruble deposit exceeds 9.25% \n"
						+ "- the interest rate on the foreign currency deposit exceeds 9%");
			}
		});
		
		JMenuItem students = new JMenuItem("Information about developers");
		menu.add(students); // РґРѕР±Р°РІР»СЏРµРј РєРЅРѕРїРєСѓ РЅР° РІС‹РїР°РґР°СЋР·РµРµ РјРµРЅСЋ
		students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				Info Information = new Info("Information about developers", 500, 110); 
				JLabel students_label1 = new JLabel ("Moderator - Anton Sementeev"); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				students_label1.setBounds(20,10,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label1);
				JLabel students_label2 = new JLabel ("Developer 1 - Maxim Ilyasov"); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ 
				students_label2.setBounds(20,35,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label2); 
				JLabel students_label3 = new JLabel ("Developer 2 - Ibragimov Aidar"); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ 
				students_label3.setBounds(260,10,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label3);
				JLabel students_label4 = new JLabel ("Developer 3 - Ilgiz Sunagatov"); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				students_label4.setBounds(260,35,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label4);
				JLabel students_label5 = new JLabel (""); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ 
				students_label5.setBounds(260,35,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label5);
				
			}
		});
		
		JMenuItem exit = new JMenuItem("Exit");
		main_panel.add(exit);
		menu.add(exit);
		exit.addActionListener(actionListener);
		
		
		
		String [] tax = { "Include in the calculation", "Do not include in the calculation"
		};
		
		JComboBox tax_box = new JComboBox(tax); // РЎРѕР·РґР°РµРј РІС‹РїР°РґР°СЋС‰РёР№ Р±РѕРєСЃ
		tax_box.setBounds(135,165,215,30);
		main_panel.add(tax_box);
		
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener() { // Р”РѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЏ РЅР°Р¶Р°С‚РёСЏ РєРЅРѕРїРєРё
			@Override
			public void actionPerformed(ActionEvent e) {
				String nalogstr = tax_box.getSelectedItem().toString();
				boolean ychitivatNalog = true;
				if(nalogstr == "Do not include in the calculation")
					ychitivatNalog = false;
				Calculate calc = new Calculate(rate_field.getText(),term_field.getText(),sum_field.getText(),resident_cbox.isSelected(),ychitivatNalog, nalogstr);
			}
	    });
		calc.setBounds(20, 250, 100, 40);
		main_panel.add(calc);
		
		JLabel tax_label = new JLabel ("Tax:"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
		tax_label.setBounds(10,160,115,40);
		main_panel.add(tax_label);
				
		main_GUI.setVisible(true);
		
		
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Р·Р°РєСЂС‹С‚РёРµ РѕРєРЅР° JFrame Рё РїСЂРѕС†РµСЃСЃР° Java
		}
		
		
		public static void main(String[] args) { // РёРЅС‚РµСЂРµСЃРЅС‹Рµ Р·Р°РјРµС‚РєРё: http://www.mstu.edu.ru/study/materials/java/
			Avtorization student = new Avtorization();
			
		}
		

	}

