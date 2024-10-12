package HomePage;
import javax.swing.*;

import Payment.*;

import java.awt.event.*;
import java.awt.*;


public class selection extends JFrame implements ActionListener {
    private int price;

    Font font = new Font("Arial",Font.BOLD,25);

    public selection(int price){
        this.price = price;

        this.setSize(500,500);
        this.setTitle("select");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        JButton back = new JButton("<-Back");
        back.setBounds(20,20,130,40);
        back.setFont(font);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.ORANGE);
        back.setFocusable(false);
        c.add(back);
        back.addActionListener(e->{
            Breakfast l = new Breakfast();
            l.setVisible(true);
            setVisible(false);
        });


        JLabel l = new JLabel("Select Amount : ");
        l.setBounds(40,100,200,40);
        l.setFont(font);
        l.setForeground(Color.ORANGE);
        c.add(l);

        JLabel l2 = new JLabel("Current Price : ");
        l2.setBounds(40,200,250,40);
        l2.setFont(font);
        l2.setForeground(Color.ORANGE);
        c.add(l2);


        JTextField t = new JTextField("1");
        t.setBounds(320,105,70,40);
        t.setFont(font);
        t.setHorizontalAlignment(JTextField.CENTER);
        c.add(t);

        JTextField t2 = new JTextField(String.valueOf(price));
        t2.setBounds(320,205,70,40);
        t2.setFont(font);
        t2.setBackground(Color.BLACK);
        t2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.BLACK));
        t2.setForeground(Color.WHITE);
        c.add(t2);

        JButton b = new JButton("-");
        b.setBounds(250,105,60,40);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setFont(font);
        b.setFocusable(false);
        c.add(b);

        JButton b2 = new JButton("+");
        b2.setBounds(400,105,60,40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(font);
        b2.setFocusable(false);
        c.add(b2);

        b2.addActionListener(e->{
            //t2 = price text
            //t = amount text
                int value = Integer.parseInt(t.getText());
                value++;
                ///increasing the amount
                int price1 = Integer.parseInt(t2.getText());//t2 = price get
                price1 = price+price1; // increasing the amount of price by per click
                t.setText(String.valueOf(value));// setting the value of increased amount on textfield
                t2.setText(String.valueOf(price1));// setting the increased price on t2 text field
            if(value>=10){
                JOptionPane.showMessageDialog(null,"Cant Order More Than 10 At A Time");
                t.setText("1");
            }
        });
        b.addActionListener(e->{
            int value2 = Integer.parseInt(t.getText());
        value2--; // reducing the value of amount per click
        int price2 = 0;
        int price1 = Integer.parseInt(t2.getText()); // getting the price of per amount
        price2 = price1-price; // reducing the price of per amount . substracting the main price from the new increased price
        t2.setText(String.valueOf(price2));
        t.setText(String.valueOf(value2));
        if(value2<=0){
            JOptionPane.showMessageDialog(null,"Cant Chose Less Than Zero");
            t.setText("1");
        }
        if(t.getText().equals("1")){
            t2.setText(String.valueOf(price));
        }
        });

        JButton p = new JButton("Go To Payment ");
        p.setBounds(230,360,230,40);
        p.setFont(font);
        p.setForeground(Color.BLACK);
        p.setFocusable(false);
        p.setBackground(Color.ORANGE);
        c.add(p);
        p.addActionListener(e->{
            payment pay = new payment(Integer.parseInt(t2.getText()));
            pay.setVisible(true);
        });

    }

    public static void main(String[] args) {
        selection s = new selection(220);s.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
}
