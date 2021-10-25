package Calcul; // Используем пакет Калькулятор

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JLabel; 

public class Calculate implements CalculateInterface{ // Создаем класс калькулэйт использующий КалькулэйтИнтерфейс(его создал Разработчик 3)
	String ka;
 	String ko;
	public static float coef1;
	public static float coef2;
	public static File files;
	public static Scanner scan;
	public static String result;
		        
	protected static String line;
	
	boolean isResident = false; 
	boolean ychitivatNalog = false;
	float H, T, a, D1,D2, C; // H- налог T-срок вклада a-процент D1-новая сумма вклада(БЕЗ УЧЕТА НАЛОГА) D2-новая сумма вклада(С УЧЕТОМ НАЛОГА)
	String valuta = "Рубли"; //"Рубли" , "Доллары" , "Евро"
	@Override // Переопределяет метод интерфейса
	public void CalculateNalog()
	{
try {
				
			String sepka = File.separator;
			String filepath = "";
	        try {
	            filepath = new File("").getCanonicalPath();
	        } catch (IOException e3) {
	            // TODO Auto-generated catch block
	            e3.printStackTrace();
	        }
	        filepath+= sepka+"prem.txt";
	        
	        //System.out.println("FilePath:"+filepath);
	        File file = new File(filepath);
				
			//File file = new File("prem.txt");
			//СЃРѕР·РґР°РµРј РѕР±СЉРµРєС‚ FileReader РґР»СЏ РѕР±СЉРµРєС‚Р° File
			FileReader fr = new FileReader(file);
			//СЃРѕР·РґР°РµРј BufferedReader СЃ СЃСѓС‰РµСЃС‚РІСѓСЋС‰РµРіРѕ FileReader РґР»СЏ РїРѕСЃС‚СЂРѕС‡РЅРѕРіРѕ СЃС‡РёС‚С‹РІР°РЅРёСЏ
			BufferedReader reader = new BufferedReader(fr);
			// СЃС‡РёС‚Р°РµРј СЃРЅР°С‡Р°Р»Р° РїРµСЂРІСѓСЋ СЃС‚СЂРѕРєСѓ
			line = reader.readLine();


			
			coef1 = Float.parseFloat(line);
			System.out.println(coef1);
			coef2 = Float.parseFloat(line);
			System.out.println(coef1);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			coef1 = 1; //esli nety faila
			coef2 = 1; //esli nety faila
			} catch (IOException e) {
			e.printStackTrace();
			}	
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
		if(((valuta == "Рубли" & a>=0.0925f) | (valuta != "Рубли" & a>=0.09f)) & ychitivatNalog)
			D2 = D1 - H;
		else
			D2 = D1;
	}
	public Calculate(String a_str, String T_str, String C_str, boolean resident, boolean _ychitivatNalog, String _valuta) // Конструктор
	{
		this.valuta =_valuta;
		this.ychitivatNalog = _ychitivatNalog;
		this.isResident = resident;
		if(!ParseAllData(a_str,T_str,C_str)) 
		{
			// РґР°РЅРЅС‹Рµ РЅРµ СѓРґР°Р»РѕСЃСЊ СЃРєРѕРЅРІРµСЂС‚РёСЂРѕРІР°С‚СЊ -  РѕС€РёР±РєР° РІРІРѕРґР°
			JFrameText output = new JFrameText("Error", 150, 50); //СЃРѕР·РґР°РµРј РІСЃРїР»С‹РІР°СЋС‰РµРµ РѕРєРЅРѕ РґР»СЏ РІС‹РІРѕРґР° СЂРµР·СѓР»СЊС‚Р°С‚РѕРІ
			output.SetData("Input error"); //СЃРѕР·РґР°РµРј Р»РµР№Р±Р» РЅР° РЅР°С€РµРј РѕРєРЅРµ СЃ С‚РµРєСЃС‚РѕРј РѕС€РёР±РєРё
			return;
		}
		CalculateAll();
		JFrameText output = new JFrameText("Calculation", 550, 100);
		output.SetData("Result: " + String.valueOf(D2));
		result = String.valueOf(D2);
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
