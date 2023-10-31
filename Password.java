package consoleproject;
import java.util.*;
public class Password{
    
    public static void   main(){
        passwordCheck("");
      
    }
    public static String passwordCheck(String passcode){
        String st=passcode;
        if (validLength(st)==true && specialChar(st)==true && hasCaps(st)==true && hasDigit(st)==true){
            return "strong";
        }
        else{
            return "weak";
        }
    }
    public static  boolean validLength(String passcode){
        boolean x=false;
        if (passcode.length()>=8){
            x=true;
        }
        return x;
        
    }
    public static boolean specialChar(String passcode){
        String p="!@#$%^&*";
        boolean x=false;
        for(int i=0;i<p.length();i++){
           x= passcode.contains(Character.toString(p.charAt(i)));
           if (x==true){
            break;
        }
        }
        return x;
    }
    public static boolean hasDigit(String passcode){
        String k="1234567890";
        boolean x=false;
        for(int i=0;i<k.length();i++){
        x=passcode.contains(Character.toString(k.charAt(i)));
        if (x==true){
            break;
        }
        }
        return x;
    }
    public static boolean hasCaps(String passcode){
        boolean x=false;
        for(int i=0;i<passcode.length();i++){
           x=Character.isUpperCase(passcode.charAt(i));
           if (x==true){
            break;
        }
        }
        return x;
    }
    
}