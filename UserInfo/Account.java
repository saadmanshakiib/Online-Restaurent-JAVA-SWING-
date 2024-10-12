
package UserInfo;
import java.io.*;
import java.util.Scanner;


public class Account {
    private String email;
    private String password;
public Account(){}
    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void addAccount() {
        try {
            File file = new File("Data.txt");
            FileWriter fw = new FileWriter(file,true);
            fw.write(getEmail()+"\t"+getPassword()+"\n");
            fw.write("-------------------------\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkAccount(String email, String password) {
        boolean check = false;
        try {
            File file = new File("Data.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String Line = scanner.nextLine();
                String[] data = Line.split("\t");
                if(data[0].equals(email) && data[1].equals(password)){
                    check = true;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }

    public void add_deliveryman_Account() {
        try {
            File file2 = new File("Deliveryman_Data.txt");
            FileWriter fw = new FileWriter(file2,true);
            fw.write(getEmail()+"\t"+getPassword()+"\n");
            fw.write("-------------------------\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean check_deliveryman_Account(String email, String password) {
        boolean check = false;
        try {
            File file2 = new File("Deliveryman_Data.txt");
            Scanner scanner = new Scanner(file2);
            while(scanner.hasNextLine()){
                String Line = scanner.nextLine();
                String[] data = Line.split("\t");
                if(data[0].equals(email) && data[1].equals(password)){
                    check = true;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
}
