package calculator; // Используем пакет Калькулятор

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JLabel; 

public class calculate implements CalculateInterface{ // Создаем класс калькулэйт использующий КалькулэйтИнтерфейс(его создал Разработчик 3)
	String ka;
 	String ko;
	public static float coef1;
	public static float coef2;
	public static String result;
	
	public static File files;
	public static Scanner scan;
	
	public void raschet()   {
		  
	    files = new File("promo.txt");			//ЧТЕНИЕ ФАЙЛА С КОЭФФИЦИЕНТАМИ 
	     scan = null;
		try {
			scan = new Scanner(new FileInputStream(files));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		ka = scan.next();
		ko = scan.next();
		  
        scan.close();
        coef1 = Float.parseFloat(ka);
    	coef2 = Float.parseFloat(ko);
		    	
		System.out.println("k1"+ coef1 + " k2" + coef2);
	}
		        
	
	
	boolean isResident = false; 
	boolean ychitivatNalog = false;
	float H, T, a, D1,D2, C; // H- налог T-срок вклада a-процент D1-новая сумма вклада(БЕЗ УЧЕТА НАЛОГА) D2-новая сумма вклада(С УЧЕТОМ НАЛОГА)
	String valuta = "Рубли";  //"Рубли" , "Доллары" , "Евро"
	@Override // Переопределяет метод интерфейса
	public void CalculateNalog()
	{
		System.out.println("k1"+ coef1 + " k2" + coef2);
		
		//высчитываем сумму налога
		if(isResident)
			H = (float) ((C* Math.pow(1f+a*30/365, T)-C)-(C*Math.pow(1f+0.0925f*30/365, T)-C))*coef1;
		else
			H = (float) ((C* Math.pow(1f+a*30/365, T)-C)-(C*Math.pow(1f+0.09f*30/365, T)-C))*coef2;
		
	}
	@Override
	public void CalculatePrecent() {
		//высчитываем новую сумму вклада с учетом процентов
		D1 =  (float) (C*Math.pow(1f+a/12, T));
	}
	@Override 
	public void CalculateDohod() {
		//считаем итоговое значение вклада, с учетом или без учета налога
		if(((valuta == "Рубли" & a>=0.0925f) | (valuta != "Рубли" & a>=0.09f)) & ychitivatNalog) {
			D2 = D1 - H;
		result = String.valueOf(D2);
		}
		else {
			D2 = D1;
		result = String.valueOf(D2);
		}
	}
	public calculate(String a_str, String T_str, String C_str, boolean resident, boolean _ychitivatNalog, String _valuta) 
	{
		this.valuta =_valuta;
		this.ychitivatNalog = _ychitivatNalog;
		this.isResident = resident;
		if(!ParseAllData(a_str,T_str,C_str)) 
		{
			// данные не удалось сконвертировать -  ошибка ввода
						OutputDeposit output = new OutputDeposit("Ошибка", 150, 50); //создаем всплывающее окно для вывода результатов
						output.SetData("Ошибка ввода"); //создаем лейбл на нашем окне с текстом ошибки
						return;
					}
		            raschet();
					CalculateDeposit();
					OutputDeposit output = new OutputDeposit("Расчет", 250, 100);
					output.SetData("Сумма вклада составил:" + String.valueOf(D2));
				}
				//проверяем все ли введенные данные являются числами (могут ли быть сконвертированны в Float и не пустые) и запоминаем
				public boolean ParseAllData(String a_str, String T_str, String C_str) 
				{
					if(isFloat(a_str) && a_str.length()!=0)
						a = Float.parseFloat(a_str)/100f;
					else return false;
					if(isFloat(T_str) && T_str.length()!=0)
						T = Float.parseFloat(T_str);
					else return false;
					if(isFloat(C_str) && C_str.length()!=0)
						C = Float.parseFloat(C_str);
					else return false;
					return true;
				}
				//может ли строка быть сконвертирована в Float
				public boolean isFloat(String x) throws NumberFormatException
				{
				    try {
				        Float.parseFloat(x);
				        return true;
				    } catch(Exception e) {
				        return false;
				    }
				}
				public float getFinalValue() {
					return D2; //возвращает итоговое значение вклада
				}
			}
