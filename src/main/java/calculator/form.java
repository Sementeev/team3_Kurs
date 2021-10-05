package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.io.File;

import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class form {
	static JComboBox<?> combobox; // добавление JComboBox
		
	public form() {
		JFrame main_GUI = new JFrame("Депозитный калькулятор с капитализацией");	// создание графического окна
		main_GUI.setTitle ("Калькулятор");
		main_GUI.setBounds(500,200,400,400);
		main_GUI.setResizable(false); // фиксированный размер окна
		
		
		final JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
	
		JLabel laba_info = new JLabel("Депозитный калькулятор"); // Отображение текста или изображения
		laba_info.setBounds(135,0,150,30);
		main_panel.add(laba_info);
		
	
		JButton button_exit = new JButton("Выход"); // добавляем кнопку Выход
		button_exit.setBounds(270,250,100,40);
		ActionListener actionListener = new ListenerButton(); //создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		main_panel.add(button_exit);
		
		JLabel sum_label = new JLabel ("Сумма вклада: "); // Добавляем надпись 
		sum_label.setBounds(10,50,100,40);
		main_panel.add(sum_label);
		
		JTextField sum_field = new JTextField ();  // Добавляем поле ввода
		sum_field.setBounds(135, 55, 100, 30);
		main_panel.add(sum_field);
		
		String [] item = { // Создаем массив  
				"Рубли" , "Доллары" , "Евро" 		
			};

		JComboBox currency_box = new JComboBox(item); // Создаем выпадающий бокс
		currency_box.setBounds(250,55,100,30);
		main_panel.add(currency_box);
		
		JLabel term_label = new JLabel ("Срок размещения: "); // Добавляем надпись
		term_label.setBounds(10,85,115,40);
		main_panel.add(term_label);
		JTextField term_field = new JTextField ();  // Добавляем поле для ввода
		term_field.setBounds(135, 90, 100, 30);
		main_panel.add(term_field);
		
		JLabel rate_label = new JLabel ("Ставка (%): ");  // Добавляем надпись
		rate_label.setBounds(10,120,115,40);
		main_panel.add(rate_label);
		JTextField rate_field = new JTextField ();  // Добавляем поле для ввода 
		rate_field.setBounds(135, 125, 100, 30);
		main_panel.add(rate_field);
		
		JLabel resident_label = new JLabel ("Я - резидент РФ: "); // Добавляем надпись 
		resident_label.setBounds(10,199,115,40);
		main_panel.add(resident_label);
		
		JCheckBox resident_cbox = new JCheckBox();
		resident_cbox.setBounds(135,200,40,40);
		main_panel.add(resident_cbox);
		
		JMenuBar bar = new JMenuBar();  
		main_GUI.setJMenuBar(bar);
		JMenu menu = new JMenu("Меню");
		main_panel.add(menu);
		bar.add(menu);
		JMenuItem info = new JMenuItem("Информация о расчете налога");
		main_panel.add(info);
		menu.add(info);
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				JOptionPane.showMessageDialog(main_panel, "Налоговый кодекс РФ предусматривает предусматривает налогооблажение \nвкладов в следующих случаях:\n"
						+ "- процентная ставка по рублевому вкладу превышает 9.25% \n"
						+ "- процентная ставка по валютному вкладу превышает 9%");
			}
		});
		
		JMenuItem students = new JMenuItem("Информация о разработчиках");
		menu.add(students); // добавляем кнопку на выпадаюзее меню
		students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				Info Information = new Info("Информация о разработчиках", 500, 110); 
				JLabel students_label1 = new JLabel ("Модератор - Сементеев Антон"); // Добавляем надпись 
				students_label1.setBounds(20,10,250,30); // задаем размер
				Information.add(students_label1);
				JLabel students_label2 = new JLabel ("Разработчик 1 - Ильясов Максим"); // Добавляем надпись 
				students_label2.setBounds(20,35,250,30); // задаем размер
				Information.add(students_label2); 
				JLabel students_label3 = new JLabel ("Разработчик 2 - Ибрагимов Айдар"); // Добавляем надпись 
				students_label3.setBounds(260,10,250,30); // задаем размер
				Information.add(students_label3);
				JLabel students_label4 = new JLabel ("Разработчик 3 - Сунагатов Ильгиз"); // Добавляем надпись 
				students_label4.setBounds(260,35,250,30); // задаем размер
				Information.add(students_label4);
				JLabel students_label5 = new JLabel (""); // Добавляем надпись 
				students_label5.setBounds(260,35,250,30); // задаем размер
				Information.add(students_label5);
				
			}
		});
		
		JMenuItem exit = new JMenuItem("Выход");
		main_panel.add(exit);
		menu.add(exit);
		exit.addActionListener(actionListener);
		
		
		
		String [] tax = { "Включать в расчет", "Не включать в расчет"
		};
		
		JComboBox tax_box = new JComboBox(tax); // Создаем выпадающий бокс
		tax_box.setBounds(135,165,215,30);
		main_panel.add(tax_box);
		
		
		JButton calc = new JButton("Рассчитать");
		calc.addActionListener(new ActionListener() { // Добавляем слушателя нажатия кнопки
			@Override
			public void actionPerformed(ActionEvent e) {
				String nalogstr = tax_box.getSelectedItem().toString();
				boolean ychitivatNalog = true;
				if(nalogstr == "Не включать в расчет")
					ychitivatNalog = false;
				calculate calc = new calculate(rate_field.getText(),term_field.getText(),sum_field.getText(),resident_cbox.isSelected(),ychitivatNalog,currency_box.getSelectedItem().toString());
			}
	    });
		calc.setBounds(20, 250, 100, 40);
		main_panel.add(calc);
		
		JLabel tax_label = new JLabel ("Налог: "); // Добавляем надпись 
		tax_label.setBounds(10,160,115,40);
		main_panel.add(tax_label);
				
		main_GUI.setVisible(true);
		
		
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
		}
		
		
		public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
			Login student = new Login();
			
		}
		

	}

