package calculator;
public interface CalculateInterface{
	
	//����� ������� ����� ������� ����� ���
	default void CalculateDeposit() {
		CalculateNalog();
		CalculatePrecent();
		CalculateDohod();
	}
	
	void CalculateNalog(); //���������� �����
	void CalculatePrecent(); //���������� ����� �� ���������
	void CalculateDohod(); //������� �������� �����
	
}
