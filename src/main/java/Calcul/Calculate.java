package Calcul; // Р�СЃРїРѕР»СЊР·СѓРµРј РїР°РєРµС‚ РљР°Р»СЊРєСѓР»СЏС‚РѕСЂ

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel; 

public class Calculate implements CalculateInterface{ // РЎРѕР·РґР°РµРј РєР»Р°СЃСЃ Calculate РёСЃРїРѕР»СЊР·СѓСЋС‰РёР№ CalculateInterface
	public static String result;
	boolean isPremia = false; 
	boolean ychitivatNalog = false;
	public static float H, T, a, D1,D2, C, Z, X, c; // H- Р Р…Р В°Р В»Р С•Р С– T-РЎвЂљР В°РЎР‚Р С‘РЎвЂћР Р…Р В°РЎРЏ РЎРѓРЎвЂљР В°Р Р†Р С”Р В° a-Р С—РЎР‚Р С•РЎвЂ Р ВµР Р…РЎвЂљ Р С—РЎР‚Р ВµР С�Р С‘Р С‘ D1-Р Р…Р С•Р Р†Р В°РЎРЏ РЎРѓРЎС“Р С�Р С�Р В° Р В·Р В°РЎР‚Р С—Р В»Р В°РЎвЂљРЎвЂ№(Р вЂ�Р вЂўР вЂ” Р Р€Р В§Р вЂўР СћР С’ Р СњР вЂќР В¤Р вЂє) D2-Р Р…Р С•Р Р†Р В°РЎРЏ РЎРѓРЎС“Р С�Р С�Р В° Р Р†Р С”Р В»Р В°Р Т‘Р В°(Р РЋ Р Р€Р В§Р вЂўР СћР С›Р Сљ Р СњР вЂќР В¤Р вЂє) Р РЋ-
	protected static String line;
	@Override // Р СџР ВµРЎР‚Р ВµР С•Р С—РЎР‚Р ВµР Т‘Р ВµР В»РЎРЏР ВµРЎвЂљ Р С�Р ВµРЎвЂљР С•Р Т‘ Р С‘Р Р…РЎвЂљР ВµРЎР‚РЎвЂћР ВµР в„–РЎРѓР В°
	public void CalculateNalog()
	{
		if(isPremia) {
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


			
			c = Float.parseFloat(line);
			System.out.println(c);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			c = 1; //esli nety faila
			} catch (IOException e) {
			e.printStackTrace();
			}

			
			H = (float) (T*Z*X)*c;
		}else {
			H = (float) (T*Z*X);
		}
		}
	@Override
	public void CalculatePrecent() {
		//РІС‹СЃС‡РёС‚С‹РІР°РµРј РЅРѕРІСѓСЋ СЃСѓРјРјСѓ Р·Рї СЃ СѓС‡РµС‚РѕРј РїСЂРѕС†РµРЅС‚РѕРІ
		D1 =  (float) H;
	}
	@Override 
	public void CalculateDohod() {
		//СЃС‡РёС‚Р°РµРј РёС‚РѕРіРѕРІРѕРµ Р·РЅР°С‡РµРЅРёРµ Р·Рї, СЃ СѓС‡РµС‚РѕРј РёР»Рё Р±РµР· СѓС‡РµС‚Р° РЅР°Р»РѕРіР°
		if (ychitivatNalog)
			D2 = (float) (H * 0.87);
		else
			D2 = D1;
	}
	public Calculate(String X_str, String Z_str, String T_str, boolean premia, boolean _ychitivatNalog) // РљРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ
	{
	
		this.ychitivatNalog = _ychitivatNalog;
		this.isPremia = premia;
		if(!ParseAllData(X_str,Z_str,T_str)) 
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
	//РїСЂРѕРІРµСЂСЏРµРј РІСЃРµ Р»Рё РІРІРµРґРµРЅРЅС‹Рµ РґР°РЅРЅС‹Рµ СЏРІР»СЏСЋС‚СЃСЏ С‡РёСЃР»Р°РјРё (РјРѕРіСѓС‚ Р»Рё Р±С‹С‚СЊ СЃРєРѕРЅРІРµСЂС‚РёСЂРѕРІР°РЅРЅС‹ РІ Float Рё РЅРµ РїСѓСЃС‚С‹Рµ) Рё Р·Р°РїРѕРјРёРЅР°РµРј
	public boolean ParseAllData(String X_str, String Z_str, String T_str) 
	{
		if(isFloat(X_str) && X_str.length()!=0)
			X = Float.parseFloat(X_str);
		else return false;
		if(isFloat(Z_str) && Z_str.length()!=0)
			Z = Float.parseFloat(Z_str);
		else return false;
		if(isFloat(T_str) && T_str.length()!=0)
			T = Float.parseFloat(T_str);
		else return false;
		return true;
	}
	//РјРѕР¶РµС‚ Р»Рё СЃС‚СЂРѕРєР° Р±С‹С‚СЊ СЃРєРѕРЅРІРµСЂС‚РёСЂРѕРІР°РЅР° РІ Float
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
		return D2; //РІРѕР·РІСЂР°С‰Р°РµС‚ РёС‚РѕРіРѕРІРѕРµ Р·РЅР°С‡РµРЅРёРµ 
	}
}
