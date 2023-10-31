package consoleproject;

import java.util.Scanner;

public class Signup {
    static String username="";
    static String password="";
    static String mail="";
    static String designation="";
    static Scanner s=new Scanner(System.in);
    static Password p= new Password();
    public Signup(){
        String username="";
        String password="";
        String mail="";
        String designation="";
    }
    public Signup(String username,
                String password,
                String mail,
                String designation){
        this.username=username;
        this.designation=designation;
        this.password=password;
        this.mail=mail;

    }
    public static void signupProcess(){
        System.out.println("enter username");
        username=s.nextLine();
        System.out.println("enter password");
        password=s.nextLine();
        while(p.passwordCheck(password).equalsIgnoreCase("weak")){
            System.out.println("password is weak!\nEnter strong Password");
            password=s.nextLine();
        }
        System.out.println("enter Email");
        mail=s.nextLine();
        System.out.println("your Designation?(Teacher/Student)");
        designation=s.nextLine();
        
    }
    
}
