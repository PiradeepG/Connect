package consoleproject;
import java.util.Scanner;
public class UserAction{
    static String userActivity="";
    static Login login = new Login();
    static Signup signup= new Signup();
    public  UserAction(){
        this.userActivity="";
    }
    public UserAction(String userActivity){
        this.userActivity=userActivity;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Login/Signup");
        userActivity=s.nextLine();
        if (userActivity.equalsIgnoreCase("login")){
            System.out.println("hi");
        }
        else{
            signup.signupProcess();
        }
    }
}
