package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 143808a on 10/24/2016.
 */
public class BookDBAO {
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }





    public List<BookDetails> getAllBooks(){
       ArrayList<BookDetails> list = new ArrayList<BookDetails>();
        for(int i =0; i<5; i++){
            BookDetails details = new BookDetails();
            details.setBookId(""+i);
            details.setDescription("Book desc" + i);
            details.setFirstName("First Name" + i);
            details.setSurname("Surname" + i);
            details.setInventory(i);
            details.setOnSale(true);
            details.setPrice(1.0f + i);
            details.setTitle("title" + i);
            details.setYear(2014+i);
            list.add(details);
        }
        return list;
    }
}
