import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    private String userName;
    private String email;
    private String password;
    InputStreamReader is=null;
    BufferedReader bf=null;
    Socket sc=null;
    Client(){
        is=new InputStreamReader(System.in);
        bf=new BufferedReader(is);
        setUserName();
        connect();
    }
    public void connect(){
        try{
            sc=new Socket("localhost", 4566);
        }
        catch(Exception e){
            System.out.println("Error in connecting to the server");
        }

    }
    public void setUserName(){
        try{
        Process process=Runtime.getRuntime().exec("whoami");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        userName=reader.readLine();
        }
        catch(Exception e){
            System.out.println("Error in getting client name");
        }

    }
    public String getInput(){
        String str="";
        try{
            str=bf.readLine();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return str;
    }
    public void getDetailsFromUser(){
        System.out.println("Enter your Email: ");
        email=getInput();
        getPasswordFromUser();
    }
    public void getPasswordFromUser(){
        System.out.println("Enter the password for "+email);
        password=getInput();
    }
    public static void main(String[] args) {
        Client cl=new Client();
        System.out.println(cl.userName);
    }
}
