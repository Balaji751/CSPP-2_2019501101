class Print{
    public static void main(String[]args){
      Book a = new Book("Hound","Holmes",296);
      System.out.println(a.getTitle());
      System.out.println(a.getAuthorName());
      System.out.println(a.getPageNumber());
      
      
    } 
}


class Book{
    String title;
    String authorName;
    int pageNumber;
    public Book(){

    }
    public Book(String title,String authorName,int pageNumber){
        this.title=title;
        this.authorName=authorName;
        this.pageNumber=pageNumber;
    
   
    public String getTitle(){
        return this.title;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public int getPageNumber(){
        return this.pageNumber;
    } 
}