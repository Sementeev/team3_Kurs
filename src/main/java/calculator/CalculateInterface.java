package Calcul;
public interface CalculateInterface{
	
	//метод который будет считать сразу все
	default void CalculateAll() {
		CalculateNalog();
		CalculatePrecent();
		CalculateDohod();
	}
	
	void CalculateNalog(); //выстиываем налог
	void CalculatePrecent(); //выстиываем доход по процентам
	void CalculateDohod(); //считаем итоговый доход
	
}