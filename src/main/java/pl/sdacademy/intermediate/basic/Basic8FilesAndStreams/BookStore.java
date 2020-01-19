package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BookStore {

    private List<Book> books;

    BookStore() {
        this.books = new BookStoreInitialiazer().initBookStore();
    }

    List<Book> findBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    List<Book> findBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    //po yearPublished, po numberOfPages, po price i genre
}
//itd! DOKONCZ!!!!!!!!!!! i pamiętaj w filtrze ceny: BigDecimal.valueOf(book.getPrice()