import java.util.Scanner;
import static java.lang.System.*;
public class Test{
    public Test(){
        Scanner sc = new Scanner(in);
        out.print("Judul : ");
                String judul = sc.nextLine();
                out.print("Author : ");
                String author = sc.nextLine();
                out.print("Total page : ");
                int totalpage = sc.nextInt();
                out.print("Password [kosongkan untuk tanpa password] : ");
                String password = sc.nextLine();
                sc.nextLine();
        if(password.equals("")){
            out.println("Null");
        }
        else{
            out.println("gak");
        }
    }
    public static void main(String[] args) {
        new Test();
    }
}