package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStoreInitialiazer {

    List<Book> initBookStore() {
        List<Book> books = new ArrayList<>();
        String booksFilePathRelative = getClass().getClassLoader().getResource("books.txt").getFile();
        File booksFile = new File(booksFilePathRelative);

        try {
            Scanner scanner = new Scanner(booksFile);
            while (scanner.hasNext()) {
                String bookLine = scanner.nextLine();
                String[] splitLine = bookLine.split("\\|");
                String title = splitLine[0];
                String author = splitLine[1];
                int yearPushlished = Integer.parseInt(splitLine[2]);
                int numberOfPages = Integer.parseInt(splitLine[3]);
                double price = Double.parseDouble(splitLine[4]);
                Genre type = Genre.valueOf(splitLine[5]);
                Book book = Book.builder()
                        .title(title)
                        .author(author)
                        .yearPushlished(yearPushlished)
                        .numberOfPages(numberOfPages)
                        .price(price)
                        .type(type)
                        .build();
                System.out.println(book);
                books.add(book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

    // metoda wczystująca plik tekstowy initBookStore() zwracająca listę książek
    // W metodzie tej wczytaj plik book.txt i stwórz odpowiedni obiekt klasy Book dla każdej linii w pliku.
    // Zwróć uwagę, aby odpowiednio zainicjalizować enuma.
}
