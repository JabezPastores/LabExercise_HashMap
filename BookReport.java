import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;
public class BookReport {
    public static void main(String[] args) throws FileNotFoundException {
        BookDA bookDA = new BookDA();

        for(HashMap.Entry<String, Book> entryMap : bookDA.getBookMap().entrySet()){
            System.out.println(entryMap.getValue().getIsbn()+" ");
            System.out.println(entryMap.getValue().getTitle());
            System.out.println(entryMap.getValue().getAuthor().getName()+"\n");
        }
    }
}
