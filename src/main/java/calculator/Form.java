package Calcul;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //Р±РёР±Р»РёРѕС‚РµРєР° РґР»СЏ СЃРѕР±С‹С‚РёСЏ СЃР»СѓС€Р°С‚РµР»СЏ
import java.io.File;

import javax.swing.*; // Р‘РёР±Р»РёРѕС‚РµРєР° РґР»СЏ GUI (РїРѕСЃС‚СЂРѕРµРЅР° РЅР° РѕСЃРЅРѕРІРµ awt)

import Calcul.ListenerCreate;
public class Form {
	static JComboBox<?> combobox; // РґРѕР±Р°РІР»РµРЅРёРµ JComboBox
	public static JTextField sum_field;
	public static JTextField term_field;
	public static JTextField rate_field;
	public static JTextField output_field;
	public static JTextField premia_field;
		
	public Form() {
		JFrame main_GUI = new JFrame("Р—Р°СЂРїР»Р°С‚РЅС‹Р№ РєР°Р»СЊРєСѓР»СЏС‚РѕСЂ");	// СЃРѕР·РґР°РЅРёРµ РіСЂР°С„РёС‡РµСЃРєРѕРіРѕ РѕРєРЅР°
		main_GUI.setTitle ("РљР°Р»СЊРєСѓР»СЏС‚РѕСЂ");
		main_GUI.setBounds(500,200,440,400);
		main_GUI.setResizable(false); // С„РёРєСЃРёСЂРѕРІР°РЅРЅС‹Р№ СЂР°Р·РјРµСЂ РѕРєРЅР°
		
		
		final JPanel main_panel = new JPanel(); // РџР°РЅРµР»СЊ - РёСЃРїРѕР»СЊР·СѓРµС‚СЃСЏ РґР»СЏ РѕСЂРіР°РЅРёР·Р°С†РёРё РєРѕРјРїРѕРЅРµРЅС‚РѕРІ РІ РѕРєРЅРµ
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JLabel laba_info = new JLabel("Р—Р°СЂРїР»Р°С‚РЅС‹Р№ РєР°Р»СЊРєСѓР»СЏС‚РѕСЂ"); // РћС‚РѕР±СЂР°Р¶РµРЅРёРµ С‚РµРєСЃС‚Р° РёР»Рё РёР·РѕР±СЂР°Р¶РµРЅРёСЏ
		laba_info.setBounds(135,0,150,30);
		main_panel.add(laba_info);
		
	
		JButton button_exit = new JButton("Р’С‹С…РѕРґ"); // РґРѕР±Р°РІР»СЏРµРј РєРЅРѕРїРєСѓ Р’С‹С…РѕРґ
		button_exit.setBounds(295,280,130,40);
		ActionListener actionListener = new ListenerButton(); //СЃРѕР·РґР°РµРј СЃР»СѓС€Р°С‚РµР»СЊ
		button_exit.addActionListener(actionListener); // РґРѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЊ Рє РєРЅРѕРїРєРµ
		main_panel.add(button_exit);
		
		JLabel sum_label = new JLabel ("РўР°СЂРёС„РЅР°СЏ СЃС‚Р°РІРєР°: "); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
		sum_label.setBounds(10,50,120,40);
		main_panel.add(sum_label);
		
		
		sum_field = new JTextField ();  // Р”РѕР±Р°РІР»СЏРµРј РїРѕР»Рµ РІРІРѕРґР°
		sum_field.setBounds(300, 55, 100, 30);
		main_panel.add(sum_field);
		
		
		
		
		JLabel term_label = new JLabel ("РљРѕР»-РІРѕ СЂР°Р±. РµРґ. РІСЂРµРјРµРЅРё Р·Р° СЃРјРµРЅСѓ:"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ
		term_label.setBounds(10,90,300,60);
		main_panel.add(term_label);
		JLabel sum_labe2 = new JLabel ("(РґРЅРµРІРЅР°СЏ (1) /С‡Р°СЃРѕРІР°СЏ (РєРѕР»-РІРѕ С‡Р°СЃРѕРІ Р·Р° СЃРјРµРЅСѓ)"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
		sum_labe2.setBounds(10,113,300,60);
		main_panel.add(sum_labe2);
		term_field = new JTextField ();  // Р”РѕР±Р°РІР»СЏРµРј РїРѕР»Рµ РґР»СЏ РІРІРѕРґР°
		term_field.setBounds(300, 105, 100, 30);
		main_panel.add(term_field);
		
		JLabel rate_label = new JLabel ("РљРѕР»-РІРѕ СЂР°Р±РѕС‡РёС… РґРЅРµР№ РІ РјРµСЃСЏС†Рµ: ");  // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ
		rate_label.setBounds(10,150,300,40);
		main_panel.add(rate_label);
		rate_field = new JTextField ();  // Р”РѕР±Р°РІР»СЏРµРј РїРѕР»Рµ РґР»СЏ РІРІРѕРґР° 
		rate_field.setBounds(300, 155, 100, 30);
		main_panel.add(rate_field);
		
		JLabel premia_label = new JLabel ("РЎС‡РёС‚Р°С‚СЊ СЃ РїСЂРµРјРёРµР№ "); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
		premia_label.setBounds(10,230,115,40);
		main_panel.add(premia_label);
		
		JCheckBox premia_cbox = new JCheckBox();
		premia_cbox.setBounds(135,230,40,40);
		main_panel.add(premia_cbox);
		
		JButton button_create = new JButton("Create PDF"); // РґРѕР±Р°РІР»СЏРµРј РєРЅРѕРїРєСѓ
		button_create.setBounds(160,280,125,40);
		ActionListener actionCreate = new ListenerCreate(); //СЃРѕР·РґР°РµРј СЃР»СѓС€Р°С‚РµР»СЊ РґР»СЏ РєРЅРѕРїРєРё PDF
		button_create.addActionListener(actionCreate); // РґРѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЊ Рє РєРЅРѕРїРєРµ
		main_panel.add(button_create);
		
		JMenuBar bar = new JMenuBar();  
		main_GUI.setJMenuBar(bar);
		JMenu menu = new JMenu("РњРµРЅСЋ");
		main_panel.add(menu);
		bar.add(menu);
		
		JMenuItem info = new JMenuItem("Р�РЅС„РѕСЂРјР°С†РёСЏ Рѕ СЂР°СЃС‡РµС‚Рµ РЅР°Р»РѕРіР°");
		main_panel.add(info);
		menu.add(info);
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(main_panel, "РќР°Р»РѕРіРѕРІС‹Р№ РєРѕРґРµРєСЃ Р Р¤ РїСЂРµРґСѓСЃРјР°С‚СЂРёРІР°РµС‚ РїСЂРµРґСѓСЃРјР°С‚СЂРёРІР°РµС‚ РЅР°Р»РѕРіРѕРѕР±Р»Р°Р¶РµРЅРёРµ \n РЅР°  РґРѕС…РѕРґС‹ С„РёР·РёС‡РµСЃРєРёС… Р»РёС† РІ СЂР°Р·Р°РјРµСЂРµ 13%:\n"
					);
			}
		});
		JMenuItem prem = new JMenuItem("Р�РЅС„РѕСЂРјР°С†РёСЏ Рѕ СЂР°СЃС‡РµС‚Рµ РїСЂРµРјРёРё");
		main_panel.add(prem);
		menu.add(prem);
		prem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(main_panel, "РћСЃРѕР±РѕРµ РІРѕР·РЅР°РіСЂР°Р¶РґРµРЅРёРµ СЂР°Р±РѕС‡РёРј РЅР°С‡РёСЃР»СЏРµС‚СЃСЏ РІ СЂР°Р·РјРµСЂРµ 20% Рє РѕСЃРЅРѕРІРЅРѕРјСѓ \n РґРѕС…РѕРґСѓ РІ РјРµСЃСЏС† "
					);
			}
		});
		
		JMenuItem students = new JMenuItem("Р�РЅС„РѕСЂРјР°С†РёСЏ Рѕ СЂР°Р·СЂР°Р±РѕС‚С‡РёРєР°С…");
		menu.add(students); // РґРѕР±Р°РІР»СЏРµРј РєРЅРѕРїРєСѓ РЅР° РІС‹РїР°РґР°СЋР·РµРµ РјРµРЅСЋ
		students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				Info Information = new Info("Р�РЅС„РѕСЂРјР°С†РёСЏ Рѕ СЂР°Р·СЂР°Р±РѕС‚С‡РёРєР°С…", 500, 110); 
				JLabel students_label1 = new JLabel ("РњРѕРґРµСЂР°С‚РѕСЂ - Р›РѕРіРёРЅРѕРІР° РђРЅР°СЃС‚Р°СЃРёСЏ"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
				students_label1.setBounds(20,10,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label1);
				JLabel students_label2 = new JLabel ("Р Р°Р·СЂР°Р±РѕС‚С‡РёРє 1 - РҐР°Р№СЂСѓР»Р»РёРЅР° Р­Р»РёРЅР°"); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
				students_label2.setBounds(20,35,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label2); 
				JLabel students_label5 = new JLabel (""); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
				students_label5.setBounds(260,35,250,30); // Р·Р°РґР°РµРј СЂР°Р·РјРµСЂ
				Information.add(students_label5);
				
			}
		});
		
		JMenuItem exit = new JMenuItem("Р’С‹С…РѕРґ");
		main_panel.add(exit);
		menu.add(exit);
		exit.addActionListener(actionListener);
		
		
		
		String [] tax = { "Р’РєР»СЋС‡Р°С‚СЊ РІ СЂР°СЃС‡РµС‚", "РќРµ РІРєР»СЋС‡Р°С‚СЊ РІ СЂР°СЃС‡РµС‚"
		};
		
		JComboBox tax_box = new JComboBox(tax); // РЎРѕР·РґР°РµРј РІС‹РїР°РґР°СЋС‰РёР№ Р±РѕРєСЃ
		tax_box.setBounds(135,195,215,30);
		main_panel.add(tax_box);
		
		
		JButton calc = new JButton("Р Р°СЃСЃС‡РёС‚Р°С‚СЊ");
		calc.addActionListener(new ActionListener() { // Р”РѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЏ РЅР°Р¶Р°С‚РёСЏ РєРЅРѕРїРєРё
			@Override
			public void actionPerformed(ActionEvent e) {
				String nalogstr = tax_box.getSelectedItem().toString();
				boolean ychitivatNalog = true;
				if(nalogstr == "РќРµ РІРєР»СЋС‡Р°С‚СЊ РІ СЂР°СЃС‡РµС‚")
					ychitivatNalog = false;
				Calculate calc = new Calculate(rate_field.getText(),term_field.getText(),sum_field.getText(),premia_cbox.isSelected(),ychitivatNalog);
			}
	    });
		calc.setBounds(20, 280, 130, 40);
		main_panel.add(calc);
		
		JLabel tax_label = new JLabel ("РќР°Р»РѕРі: "); // Р”РѕР±Р°РІР»СЏРµРј РЅР°РґРїРёСЃСЊ 
		tax_label.setBounds(10,190,115,40);
		main_panel.add(tax_label);
				
		main_GUI.setVisible(true);
		
		
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Р·Р°РєСЂС‹С‚РёРµ РѕРєРЅР° JFrame Рё РїСЂРѕС†РµСЃСЃР° Java
		}
		
		
		public static void main(String[] args) {
			Avtorization student = new Avtorization();
			
		}
		

	}

