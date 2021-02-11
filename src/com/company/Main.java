package com.company;

//import java.awt.*;
//import java.awt.event.*;
//public class Main extends Canvas {
//    private int lastX, lastY;
//    private int ex, ey;
//    private boolean clear=false;
//
//    public Main () {
//        super();
//        addMouseListener(new MouseAdapter() {
//            public void mousePressed(MouseEvent e) {
//                lastX = e.getX();
//                lastY = e.getY();
//            }
//        });
//
//        addMouseMotionListener(new MouseMotionAdapter() {
//            public void mouseDragged(MouseEvent e) {
//                ex=e.getX();
//                ey=e.getY();
//                repaint();
//            }
//        });
//
//        addKeyListener(new KeyAdapter() {
//            public void keyTyped(KeyEvent e) {
//                if (e.getKeyChar()==' ') {
//                    clear = true;
//                    repaint();
//                }
//            }
//        });
//    }
//
//    public void update(Graphics g) {
//        if (clear) {
//            g.clearRect(0, 0, getWidth(), getHeight());
//            clear = false;
//        } else {
//            g.drawLine(lastX, lastY, ex, ey);
//            lastX=ex;
//            lastY=ey;
//        }
//    }
//    public static void main(String s[]) {
//        final Frame f = new Frame("Draw");
//        f.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                f.dispose();
//            }
//        });
//        Checkbox payment = new
//                Checkbox("Оплата в кредит");
//        payment.setBounds(10, 10, 120, 20);
//        f.add(payment);
//        Checkbox delivery = new Checkbox("Доставка");
//        delivery.setBounds(10, 30, 120, 20);
//        f.add(delivery);
//        Choice color = new Choice();
//        color.add("Белый");
//        color.add("Зеленый");
//        color.add("Синий");
//        color.add("Черный");
//        f.add(color);
//        List accessories = new List(3);
//        accessories.add("Чехол");
//        accessories.add("Наушники");
//        accessories.add("Аккумулятор");
//        accessories.add("Блок питания");
//        f.add(accessories);
//        f.setSize(400, 300);
//        f.setLayout(new FlowLayout(FlowLayout.LEFT));
//        f.add(new Label("Test"));
//        f.add(new Button("Long string"));
//        f.add(new TextArea(2, 20));
//
//        final Canvas c = new Main();
//        f.add(c);
//
//        f.setVisible(true);
//    }
//}


//----------------------------------------------------
//// Многослойная панель JLayeredPane
//----------------------------------------------------
//
//import javax.swing.*;
//import java.awt.*;
//
//// класс рисования двух типов фигур с текстом
//class Figure extends JComponent
//{
//    private static final long serialVersionUID = 1L;
//    private Color color;
//    private int type;
//    private String text;
//    // параметры: цвет и тип фигуры
//    Figure(Color color, int type, String text) {
//        this.color = color;
//        this.type = type;
//        this.text = text;
//        setOpaque(false);
//    }
//    public void paintComponent(Graphics g) {
//        // прорисовка фигуры
//        g.setColor(color);
//        switch (type) {
//            case 0: g.fillOval(0, 0, 90, 90); break;
//            case 1: g.fillRect(0, 0, 130, 80); break;
//        }
//        g.setColor(Color.yellow);
//        g.drawString(text, 10, 35);
//    }
//}
//public class Main extends JFrame
//{
//    private static final long serialVersionUID = 1L;
//
//    public Main()
//    {
//        // создание окна
//        super("Example LayeredTest");
//        // выход при закрытии окна
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        // определение многослойной панели
//        JLayeredPane lp = getLayeredPane();
//        // создание трех фигур
//        Figure figure1 = new Figure(Color.red , 0, "Figure popup");
//        Figure figure2 = new Figure(Color.blue, 0, "Figure 1");
//        Figure figure3 = new Figure(Color.cyan, 1, "Figure 2");
//        // определение местоположения фигур в окне
//        figure1.setBounds(10, 40, 120, 120);
//        figure2.setBounds(60, 120, 160, 180);
//        figure3.setBounds(90, 55, 250, 180);
//        // добавление фигур в различные слои
//        lp.add(figure1, JLayeredPane.POPUP_LAYER  );
//        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
//        lp.add(figure3, JLayeredPane.PALETTE_LAYER);
//        // смена позиции одной из фигур
//        lp.setPosition(figure3, 0);
//        // определение размера и открытие окна
//        setSize(280, 250);
//        setVisible(true);
//    }
//    public static void main(String[] args)
//    {
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        new Main();
//    }
//}


//----------------------------------------------------
//Пример использования прозрачной панели Swing JOptionPane
//----------------------------------------------------
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//
//
//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.UIManager;
//
//public class Main extends JFrame
//{
//    private static final long serialVersionUID = 1L;
//
//    public static final Font FONT = new Font("Verdana", Font.PLAIN, 11);
//
//    public static void createGUI()
//    {
//        JFrame frame = new JFrame("Test JOptionPane");
//
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//
//        frame.addWindowListener(new WindowListener() {
//
//            public void windowActivated(WindowEvent event) {}
//
//            public void windowClosed(WindowEvent event) {}
//
//
//            public void windowDeactivated(WindowEvent event) {}
//
//            public void windowDeiconified(WindowEvent event) {}
//
//            public void windowIconified(WindowEvent event) {}
//
//            public void windowOpened(WindowEvent event) {}
//
//            public void windowClosing(WindowEvent event)
//            {
//                Object[] options = { "Да", "Нет!" };
//                int rc = JOptionPane.showOptionDialog(
//                        event.getWindow(), "Закрыть окно?",
//                        "Подтверждение", JOptionPane.YES_NO_OPTION,
//                        JOptionPane.QUESTION_MESSAGE,
//                        null, options, options[0]);
//                if (rc == 0) {
//                    event.getWindow().setVisible(false);
//                    System.exit(0);
//                }
//            }
//        });
//        JLabel label = new JLabel("Использование прозрачной панели при закрытии окна");
//        frame.getContentPane().add(label);
//
//        frame.setPreferredSize(new Dimension(350, 80));
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                UIManager.put("Button.font", FONT);
//                UIManager.put("Label.font", FONT);
//                JFrame.setDefaultLookAndFeelDecorated(true);
//                JDialog.setDefaultLookAndFeelDecorated(true);
//                createGUI();
//            }
//        });
//    }
//}

