package Login;
import HomePage.*;
import UserInfo.Account;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Createnewaccount extends JFrame implements ActionListener, MouseListener {
    Createnewaccount() {
        Font font = new Font("Arial", 1, 25);
        Font minifont = new Font("Arial", 1, 18);
        Color color = new Color(231, 84, 128);
        Color lightblue = new Color(51, 204, 255);
        Color purple = new Color(160,32,240);

        this.setSize(1000, 700);
        this.setTitle("Sign up Page");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        new Container();
        Container container = this.getContentPane();
        container.setLayout((LayoutManager)null);
        container.setBackground(Color.BLACK);

        final JButton back = new JButton("<-Back");
        back.setBounds(10, 50, 110, 40);
        back.setFont(font);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.setCursor(Cursor.getPredefinedCursor(12));
        back.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
        back.setForeground(purple);
        container.add(back);
        Login l = new Login();
        back.addActionListener((e) -> {
            l.setVisible(true);
            this.setVisible(false);
        });
        back.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                back.setBackground(Color.BLACK);
                back.setForeground(purple);
            }

            public void mouseExited(MouseEvent e) {
                back.setBackground(Color.BLACK);
                back.setForeground(purple);
            }
        });
        ImageIcon img3 = new ImageIcon("src\\Login\\user.png");
        JLabel i3 = new JLabel(img3);
        i3.setBounds(640, 125, 30, 30);
        container.add(i3);
        JLabel name = new JLabel("Name : ");
        name.setBounds(550, 120, 100, 40);
        name.setFont(font);
        name.setForeground(color);
        container.add(name);
        JTextField nf = new JTextField();
        nf.setBounds(680, 130, 220, 30);
        nf.setOpaque(false);
        nf.setFont(minifont);
        nf.setForeground(Color.WHITE);
        nf.setHorizontalAlignment(0);
        nf.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, color));
        container.add(nf);
        ImageIcon img2 = new ImageIcon("src\\Login\\gmail.png");
        JLabel i2 = new JLabel(img2);
        i2.setBounds(640, 205, 30, 30);
        container.add(i2);
        JLabel email = new JLabel("Email : ");
        email.setBounds(550, 200, 100, 40);
        email.setFont(font);
        email.setForeground(color);
        container.add(email);
        JTextField ef = new JTextField();
        ef.setBounds(685, 200, 220, 30);
        ef.setOpaque(false);
        ef.setFont(minifont);
        ef.setForeground(Color.WHITE);
        ef.setHorizontalAlignment(0);
        ef.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, color));
        container.add(ef);
        JLabel pass = new JLabel("Password : ");
        pass.setBounds(500, 280, 140, 40);
        pass.setForeground(color);
        pass.setFont(font);
        container.add(pass);
        ImageIcon img4 = new ImageIcon("src\\Login\\pass.png");
        JLabel i4 = new JLabel(img4);
        i4.setBounds(640, 285, 30, 30);
        container.add(i4);
        JPasswordField pf = new JPasswordField("");
        pf.setHorizontalAlignment(0);
        pf.setBounds(680, 280, 230, 40);
        pf.setOpaque(false);
        pf.setFont(minifont);
        pf.setForeground(Color.WHITE);
        pf.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, color));
        pf.setEchoChar('$');
        container.add(pf);
        JLabel confirm_pass = new JLabel("Confirm Password : ");
        confirm_pass.setBounds(400, 360, 250, 40);
        confirm_pass.setForeground(color);
        confirm_pass.setFont(font);
        container.add(confirm_pass);
        ImageIcon img5 = new ImageIcon("src\\Login\\pass.png");
        JLabel i5 = new JLabel(img5);
        i5.setBounds(640, 365, 30, 30);
        container.add(i5);
        JPasswordField cpf = new JPasswordField("");
        cpf.setHorizontalAlignment(0);
        cpf.setBounds(680, 360, 230, 40);
        cpf.setOpaque(false);
        cpf.setForeground(Color.WHITE);
        cpf.setFont(minifont);
        cpf.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, color));
        cpf.setEchoChar('$');
        container.add(cpf);
        JLabel area = new JLabel("Area : ");
        area.setBounds(560, 440, 80, 40);
        area.setFont(font);
        area.setForeground(color);
        container.add(area);
        ImageIcon img6 = new ImageIcon("src\\Login\\map.png");
        JLabel i6 = new JLabel(img6);
        i6.setBounds(640, 445, 30, 30);
        container.add(i6);
        String[] areanames = new String[]{"", "Chittagong", "Dhaka", "Rajshahi", "Khulna", "Mymensingh", "Rangpur", "Rajshahi", "Cumillah", "Sylhet"};
        JComboBox Area = new JComboBox(areanames);
        Area.setBounds(690, 445, 130, 30);
        Area.setBackground(color);
        Area.setFont(minifont);
        container.add(Area);
        JButton signup = new JButton("Sign Up");
        signup.setBounds(640, 530, 120, 40);
        signup.setBackground(purple);
        signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signup.setForeground(Color.BLACK);
        signup.setFocusable(false);
        signup.setFont(minifont);
        container.add(signup);
        signup.addActionListener(e->{
            if(!nf.getText().isEmpty() && !ef.getText().isEmpty() && pf.getText().equals(cpf.getText())&& Area.getSelectedItem()!=null){
                Account acc = new Account(ef.getText(),pf.getText());
               if(!acc.checkAccount(ef.getText(),pf.getText())){

                    acc.addAccount();

                    JOptionPane.showMessageDialog(null,"Account Has Been Created");
                    Login login = new Login();
                    login.setVisible(true);
                    setVisible(false);
                }
                else{
                  JOptionPane.showMessageDialog(null,"Account Already Exists");
                }
            }
           else if(!pf.getText().equals(cpf.getText())){
                JOptionPane.showMessageDialog(null,"Passwords Doesnt Match");
            }
            else{
                JOptionPane.showMessageDialog(null,"Enter The Details Correctly");
                ef.setText("");
                nf.setText("");
                pf.setText("");
                cpf.setText("");
                Area.setSelectedItem("");
            }
        });
        signup.addMouseListener(new MouseListener(){

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
            signup.setBackground(color);
            signup.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
            signup.setBackground(purple);
            signup.setForeground(Color.BLACK);
            }
        });

        ImageIcon img = new ImageIcon("src\\Login\\cnapic.png");
        JLabel i = new JLabel(img);
        i.setBounds(-70, 50, 500, 500);
        container.add(i);
    }

    public static void main(String[] args) {
        Createnewaccount cna = new Createnewaccount();
        cna.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
