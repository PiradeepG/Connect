public class User {
    private String userName;
    private String email;
    private String password;
    private String type;
    User(String userName,String email,String password,String type){
        this.userName=userName;
        this.email=email;
        this.password=password;
        this.type=type;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setType(String type){
        this.type=type;
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
    public String getType(){
        return this.type;
    }
    public boolean isStudent(){
        return type.equals("student");
    }
    public boolean isTeacher(){
        return type.equals("Teacher");
    }
    public boolean isAdmin(){
        return type.equals("admin");
    }
}
