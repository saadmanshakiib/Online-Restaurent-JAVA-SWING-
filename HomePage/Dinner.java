package HomePage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dinner extends JFrame implements ActionListener, MouseListener {
    public Dinner(){
        Font bigfont = new Font("Monospaced", Font.BOLD, 40);
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
        back.setFont(minifont);
        back.setBackground(Color.BLACK);
        back.setForeground(purple);
        back.setFocusable(false);
        c.add(back);
        back.addActionListener(e->{
            food1 l = new food1();
            l.setVisible(true);
            setVisible(false);
        });

        JPanel panel1 = new JPanel();
        panel1.setBounds(20,180,300,400);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);
        c.add(panel1);
        panel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        JLabel pickup = new JLabel("Pick Up Your Favorite Items!");
        pickup.setFont(bigfont);
        pickup.setBounds(20,100,700,40);
        pickup.setForeground(Color.ORANGE);
        c.add(pickup);

        ImageIcon b1 = new ImageIcon("src\\HomePage\\l1.png");
        JLabel p1 = new JLabel(b1);
        p1.setBounds(25,0,250,250);
        panel1.add(p1);

        JLabel B1 = new JLabel("North Indian Plater");
        B1.setBounds(50,250,200,40);
        B1.setFont(minifont);
        B1.setForeground(Color.ORANGE);
        panel1.add(B1);

        ImageIcon s = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating1 = new JLabel(s);
        rating1.setBounds(80,290,30,30);
        panel1.add(rating1);

        JLabel r1 = new JLabel("4.3 / 5.00");
        r1.setBounds(120,290,100,30);
        r1.setFont(minifont);
        r1.setForeground(Color.ORANGE);
        panel1.add(r1);

        JButton order1 = new JButton("Order!");
        order1.setFont(minifont);
        order1.setBounds(100,330,100,40);
        order1.setFocusable(false);
        order1.setForeground(Color.BLACK);
        order1.setBackground(Color.ORANGE);
        panel1.add(order1);
        order1.addActionListener(e->{
            selection s1 = new selection(350);
            s1.setVisible(true);
        });
        order1.addActionListener(e->{
            selection s1 = new selection(350);
            s1.setVisible(true);
            setVisible(false);
        });


        /////panel 2
        JPanel panel2 = new JPanel();
        panel2.setBounds(360,180,300,400);
        panel2.setBackground(Color.black);
        panel2.setLayout(null);
        c.add(panel2);
        panel2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b2 = new ImageIcon("src\\HomePage\\l2.png");
        JLabel p2 = new JLabel(b2);
        p2.setBounds(25,0,250,250);
        panel2.add(p2);
        JLabel B2 = new JLabel("Chicken With Plain Rice");
        B2.setBounds(50,250,300,40);
        B2.setFont(minifont);
        B2.setForeground(Color.ORANGE);
        panel2.add(B2);

        ImageIcon s2 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating2 = new JLabel(s2);
        rating2.setBounds(80,290,30,30);
        panel2.add(rating2);

        JLabel r2 = new JLabel("4.1 / 5.00");
        r2.setBounds(120,290,100,30);
        r2.setFont(minifont);
        r2.setForeground(Color.ORANGE);
        panel2.add(r2);

        JButton order2 = new JButton("Order!");
        order2.setFont(minifont);
        order2.setBounds(100,330,100,40);
        order2.setFocusable(false);
        order2.setForeground(Color.BLACK);
        order2.setBackground(Color.ORANGE);
        panel2.add(order2);
        order2.addActionListener(e->{
            selection s1 = new selection(350);
            s1.setVisible(true);
            setVisible(false);
        });


        ///panel3
        JPanel panel3 = new JPanel();
        panel3.setBounds(700,180,300,400);
        panel3.setBackground(Color.black);
        panel3.setLayout(null);
        c.add(panel3);
        panel3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b3 = new ImageIcon("src\\HomePage\\l3.png");
        JLabel p3 = new JLabel(b3);
        p3.setBounds(25,0,250,250);
        panel3.add(p3);
        JLabel B3 = new JLabel("Non Veg Special Plate");
        B3.setBounds(50,250,250,40);
        B3.setFont(minifont);
        B3.setForeground(Color.ORANGE);
        panel3.add(B3);

        JLabel r3 = new JLabel("4.4 / 5.00");
        r3.setBounds(120,290,100,30);
        r3.setFont(minifont);
        r3.setForeground(Color.ORANGE);
        panel3.add(r3);
        ImageIcon s3 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating3 = new JLabel(s3);
        rating3.setBounds(80,290,30,30);
        panel3.add(rating3);

        JButton order3 = new JButton("Order!");
        order3.setFont(minifont);
        order3.setBounds(100,330,100,40);
        order3.setFocusable(false);
        order3.setForeground(Color.BLACK);
        order3.setBackground(Color.ORANGE);
        panel3.add(order3);
        order3.addActionListener(e->{
            selection s1 = new selection(370);
            s1.setVisible(true);
            setVisible(false);
        });


///////////////panel 4
        JPanel panel4 = new JPanel();
        panel4.setBounds(1030,180,300,400);
        panel4.setBackground(Color.black);
        panel4.setLayout(null);
        c.add(panel4);
        panel4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel4.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b4 = new ImageIcon("src\\HomePage\\l4.png");
        JLabel p4 = new JLabel(b4);
        p4.setBounds(25,0,250,250);
        panel4.add(p4);
        JLabel B4 = new JLabel("Kacchi Biriyani");
        B4.setBounds(90,250,200,40);
        B4.setFont(minifont);
        B4.setForeground(Color.ORANGE);
        panel4.add(B4);
        ImageIcon s4 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating4 = new JLabel(s4);
        rating4.setBounds(60,290,30,30);
        panel4.add(rating4);

        JLabel r4 = new JLabel("4.5 / 5.00");
        r4.setBounds(100,290,140,30);
        r4.setFont(minifont);
        r4.setForeground(Color.ORANGE);
        panel4.add(r4);

        JButton order4 = new JButton("Order!");
        order4.setFont(minifont);
        order4.setBounds(100,330,100,40);
        order4.setFocusable(false);
        order4.setForeground(Color.BLACK);
        order4.setBackground(Color.ORANGE);
        panel4.add(order4);
        order4.addActionListener(e->{
            selection s1 = new selection(370);
            s1.setVisible(true);
            setVisible(false);
        });

        //////////panel5
        JPanel panel5 = new JPanel();
        panel5.setBounds(1360,180,300,400);
        panel5.setBackground(Color.black);
        panel5.setLayout(null);
        c.add(panel5);
        panel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel5.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b5 = new ImageIcon("src\\HomePage\\l5.png");
        JLabel p5 = new JLabel(b5);
        p5.setBounds(25,0,250,250);
        panel5.add(p5);
        JLabel B5 = new JLabel("Chicken Tehari");
        B5.setBounds(90,250,200,40);
        B5.setFont(minifont);
        B5.setForeground(Color.ORANGE);
        panel5.add(B5);
        ImageIcon s5 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating5 = new JLabel(s5);
        rating5.setBounds(80,290,30,30);
        panel5.add(rating5);

        JLabel r5 = new JLabel("4.5 / 5.00");
        r5.setBounds(120,290,140,30);
        r5.setFont(minifont);
        r5.setForeground(Color.ORANGE);
        panel5.add(r5);

        JButton order5 = new JButton("Order!");
        order5.setFont(minifont);
        order5.setBounds(100,330,100,40);
        order5.setFocusable(false);
        order5.setForeground(Color.BLACK);
        order5.setBackground(Color.ORANGE);
        panel5.add(order5);
        order5.addActionListener(e->{
            selection s1 = new selection(340);
            s1.setVisible(true);
            setVisible(false);
        });


        JLabel drinkheader = new JLabel("Add Some Drinks To Your Food!");
        drinkheader.setBounds(50,620,800,40);
        drinkheader.setFont(bigfont);
        drinkheader.setForeground(Color.ORANGE);
        c.add(drinkheader);

        ///drinkspanel1

        JPanel panel6 = new JPanel();
        panel6.setBounds(20,670,300,400);
        panel6.setBackground(Color.black);
        panel6.setLayout(null);
        c.add(panel6);
        panel6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel6.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b6 = new ImageIcon("src\\HomePage\\lemonade.png");
        JLabel p6 = new JLabel(b6);
        p6.setBounds(25,0,250,200);
        panel6.add(p6);

        JLabel B6 = new JLabel("Lemonade");
        B6.setBounds(90,250,200,40);
        B6.setFont(minifont);
        B6.setForeground(Color.ORANGE);
        panel6.add(B6);

        ImageIcon s6 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating6 = new JLabel(s6);
        rating6.setBounds(80,290,30,30);
        panel6.add(rating6);

        JLabel r6 = new JLabel("4.0 / 5.00");
        r6.setBounds(120,290,100,30);
        r6.setFont(minifont);
        r6.setForeground(Color.ORANGE);
        panel6.add(r6);

        JButton order6 = new JButton("Order!");
        order6.setFont(minifont);
        order6.setBounds(100,330,100,40);
        order6.setFocusable(false);
        order6.setForeground(Color.BLACK);
        order6.setBackground(Color.ORANGE);
        panel6.add(order6);
        order6.addActionListener(e->{
            selection s1 = new selection(120);
            s1.setVisible(true);
            setVisible(false);
        });


        //drink panel 2/7
        JPanel panel7 = new JPanel();
        panel7.setBounds(360,670,300,400);
        panel7.setBackground(Color.black);
        panel7.setLayout(null);
        c.add(panel7);
        panel7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel7.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b7 = new ImageIcon("src\\HomePage\\ms.png");
        JLabel p7 = new JLabel(b7);
        p7.setBounds(25,0,250,250);
        panel7.add(p7);
        JLabel B7 = new JLabel("Milk Shake");
        B7.setBounds(100,250,200,40);
        B7.setFont(minifont);
        B7.setForeground(Color.ORANGE);
        panel7.add(B7);

        ImageIcon s7 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating7 = new JLabel(s7);
        rating7.setBounds(80,290,30,30);
        panel7.add(rating7);

        JLabel r7 = new JLabel("4.5 / 5.00");
        r7.setBounds(120,290,100,30);
        r7.setFont(minifont);
        r7.setForeground(Color.ORANGE);
        panel7.add(r7);

        JButton order7 = new JButton("Order!");
        order7.setFont(minifont);
        order7.setBounds(100,330,100,40);
        order7.setFocusable(false);
        order7.setForeground(Color.BLACK);
        order7.setBackground(Color.ORANGE);
        panel7.add(order7);
        order7.addActionListener(e->{
            selection s1 = new selection(100);
            s1.setVisible(true);
            setVisible(false);
        });


        //drinkpanel 3/8
        JPanel panel8 = new JPanel();
        panel8.setBounds(690,670,300,400);
        panel8.setBackground(Color.black);
        panel8.setLayout(null);
        c.add(panel8);
        panel8.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel8.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b8 = new ImageIcon("src\\HomePage\\o.png");
        JLabel p8 = new JLabel(b8);
        p8.setBounds(25,0,250,250);
        panel8.add(p8);
        JLabel B8 = new JLabel("Orange Juice");
        B8.setBounds(90,250,200,40);
        B8.setFont(minifont);
        B8.setForeground(Color.ORANGE);
        panel8.add(B8);

        ImageIcon s8 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating8 = new JLabel(s8);
        rating8.setBounds(80,290,30,30);
        panel8.add(rating8);

        JLabel r8 = new JLabel("4.4 / 5.00");
        r8.setBounds(120,290,100,30);
        r8.setFont(minifont);
        r8.setForeground(Color.ORANGE);
        panel8.add(r8);

        JButton order8 = new JButton("Order!");
        order8.setFont(minifont);
        order8.setBounds(100,330,100,40);
        order8.setFocusable(false);
        order8.setForeground(Color.BLACK);
        order8.setBackground(Color.ORANGE);
        panel8.add(order8);
        order8.addActionListener(e->{
            selection s1 = new selection(100);
            s1.setVisible(true);
            setVisible(false);
        });

//drinkpanel 4/9

        JPanel panel9 = new JPanel();
        panel9.setBounds(1030,670,300,400);
        panel9.setBackground(Color.black);
        panel9.setLayout(null);
        c.add(panel9);
        panel9.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel9.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b9 = new ImageIcon("src\\HomePage\\mango.png");
        JLabel p9 = new JLabel(b9);
        p9.setBounds(25,0,250,250);
        panel9.add(p9);
        JLabel B9 = new JLabel("Mango Juice");
        B9.setBounds(90,250,200,40);
        B9.setFont(minifont);
        B9.setForeground(Color.ORANGE);
        panel9.add(B9);
        ImageIcon s9 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating9 = new JLabel(s9);
        rating4.setBounds(60,290,30,30);
        panel9.add(rating9);

        JLabel r9 = new JLabel("4.00 / 5.00");
        r9.setBounds(100,290,140,30);
        r9.setFont(minifont);
        r9.setForeground(Color.ORANGE);
        panel9.add(r9);

        JButton order9 = new JButton("Order!");
        order9.setFont(minifont);
        order9.setBounds(100,330,100,40);
        order9.setFocusable(false);
        order9.setForeground(Color.BLACK);
        order9.setBackground(Color.ORANGE);
        panel9.add(order9);
        order9.addActionListener(e->{
            selection s1 = new selection(100);
            s1.setVisible(true);
            setVisible(false);
        });

/////////////////////////
        JPanel panel10 = new JPanel();
        panel10.setBounds(1360,670,300,400);
        panel10.setBackground(Color.black);
        panel10.setLayout(null);
        c.add(panel10);
        panel10.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                panel10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel10.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
        ImageIcon b10 = new ImageIcon("src\\HomePage\\w.png");
        JLabel p10 = new JLabel(b10);
        p10.setBounds(25,0,250,250);
        panel10.add(p10);
        JLabel B10 = new JLabel("WaterMelon Juice");
        B10.setBounds(90,250,200,40);
        B10.setFont(minifont);
        B10.setForeground(Color.ORANGE);
        panel10.add(B10);
        ImageIcon s10 = new ImageIcon("src\\HomePage\\s.png");
        JLabel rating10 = new JLabel(s10);
        rating10.setBounds(80,290,30,30);
        panel10.add(rating10);

        JLabel r10 = new JLabel("4.6 / 5.00");
        r10.setBounds(120,290,140,30);
        r10.setFont(minifont);
        r10.setForeground(Color.ORANGE);
        panel10.add(r10);

        JButton order10 = new JButton("Order!");
        order10.setFont(minifont);
        order10.setBounds(100,330,100,40);
        order10.setFocusable(false);
        order10.setForeground(Color.BLACK);
        order10.setBackground(Color.ORANGE);
        panel10.add(order10);
        order10.addActionListener(e->{
            selection s1 = new selection(100);
            s1.setVisible(true);
            setVisible(false);
        });


    }

    public static void main(String[] args) {
        Dinner f = new Dinner();f.setVisible(true);
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
