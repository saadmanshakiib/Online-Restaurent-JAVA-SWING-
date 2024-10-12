package Payment;

import HomePage.food1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class nagad extends  JFrame implements ActionListener, MouseListener {

    private int tk;

    public nagad(int tk){
        this.tk = tk;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,700);
        this.setLocationRelativeTo(null);



        Container c ;
        c = this.getContentPane();
        c.setLayout(null);

        ImageIcon i = new ImageIcon("src\\Payment\\n2.png");
        JLabel img = new JLabel(i);
        img.setBounds(100,0,470,212);
        c.add(img);
        JPanel p = new JPanel();
        p.setBounds(0,200,450,500);
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        c.add(p);
        ImageIcon i2 = new ImageIcon("src\\Payment\\n.png");
        JLabel img2 = new JLabel(i2);
        img2.setBounds(50,-20,300,250);
        p.add(img2);

        JLabel n = new JLabel("Number : ");
        n.setFont(new Font("Roboto",Font.BOLD,28));
        n.setForeground(Color.ORANGE);
        n.setBounds(37,200,200,30);
        p.add(n);
        JTextField nt = new JTextField();
        nt.setBounds(180,190,220,50);
        nt.setFont(new Font("Roboto",Font.BOLD,22));
        nt.setOpaque(false);
        nt.setForeground(Color.BLACK);
        nt.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.ORANGE));
        p.add(nt);
        /////
        JLabel pin = new JLabel("Nagad Pin :");
        pin.setFont(new Font("Roboto",Font.BOLD,28));
        pin.setForeground(Color.ORANGE);
        pin.setBounds(10,265,200,30);
        p.add(pin);
        JPasswordField pp = new JPasswordField();
        pp.setBounds(180,260,220,50);
        pp.setFont(new Font("Roboto",Font.BOLD,22));
        pp.setOpaque(false);
        pp.setForeground(Color.BLACK);
        pp.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.ORANGE));
        p.add(pp);

        JButton pay = new JButton("CONFIRM PAYMENT");
        pay.setBounds(540,350,290,50);
        pay.setFont(new Font("Roboto",Font.BOLD,25));
        pay.setFocusable(false);
        pay.setForeground(Color.BLACK);
        pay.setBackground(Color.WHITE);
        c.add(pay);
        pay.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                pay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pay.setBackground(Color.ORANGE);
                pay.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pay.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                pay.setBackground(Color.WHITE);
                pay.setForeground(Color.BLACK);
            }
        });
        pay.addActionListener(e->{
            if(!nt.getText().isEmpty() && !pp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Payment Confirmed & Delivery is On The Way");
                nt.setText("");
                pp.setText("");
                JOptionPane.showMessageDialog(null,"Tk "+tk+" Has Been Cut From Your Account");
                food1 f1 = new food1();f1.setVisible(true);setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Enter The Details Correctly");
            }
        });

        JButton back = new JButton("BACK");
        back.setBounds(540,410,120,50);
        back.setFont(new Font("Roboto",Font.BOLD,25));
        back.setFocusable(false);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        c.add(back);
        back.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                back.setBackground(Color.BLACK);
                back.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                back.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                back.setBackground(Color.WHITE);
                back.setForeground(Color.BLACK);
            }
        });
        back.addActionListener(e->{
            payment page = new payment(tk);
            page.setVisible(true);
            setVisible(false);
        });

//////////////

        JButton exit = new JButton("EXIT");
        exit.setBounds(710,410,120,50);
        exit.setFont(new Font("Roboto",Font.BOLD,25));
        exit.setFocusable(false);
        exit.setForeground(Color.BLACK);
        exit.setBackground(Color.WHITE);
        c.add(exit);
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                exit.setBackground(Color.BLACK);
                exit.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                exit.setBackground(Color.WHITE);
                exit.setForeground(Color.BLACK);
            }
        });
        exit.addActionListener(e->{
            System.exit(32);
        });
    }

    public static void main(String[] args) {
        nagad b = new nagad(2334);b.setVisible(true);
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
