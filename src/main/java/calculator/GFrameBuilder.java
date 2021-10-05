package calculator;

import javax.swing.JFrame;

public abstract class GFrameBuilder extends JFrame {


    public GFrameBuilder (String _title, int width, int height) {
        super(_title); 
        setVisible(true); // сделать видимость
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // установить Операцию Закрытия По Умолчанию
        setBounds(0, 0, width, height); // установить Границы
        setLocationRelativeTo(null); // установить местоположение Относительно
    }

}
//РАЗРАБ ОДИH ONE UNO EIN EN JEDEN

// GFrameBuilder он нужен для того чтобы когда кто то создают jframe у него автоматически создается название окошка сообщается автоматом дейстиве при выходом, 
// когда на крестик нажимаешь он выключется, задается высоат и ширина в пискселях 

//Итог. Этот класс упрощает задачу jframe-ов. 

//Что такое jframe: это любая форма

// Когда я создаею екземляр класса который рассширяет GFrameBuilder то оавтомктически задааются параметры (производится настройка).

