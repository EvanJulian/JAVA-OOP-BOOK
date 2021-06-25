import static java.lang.System.*;
import java.util.*;
public class Perpustakaan {
    public Perpustakaan(){
        List<Book> rak = new ArrayList<Book>();
        Scanner sc = new Scanner(in);
        while(true){
            out.println("Welcome to my library");
            out.println("\t1. Tambah buku");
            out.println("\t2. Kurangi buku");
            out.println("\t3. Show buku");
            out.println("\t4. Baca buku");
            out.println("\t5. Exit");
            out.print("Pilihan : ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            Book buku;
            if (pilihan ==1){
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
                    buku =  new Book(judul, author, totalpage);
                    rak.add(buku);
                }
                else{
                    buku =  new ProtectedBook(judul, author, totalpage, password);
                    rak.add(buku);
                }
            }
            else if(pilihan == 6){
                for(Book value : rak){
                    if(value instanceof Book){
                        out.println("Book");
                    }
                    else{
                        out.println("Protected book");
                    }
                }
            }
            else if(pilihan == 2){
                out.println("[book list]");
                for(int i = 0; i<rak.size(); i++){
                    int k = i+1;
                    out.println((k)+". "+rak.get(i).getAuthor() + " - " + rak.get(i).getTitle() + " (0/" +rak.get(i).getTotalPage()+")");
                }
                out.print("To remove : ");
                int removed = sc.nextInt();
                rak.remove(rak.get(removed-1));
            }
            else if(pilihan == 3){
                out.println("[book list]");
                for(int i = 0; i<rak.size(); i++){
                    int k = i+1;
                    out.println((k)+". "+rak.get(i).getAuthor() + " - " + rak.get(i).getTitle() + " (0/" +rak.get(i).getTotalPage()+")");
                }
            }
            else if(pilihan == 4){
                out.println("[book list]");
                for(int i = 0; i<rak.size(); i++){
                    int k = i+1;
                    out.println((k)+". "+rak.get(i).getAuthor() + " - " + rak.get(i).getTitle() + " (0/" +rak.get(i).getTotalPage()+")");
                }
                out.print("Read which book : ");
                int reads = sc.nextInt();
                out.print("How many pages : ");
                int page = sc.nextInt();
                if (rak.get(reads-1) instanceof Book){
                    out.println(rak.get(reads-1).read(page));
                }
                else{
                    out.print("Password : ");
                    String password2; 
                    password2 = sc.next();
                    while(!password2.equals(ProtectedBook.password)){
                        out.print("Password : ");
                        password2 = sc.next();
                    }
                    out.println(rak.get(reads-1).read(page));
                }
            }
            else if(pilihan == 5){
                exit(0);
                break;
            }
            else{
                out.println("Anda salah memasukan pilihan");
            }
        }
    }
    public static void main(String[] args) {
        new Perpustakaan();
    }
}