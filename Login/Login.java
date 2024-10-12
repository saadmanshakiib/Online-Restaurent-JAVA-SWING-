package Login;
import HomePage.*;
import UserInfo.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener, MouseListener {
    public Login(){
        Font font = new Font("Arial",Font.BOLD,25);
        Font minifont = new Font("Arial",Font.BOLD,18);
        Color color = new Color(231, 84, 128);
       Color color2 = new Color(0,51,102);
        Color purple = new Color(160,32,240);
        Color lightblue = new Color(51,204,255);

        this.setSize(870,600);
        this.setTitle("Login Page");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        Container container = new Container();
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.BLACK);



        JLabel email = new JLabel("Email : ");
        email.setBounds(450,220,100,40);
        email.setFont(font);
        email.setForeground(color);
        container.add(email);
        ImageIcon img2 = new ImageIcon("src\\Login\\gmail.png");
        JLabel i2 = new JLabel(img2);
        i2.setBounds(540, 225, 30, 30);
        container.add(i2);

        JTextField email_field = new JTextField();
        email_field.setHorizontalAlignment(JTextField.CENTER);
        email_field.setBounds(580,220,250,40);
        email_field.setForeground(purple);
        email_field.setBorder(BorderFactory.createMatteBorder(0,0,5,0,color));
        email_field.setOpaque(false);
        email_field.setFont(minifont);
        container.add(email_field);

        ImageIcon img4 = new ImageIcon("src\\Login\\pass.png");
        JLabel i4 = new JLabel(img4);
        i4.setBounds(540, 285, 30, 30);
        container.add(i4);

        JLabel password = new JLabel("Password : ");
        password.setBounds(400,275,160,40);
        password.setFont(font);
        password.setForeground(color);
        container.add(password);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(580,270,250,40);
        passwordField.setFont(minifont);
        passwordField.setForeground(purple);
        passwordField.setBorder(BorderFactory.createMatteBorder(0,0,5,0,color));
        passwordField.setOpaque(false);
        passwordField.setHorizontalAlignment(JPasswordField.CENTER);
        container.add(passwordField);


        JButton login = new JButton("Login");
        login.setBackground(purple);
        login.setBounds(590,340,100,40);
        login.setFont(minifont);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        login.setBorder(BorderFactory.createMatteBorder(0,5,0,5,color));
        login.setForeground(Color.BLACK);
        login.setFocusable(false);
        login.addActionListener(e ->{
            if(!email_field.getText().isEmpty() && !passwordField.getText().isEmpty()){
                String userEmail = email_field.getText();
                String userPass = passwordField.getText();

                Account account = new Account(userEmail,userPass);

                if(account.checkAccount(userEmail,userPass)){
                    food1 h = new food1();
                    h.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Matched Accounts Found");
                    email_field.setText("");
                    passwordField.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Enter All The Details Correctly");
            }

        });
        login.addMouseListener(new MouseListener() {
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
                login.setBackground(color);
                login.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                login.setBackground(purple);
                login.setForeground(Color.BLACK);
            }
        });
        container.add(login);

        JButton exit = new JButton("Exit");
        exit.setBackground(purple);
        exit.setBounds(700,340,100,40);
        exit.setFont(minifont);
        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exit.setBorder(BorderFactory.createMatteBorder(0,5,0,5,color));
        exit.setForeground(Color.BLACK);
        exit.setFocusable(false);
        container.add(exit);
        exit.addActionListener(e ->{System.exit(0);});
        exit.addMouseListener(new MouseListener() {
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
                exit.setBackground(Color.RED);
                exit.setForeground(Color.BLACK);                }

            @Override
            public void mouseExited(MouseEvent e) {
                exit.setBackground(purple);
                exit.setForeground(Color.BLACK);
            }
        });

        JButton create_new_account = new JButton("Create New Account");
        create_new_account.setBackground(purple);
        create_new_account.setBounds(590,400,215,40);
        create_new_account.setFont(minifont);
        create_new_account.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        create_new_account.setBorder(BorderFactory.createMatteBorder(0,5,0,5,color));
        create_new_account.setForeground(Color.BLACK);
        create_new_account.setFocusable(false);
        container.add(create_new_account);
        create_new_account.addActionListener(e->{
            Createnewaccount CNA = new Createnewaccount();
            CNA.setVisible(true);
        });
        create_new_account.addMouseListener(new MouseListener() {
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
                create_new_account.setBackground(color);
                create_new_account.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                create_new_account.setBackground(purple);
                create_new_account.setForeground(Color.BLACK);
            }
        });

       ImageIcon img = new ImageIcon("src\\Login\\cnapic.png");
        JLabel img1 = new JLabel(img);
        img1.setBounds(-70,0,500,500);
        container.add(img1);


    }
    public static void main(String[] a){
        Login l = new Login();
        l.setVisible(true);
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

    public static class CreateNewAccount extends JFrame implements ActionListener, MouseListener {
        CreateNewAccount(){
            Font font = new Font("Arial",Font.BOLD,25);
            Font minifont = new Font("Arial",Font.BOLD,18);
            Color color = new Color(231,84,128);
            Color lightblue = new Color(51,204,255);

            this.setSize(1000,700);
            this.setTitle("Login Page");
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);


            Container container = new Container();
            container = this.getContentPane();
            container.setLayout(null);
            container.setBackground(Color.BLACK);

            JButton back = new JButton("<-Back");
            back.setBounds(10,50,110,40);
            back.setFont(font);
            back.setBackground(Color.BLACK);
            back.setFocusable(false);
            back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            back.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.BLACK));
            back.setForeground(Color.ORANGE);
            container.add(back);
            Login l = new Login();
            back.addActionListener(e-> {l.setVisible(true);
                this.setVisible(false);
            });


            ImageIcon img3 = new ImageIcon("src\\code\\user.png");
            JLabel i3 = new JLabel(img3);
            i3.setBounds(640,125,30,30);
            container.add(i3);


            JLabel name = new JLabel("Name : ");
            name.setBounds(550,120,100,40);
            name.setFont(font);
            name.setForeground(color);
            container.add(name);

            JTextField nf = new JTextField();
            nf.setBounds(680,130,220,30);
            nf.setOpaque(false);
            nf.setFont(minifont);
            nf.setForeground(Color.WHITE);
            nf.setHorizontalAlignment(JTextField.CENTER);
            nf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,color));
            container.add(nf);

            ImageIcon img2 = new ImageIcon("src\\code\\gmail.png");
            JLabel i2 = new JLabel(img2);
            i2.setBounds(640,205,30,30);
            container.add(i2);

            JLabel email = new JLabel("Email : ");
            email.setBounds(550,200,100,40);
            email.setFont(font);
            email.setForeground(color);
            container.add(email);

            JTextField ef = new JTextField();
            ef.setBounds(685,200,220,30);
            ef.setOpaque(false);
            ef.setFont(minifont);
            ef.setForeground(Color.WHITE);
            ef.setHorizontalAlignment(JTextField.CENTER);
            ef.setBorder(BorderFactory.createMatteBorder(0,0,5,0,color));
            container.add(ef);

            JLabel pass = new JLabel("Password : ");
            pass.setBounds(500,280,140,40);
            pass.setForeground(color);
            pass.setFont(font);
            container.add(pass);

            ImageIcon img4 = new ImageIcon("src\\code\\pass.png");
            JLabel i4 = new JLabel(img4);
            i4.setBounds(640,285,30,30);
            container.add(i4);

            JPasswordField pf = new JPasswordField("");
            pf.setHorizontalAlignment(JPasswordField.CENTER);
            pf.setBounds(680,280,230,40);
            pf.setOpaque(false);
            pf.setFont(minifont);
            pf.setForeground(Color.WHITE);
            pf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,color));
            pf.setEchoChar('$');
            container.add(pf);

            JLabel confirm_pass = new JLabel("Confirm Password : ");
            confirm_pass.setBounds(400,360,250,40);
            confirm_pass.setForeground(color);
            confirm_pass.setFont(font);
            container.add(confirm_pass);

            ImageIcon img5 = new ImageIcon("src\\code\\pass.png");
            JLabel i5 = new JLabel(img5);
            i5.setBounds(640,365,30,30);
            container.add(i5);

            JPasswordField cpf = new JPasswordField("");
            cpf.setHorizontalAlignment(JPasswordField.CENTER);
            cpf.setBounds(680,360,230,40);
            cpf.setOpaque(false);
            cpf.setForeground(Color.WHITE);
            cpf.setFont(minifont);
            cpf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,color));
            cpf.setEchoChar('$');
            container.add(cpf);

            JLabel area = new JLabel("Area : ");
            area.setBounds(560,440,80,40);
            area.setFont(font);
            area.setForeground(color);
            container.add(area);

            ImageIcon img6 = new ImageIcon("src\\code\\map.png");
            JLabel i6 = new JLabel(img6);
            i6.setBounds(640,445,30,30);
            container.add(i6);


            String[] areanames = new String[]{"","Chittagong","Dhaka","Rajshahi","Khulna","Mymensingh","Rangpur","Rajshahi","Cumillah","Sylhet"};
            JComboBox Area = new JComboBox(areanames);
            Area.setBounds(690,445,130,30);
            Area.setBackground(color);
            Area.setFont(minifont);
            container.add(Area);

            JButton signup = new JButton("Sign Up");
            signup.setBounds(600,530,120,40);
            signup.setBackground(color);
            signup.setForeground(Color.BLACK);
            signup.setFocusable(false);
            signup.setFont(minifont);
            container.add(signup);



            ImageIcon img = new ImageIcon("src\\code\\cnapic.png");
            JLabel i = new JLabel(img);
            i.setBounds(-70,50,500,500);
            container.add(i);

        }

        public static void main(String[] args) {
            CreateNewAccount cna = new CreateNewAccount();
            cna.setVisible(true);
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
}
