package HomePage;

import Login.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class food1 extends JFrame implements ActionListener, MouseListener {
    public food1(){
        Font bigfont = new Font("Arial", Font.BOLD, 40);
        Color lightblue = new Color(51, 204, 255);
        Font font = new Font("Cursive", Font.BOLD, 22);
        Font minifont = new Font("Arial", 1, 22);
        Color purple = new Color(160,32,240);

        this.setSize(1920,1200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        Container c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);

        JButton back = new JButton("<-Back");
        back.setBounds(20,20,130,40);
        back.setFont(font);
        back.setBackground(Color.BLACK);
        back.setForeground(purple);
        back.setFocusable(false);
        c.add(back);
        back.addActionListener(e->{
            Login l = new Login();
            l.setVisible(true);
            setVisible(false);
        });

       ImageIcon food = new ImageIcon("src\\HomePage\\fc.png");
        JLabel i1 = new JLabel(food);
        i1.setBounds(30,10,300,300);
        c.add(i1);

        JLabel wlc = new JLabel("Welcome");
        wlc.setFont(bigfont);
        wlc.setForeground(Color.YELLOW);
        wlc.setBounds(450,80,220,50);
        c.add(wlc);

        JLabel to = new JLabel("To");
        to.setFont(bigfont);
        to.setForeground(Color.YELLOW);
        to.setBounds(550,150,220,50);
        c.add(to);

        JLabel our = new JLabel("Our");
        our.setFont(bigfont);
        our.setForeground(Color.YELLOW);
        our.setBounds(620,200,220,50);
        c.add(our);

        JLabel foodcorner = new JLabel("Food Corner!");
        foodcorner.setFont(bigfont);
        foodcorner.setForeground(Color.YELLOW);
        foodcorner.setBounds(700,260,520,50);
        c.add(foodcorner);

        JPanel breakfast_panel = new JPanel();
        breakfast_panel.setBounds(70,370,500,600);
        breakfast_panel.setLayout(null);
        breakfast_panel.setBackground(Color.BLACK);
        breakfast_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.YELLOW));
        c.add(breakfast_panel);
        breakfast_panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                breakfast_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
                breakfast_panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                breakfast_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.YELLOW));
                breakfast_panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon breakfast_food = new ImageIcon("src\\HomePage\\f2.png");
        JLabel img1 = new JLabel(breakfast_food);
        img1.setBounds(40,40,400,300);
        breakfast_panel.add(img1);
        JLabel b = new JLabel("Delicious & Fresh!");
        b.setBounds(140,370,500,30);
        b.setFont(minifont);
        b.setForeground(Color.YELLOW);
        breakfast_panel.add(b);

        JLabel b2 = new JLabel("Check Out Our BreakFast Menu!");
        b2.setBounds(70,420,500,30);
        b2.setFont(minifont);
        b2.setForeground(Color.YELLOW);
        breakfast_panel.add(b2);

        JButton b3 = new JButton("Check Out!");
        b3.setBounds(160,500,160,40);
        b3.setFont(minifont);
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.BLACK);
        b3.setFocusable(false);
        breakfast_panel.add(b3);
        b3.addActionListener(e->{
            Breakfast B = new Breakfast();
            B.setVisible(true);
            setVisible(false);
        });
        //////////


        JPanel lunch_panel = new JPanel();
        lunch_panel.setBounds(690,370,500,600);
        lunch_panel.setLayout(null);
        lunch_panel.setBackground(Color.BLACK);
        lunch_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.YELLOW));
        c.add(lunch_panel);
        lunch_panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                lunch_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
                lunch_panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lunch_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.YELLOW));
                lunch_panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        ImageIcon lunch_food = new ImageIcon("src\\HomePage\\l.png");
        JLabel img2 = new JLabel(lunch_food);
        img2.setBounds(40,40,400,300);
        lunch_panel.add(img2);

        JLabel b4 = new JLabel("Enough To Satisfy!");
        b4.setBounds(140,370,500,40);
        b4.setFont(minifont);
        b4.setForeground(Color.YELLOW);
        lunch_panel.add(b4);

        JLabel b5 = new JLabel("Have A Look To Our Lunch Menu!");
        b5.setBounds(70,420,500,30);
        b5.setFont(minifont);
        b5.setForeground(Color.YELLOW);
        lunch_panel.add(b5);

        JButton b6 = new JButton("Check Out!");
        b6.setBounds(160,500,160,40);
        b6.setFont(minifont);
        b6.setBackground(Color.ORANGE);
        b6.setForeground(Color.BLACK);
        b6.setFocusable(false);
        lunch_panel.add(b6);
        b6.addActionListener(e->{
            Lunch l = new Lunch();
            l.setVisible(true);
            setVisible(false);
        });
//////////////////

        JPanel dinner_panel = new JPanel();
        dinner_panel.setBounds(1330,370,500,600);
        dinner_panel.setLayout(null);
        dinner_panel.setBackground(Color.BLACK);
        dinner_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.YELLOW));
        c.add(dinner_panel);
        dinner_panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                dinner_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
                dinner_panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                dinner_panel.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.YELLOW));
                dinner_panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        ImageIcon dinner_food = new ImageIcon("src\\HomePage\\d.png");
        JLabel img3 = new JLabel(dinner_food);
        img3.setBounds(40,40,400,300);
        dinner_panel.add(img3);
        JLabel b7 = new JLabel("Enjoy With Taste");
        b7.setBounds(150,370,500,30);
        b7.setFont(minifont);
        b7.setForeground(Color.YELLOW);
        dinner_panel.add(b7);

        JLabel b8 = new JLabel("Order From Our Dinner Menu!");
        b8.setBounds(100,420,500,40);
        b8.setFont(minifont);
        b8.setForeground(Color.YELLOW);
        dinner_panel.add(b8);

        JButton b9 = new JButton("Check Out!");
        b9.setBounds(160,500,160,40);
        b9.setFont(minifont);
        b9.setBackground(Color.ORANGE);
        b9.setForeground(Color.BLACK);
        b9.setFocusable(false);
        dinner_panel.add(b9);
        b9.addActionListener(e->{
            Dinner D = new Dinner();
            D.setVisible(true);
            setVisible(false);
        });

    }

    public static void main(String[] args) {
        food1 f = new food1();
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
