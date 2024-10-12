package Payment;

import java.awt.event.*;
import javax.swing.*;
import HomePage.*;
import java.awt.*;


public class payment extends JFrame implements ActionListener,MouseListener {
    private int tk;

    Font font = new Font("Arial", Font.BOLD, 25);
    Font bigfont = new Font("Monospaced", Font.BOLD, 40);

    public payment(int tk){
    this.tk = tk;

    this.setTitle("Payment");
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setSize(900,800);
    this.setLocationRelativeTo(null);

    Container c = new Container();
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.white);

    
        JButton back = new JButton("<-Back");
        back.setBounds(20,10,130,40);
        back.setFont(font);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.ORANGE);
        back.setFocusable(false);
        c.add(back);
        back.addActionListener(e->{
            food1 l = new food1();
            l.setVisible(true);
            setVisible(false);
        });

    JLabel l = new JLabel("Select Your Payment Method : ");
    l.setBounds(40,80,800,40);
    l.setFont(bigfont);
    l.setForeground(Color.BLACK);
    c.add(l);

        JLabel l2 = new JLabel("Payable Amount : "+tk);
        l2.setBounds(40,140,800,40);
        l2.setFont(font);
        l2.setForeground(Color.BLACK);
        c.add(l2);

    JPanel p = new JPanel();
    p.setLayout(new GridLayout(2,3,20,20));
    p.setBounds(80,200,700,500);
    p.setBackground(Color.WHITE);
    c.add(p);


    ImageIcon b1 = new ImageIcon("src//Payment//bkash1.png");
    ImageIcon n1 = new ImageIcon("src//Payment//n.png");
    ImageIcon r = new ImageIcon("src//Payment//r.png");
    ImageIcon u = new ImageIcon("src//Payment//u.png");
    ImageIcon m = new ImageIcon("src//Payment//m.png");
    ImageIcon t = new ImageIcon("src//Payment//t.png");

    JButton bkash = new JButton("Bkash");
    bkash.setIcon(b1);
    bkash.setFont(font);
    bkash.setFocusable(false);
    bkash.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
    bkash.setHorizontalTextPosition(JButton.CENTER);
    bkash.setVerticalTextPosition(JButton.BOTTOM);
    bkash.setBackground(Color.WHITE);
    bkash.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e){}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {
        bkash.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bkash.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.ORANGE));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            bkash.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        }
    });
    bkash.addActionListener(a->{
    Bkash q = new Bkash(tk);q.setVisible(true);setVisible(false);

    });
    JButton rocket = new JButton("Rocket");
    rocket.setIcon(r);
    rocket.setFont(font);
    rocket.setFocusable(false);
    rocket.setHorizontalTextPosition(JButton.CENTER);
    rocket.setVerticalTextPosition(JButton.BOTTOM);
    rocket.setBackground(Color.WHITE);
    rocket.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
    rocket.setBackground(Color.WHITE);
    rocket.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e){}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {
            rocket.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            rocket.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.ORANGE));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            rocket.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        }
    });
    rocket.addActionListener(e->{
        rocket s = new rocket(tk);s.setVisible(true);setVisible(false);
    });
        JButton nogod = new JButton("Nogod");
        nogod.setIcon(n1);
        nogod.setFont(font);
        nogod.setFocusable(false);
        nogod.setHorizontalTextPosition(JButton.CENTER);
        nogod.setVerticalTextPosition(JButton.BOTTOM);
        nogod.setBackground(Color.WHITE);
        nogod.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        nogod.setBackground(Color.WHITE);
        nogod.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                nogod.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                nogod.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.ORANGE));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                nogod.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));

            }
        });
        nogod.addActionListener(e->{
            nagad _n = new nagad(tk);_n.setVisible(true);setVisible(false);
        });
    JButton upay= new JButton("Upay");
    upay.setIcon(u);
    upay.setFont(font);
    upay.setFocusable(false);
    upay.setHorizontalTextPosition(JButton.CENTER);
    upay.setVerticalTextPosition(JButton.BOTTOM);
    upay.setBackground(Color.WHITE);
    upay.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
    upay.setBackground(Color.WHITE);
    upay.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e){}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {
            upay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            upay.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.ORANGE));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            upay.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        }
    });
    upay.addActionListener(e->{
        upay up = new upay(tk);up.setVisible(true);setVisible(false);
    });
    JButton tcash = new JButton("Tcash");
    tcash.setIcon(t);
    tcash.setFont(font);
    tcash.setFocusable(false);
    tcash.setHorizontalTextPosition(JButton.CENTER);
    tcash.setVerticalTextPosition(JButton.BOTTOM);
    tcash.setBackground(Color.WHITE);
    tcash.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
    tcash.setBackground(Color.WHITE);
    tcash.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e){}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {
            tcash.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            tcash.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.ORANGE));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            tcash.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        }
    });
    tcash.addActionListener(e->{
        tcash tc = new tcash(tk);tc.setVisible(true);setVisible(false);
    });
    JButton W = new JButton("MyWallet");
    W.setIcon(m);
    W.setFont(font);
    W.setFocusable(false);
    W.setHorizontalTextPosition(JButton.CENTER);
    W.setVerticalTextPosition(JButton.BOTTOM);
    W.setBackground(Color.WHITE);
    W.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
    W.setBackground(Color.WHITE);
    W.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e){}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {
            W.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            W.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.ORANGE));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            W.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        }
    });
    W.addActionListener(e->{
        mywallet mw = new mywallet(tk);mw.setVisible(true);setVisible(false);
    });
    //////////////


    p.add(bkash);
    p.add(nogod);
    p.add(rocket);
    p.add(upay);
    p.add(tcash);
    p.add(W);



}

/*public static void main(String[] args) {
    payment P = new payment(200);P.setVisible(true);
}*/

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
