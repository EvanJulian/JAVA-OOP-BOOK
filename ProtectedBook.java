public class ProtectedBook extends Book{
    public static String password;
    public ProtectedBook(){
        super();
        password = "";
    }
    public ProtectedBook(String title, String author, int totalpage, String password){
        super(title, author, totalpage);
        ProtectedBook.password = password;
    }
    public void setPassword(String password){
        ProtectedBook.password = password;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public String toString(){
        return super.toString();
    }

}
