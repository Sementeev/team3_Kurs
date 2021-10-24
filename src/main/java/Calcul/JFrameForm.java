package Calcul;

import javax.swing.JFrame;

public abstract class JFrameForm extends JFrame {


    public JFrameForm (String _title, int width, int height) {
        super(_title); 
        setVisible(true); // видимость
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // операция закрытия по умолчанию
        setBounds(0, 0, width, height); // границы крестика
        setLocationRelativeTo(null); // установить местоположение относительно
    }

}

// автоматически создается название окошка, выход, задается высота и ширина 

// упрощает задачу jframe-ов  (любых форм)

// при создании экземпляра класса, который расширяет GFrameBuilder, 
// то автоматически задаются параметры (производится настройка).

