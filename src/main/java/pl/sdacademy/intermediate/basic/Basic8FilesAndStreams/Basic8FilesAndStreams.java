package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Basic8FilesAndStreams {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        List<String> allAuthors = bookStore.getBooks().stream()
                .map(Book::getAuthor) // method reference - used when calling only 1 method on all elements. Equivalent
                                      // of lambda: book -> book.getAuthor()
                .distinct()
                .collect(Collectors.toList());

        //dokończ te trudniejsze podpunkty!!!!!!!!!!!!
    }
}
