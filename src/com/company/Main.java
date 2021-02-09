package com.company;

import java.awt.*;
import java.awt.event.*;
public class Main extends Canvas {
    private int lastX, lastY;
    private int ex, ey;
    private boolean clear=false;

    public Main () {
        super();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                ex=e.getX();
                ey=e.getY();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') {
                    clear = true;
                    repaint();
                }
            }
        });
    }

    public void update(Graphics g) {
        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX=ex;
            lastY=ey;
        }
    }
    public static void main(String s[]) {
        final Frame f = new Frame("Draw");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        Checkbox payment = new
                Checkbox("Оплата в кредит");
        payment.setBounds(10, 10, 120, 20);
        f.add(payment);
        Checkbox delivery = new Checkbox("Доставка");
        delivery.setBounds(10, 30, 120, 20);
        f.add(delivery);
        Choice color = new Choice();
        color.add("Белый");
        color.add("Зеленый");
        color.add("Синий");
        color.add("Черный");
        f.add(color);
        List accessories = new List(3);
        accessories.add("Чехол");
        accessories.add("Наушники");
        accessories.add("Аккумулятор");
        accessories.add("Блок питания");
        f.add(accessories);
        f.setSize(400, 300);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(new Label("Test"));
        f.add(new Button("Long string"));
        f.add(new TextArea(2, 20));

        final Canvas c = new Main();
        f.add(c);

        f.setVisible(true);
    }
}



//package com.company;
//
//import javax.swing.*;
//import java.applet.Applet;
//import java.awt.*;
//import java.awt.event.*;
//public class Main extends Applet implements ActionListener{
//    String colorNames[] = {"Gray","Red","Blue","White"};
//    Color colors[] = {Color.gray,Color.red,Color.blue,Color.white};
//    PopupMenu pm;
//    public void init()
//    {
//        setBackground(Color.gray);
//        pm = new PopupMenu("Фоновый цвет");
//        MenuItem colorName;
//        for ( int i = 0; i <colorNames.length; i++)
//        {
//            colorName = new MenuItem(colorNames[i]);
//            pm.add(colorName);
//            colorName.addActionListener(this);
//            pm.addSeparator();
//        }
//        add(pm);
//        MouseListener ml = new MouseAdapter()
//        {
//            public void mouseReleased(MouseEvent e)
//            {
//                pm.show(e.getComponent(),e.getX(),e.getY());
//            }
//        };
//        addMouseListener(ml);
//    }
//    public void actionPerformed(ActionEvent e)
//    {
//        setBackground(getColor(e.getActionCommand()));
//    }
//    private Color getColor(String name)
//    {
//        for ( int i = 0; i <colorNames.length; i++)
//        {
//            if (colorNames[i].equals(name))
//                return colors[i];
//        }
//        return Color.white;
//    }
//    public static void main(String[] args) {
//        JFrame frame = new JFrame ("Пример");
//        int width = 800;
//        int height = 300;
//        Main appl = new Main();
//        appl.init();
//        frame.getContentPane().add(appl);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(width,height);
//        frame.setVisible(true);
//    }}


