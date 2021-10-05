package calculator;

import javax.swing.JFrame;

public abstract class GFrameBuilder extends JFrame {


    public GFrameBuilder (String _title, int width, int height) {
        super(_title); 
        setVisible(true); // ������� ���������
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // ���������� �������� �������� �� ���������
        setBounds(0, 0, width, height); // ���������� �������
        setLocationRelativeTo(null); // ���������� �������������� ������������
    }

}
//������ ���H ONE UNO EIN EN JEDEN

// GFrameBuilder �� ����� ��� ���� ����� ����� ��� �� ������� jframe � ���� ������������� ��������� �������� ������ ���������� ��������� �������� ��� �������, 
// ����� �� ������� ��������� �� ����������, �������� ������ � ������ � ��������� 

//����. ���� ����� �������� ������ jframe-��. 

//��� ����� jframe: ��� ����� �����

// ����� � ������� �������� ������ ������� ���������� GFrameBuilder �� �������������� ��������� ��������� (������������ ���������).

