package Login;
import javax.swing.*;

public class Splash{
    Splash(){
        JWindow window = new JWindow();window.getContentPane().add(new JLabel(new ImageIcon("src\\Login\\fd.jpg")),SwingConstants.CENTER);
    window.setBounds(540,250,750,600);
    window.setVisible(true);
    try{
        Thread.sleep(2000);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    window.setVisible(false);
   Login l = new Login();
   l.setVisible(true);
        window.dispose();
    }
    public static void main(String[] a){
       Splash s = new Splash();
    }
}
