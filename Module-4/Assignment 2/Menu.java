class Menu{
    public static void main(String[] args){
        Card a = new Card("Hound","Holmes","Fascinating");
        Card b = new Card("Harry","John","Jovial");
        Card c = new Card("Aarohi","Phani","Comedy");
        CardCatalog f= new CardCatalog();
        f.addACard(a);
        f.addACard(b);
        f.addACard(c);
        f.printCatalog();


        
    }
}
class Card{
    String title;
    String authorName;
    String subjectOfBook;
    public Card(String title,String authorName,String subjectOfBook){
        this.title=title;
        this.authorName=authorName;
        this.subjectOfBook=subjectOfBook;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getSubjectOfBook(){
        return subjectOfBook;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setSubjectOfBook(String subjectOfBook){
        this.subjectOfBook=subjectOfBook;
    }
    public String toString(){
        return "(title:  "+title+ "   authorName:   "+authorName+ "   subjectOfBook:   "+subjectOfBook+")";
    }
}
class CardCatalog{
    Card[] cardArray;
    int index = 0;  
    CardCatalog(){
     cardArray = new Card[10];
    }
    public void addACard(Card obj){
        cardArray[index] = obj;
        index++;
    }
    public Card getATitle(String title){
        for(int i=0;i<index;i++){
            if(cardArray[i].title.equals(title)){
                return cardArray[i];
            }
        }
        return null;
    }
    public Card getAnAuthor(String authorName){
        for(int i=0;i<index;i++){
            if(cardArray[i].authorName.equals(authorName)){
                return cardArray[i];
            }
        }
        return null;
    }
    public Card getSubject(String subjectOfBook){
        for(int i=0;i<index;i++){
            if(cardArray[i].subjectOfBook.equals(subjectOfBook)){
                return cardArray[i];
            }
        }
        return null;
    }
    public Card removeAll(String title){
        for(int i=0;i<index;i++){
            if(cardArray[i].title.equals(title)){
                cardArray[i]=null;
            return cardArray[i];    
            }
        }
        return null;
    }
    public void printCatalog(){
        for(int i=0;i<index;i++){
            if(cardArray[i]!=null){
                System.out.println(cardArray[i]);
            }
        }
    }

}