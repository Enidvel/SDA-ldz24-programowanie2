package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BookShortInfo {
    String title;
    String author;
    int yearPushlished;

    public BookShortInfo(String title, String author, int yearPushlished) {
        this.title = title;
        this.author = author;
        this.yearPushlished = yearPushlished;
    }
}
