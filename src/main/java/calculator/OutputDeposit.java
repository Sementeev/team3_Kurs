package calculator;

import javax.swing.JLabel;

public class OutputDeposit extends GFrameBuilder{

	public OutputDeposit(String _title, int width, int height) {
		super(_title, width, height); //конструктор на основе асбтр класса разработчика 1
		
	}
	public void SetData(String Text) // МЕТОД ДОБАВЛЯЕТ НАДПИСЬ НА Jframe
	{
		JLabel dohodLabel = new JLabel (Text);  // Добавляем надпись
		dohodLabel.setBounds(20,10,200,30);  // задаем размер
		super.add(dohodLabel);  // добавляем лейбл на наш JFrame
	}

}