//----------------------------
//------------Пример JWindow--------------
//-------------------------
//
// Пример использования окна без рамки JWindow

//import javax.swing.*;
//
//import java.awt.*;
//
//// Класс прорисовки изображения
//class ImageDraw extends JComponent
//{
//    private Image capture;
//    ImageDraw (Image capture) {
//        this.capture = capture;
//    }
//    public void paintComponent(Graphics g) {
//        // Прорисовка изображения
//        g.drawImage(capture, 0, 0, this);
//    }
//}
//public class Main extends JWindow
//{
//    // изображение "рабочего стола"
//    private Image capture;
//    // Размер окна
//    private int window_w = 300, window_h = 300;
//
//    public Main() {
//        super();
//        // Определение положение окна на экране
//        setLocation(200, 100);
//        // Определение размера окна
//        setSize (window_w, window_h);
//        try {
//            // "Вырезаем" часть изображения "рабочего стола"
//            Robot robot = new Robot();
//            capture = robot.createScreenCapture(
//                    new Rectangle(5, 5, window_w, window_h));
//        } catch (Exception ex) { ex.printStackTrace(); }
//        // Добавляем в интерфейс изображение
//        getContentPane().add(new ImageDraw(capture));
//        // Открываем окно
//        setVisible(true);
//        try {
//            // Заканчиваем работу через 10 сек
//            Thread.currentThread();
//            Thread.sleep(10000);
//        } catch (Exception e) { }
//        System.exit(0);
//    }
//    public static void main(String[] args) {
//        new Main();
//    }
//}
//
////----------------------------------------------------
////JFrame пример
//----------------------------------------------------
/*import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame
{
    private static final long serialVersionUID = 1L;
    private static int    counter = 0; // счетчик
    private static JLabel label   = null;
    private static String TEMPL   = "Закрытие окна (попыток %d)";
    public Main ()
    {
        // Создание окна с заголовком
        JFrame frame = new JFrame("JFrameWindowListener");
        // Не закрывать окно по нажатию на кнопку с крестиком
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Подключение слушателя окна
        frame.addWindowListener(new WindowListener() {

            public void windowActivated  (WindowEvent event) {}
            public void windowClosed     (WindowEvent event) {}
            public void windowDeactivated(WindowEvent event) {}
            public void windowDeiconified(WindowEvent event) {}
            public void windowIconified  (WindowEvent event) {}
            public void windowOpened     (WindowEvent event) {}
            // Метод обработки события "Закрытие окна"
            public void windowClosing (WindowEvent event) {
                if (++counter == 5) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                } else
                    label.setText(String.format(TEMPL, counter));
            }
        });
        label = new JLabel(String.format(TEMPL, counter));
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(250, 80));
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main();
    }
}*/


//----------------------------------------------------
// * Тестовый класс создания диалоговых окон
//----------------------------------------------------
//import javax.swing.*;
//import java.awt.event.*;
//
//public class Main extends JFrame
//{
//    private static final long serialVersionUID = 1L;
//    public Main() {
//        super("DialogWindows");
//        // Выход из программы при закрытии
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        // Кнопки для создания диалоговых окон
//        JButton button1 = new JButton("Немодальное окно");
//        button1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                JDialog dialog = createDialog("Немодальное", false);
//                dialog.setVisible(true);
//            }
//        });
//        JButton button2 = new JButton("Модальное окно");
//        button2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                JDialog dialog = createDialog("Модальное", true);
//                dialog.setVisible(true);
//            }
//        });
//        // Создание панели содержимого с размещением кнопок
//        JPanel contents = new JPanel();
//        contents.add(button1);
//        contents.add(button2);
//        setContentPane(contents);
//        // Определение размера и открытие окна
//        setSize(350, 100);
//        setVisible(true);
//    }
//    /** Функция создания диалогового окна.
//     * @param title - заголовок окна
//     * @param modal - флаг модальности
//     */
//    private JDialog createDialog(String title, boolean modal)
//    {
//        JDialog dialog = new JDialog(this, title, modal);
//        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        dialog.setSize(180, 90);
//        return dialog;
//    }
//
//    public static void main(String[] args)
//    {
//        new Main();
//    }
//}

//----------------------------------------------------
// Оформление окон Swing
//----------------------------------------------------
//import javax.swing.*;
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        // Подключение украшений для окон
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        JDialog.setDefaultLookAndFeelDecorated(true);
//        // Создание окна с рамкой
//        JFrame frame = new JFrame("Oкнo с рамкой");
//        // Определение способа завершения работы программы
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(200, 200);
//        frame.setVisible(true);
//        // Создание диалогового окна
//        JDialog dialog = new JDialog(frame, "Диалоговое окно");
//        // Определение способа завершения работы диалогового окна
//        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//        dialog.setSize(150, 100);
//        // Определение типа оформления диалогового окна
//        dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
//        dialog.setVisible(true);
//    }
//}





