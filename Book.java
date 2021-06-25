public class Book {
    protected String title;
    protected String author;
    protected int totalpage;
    protected int currentpage;

    protected Book(){
        title = "";
        author = "";
        totalpage = 0;
        currentpage = 0;
    }
    protected Book(String title, String author, int totalpage){
        this.title = title;
        this.author = author;
        this.totalpage = totalpage;
    }
    protected void setTitle(String title){
        this.title = title;
    }
    protected void setAuthor(String author){
        this.author = author;
    }
    protected void setTotalPage(int totalpage){
        this.totalpage =totalpage;
    }
    protected void setCurrentPage(int currentpage){
        this.currentpage = currentpage;
    }
    protected String getTitle(){
        return this.title;
    }
    protected String getAuthor(){
        return this.author;
    }
    protected int getTotalPage(){
        return this.totalpage;
    }
    protected int getCurrentPage(){
        return this.currentpage;
    }
    protected String read(int page){
        return "[Read " + page + " Pages]";
    }
    @Override
    public String toString(){
        return this.author+"-"+this.title+" (0/"+this.totalpage+")";
    }
}
