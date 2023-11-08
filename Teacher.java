public class Teacher extends User
{
    Teacher teacher ;
    String subject = "";
    Teacher(String name , String password , String email , boolean isAdmin)
    {
        super(name, password, email, isAdmin);
    }
    public void start()
    {
            System.out.println("succesfully logined as a teacher");
    }
}
