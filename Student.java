public class Student {
    private String userName;
    private String email;
    private String password;
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    Student(String userName,String email,String password){
        this.userName=userName;
        this.email=email;
        this.password=password;
    }
}
