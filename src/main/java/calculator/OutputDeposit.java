package calculator;

import javax.swing.JLabel;

public class OutputDeposit extends GFrameBuilder{

	public OutputDeposit(String _title, int width, int height) {
		super(_title, width, height); //����������� �� ������ ����� ������ ������������ 1
		
	}
	public void SetData(String Text) // ����� ��������� ������� �� Jframe
	{
		JLabel dohodLabel = new JLabel (Text); // ��������� ������� 
		dohodLabel.setBounds(20,10,200,30); // ������ ������
		super.add(dohodLabel); // ��������� ����� �� ��� JFrame
	}

}
