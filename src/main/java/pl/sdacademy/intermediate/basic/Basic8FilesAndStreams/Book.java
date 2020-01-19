package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
@Builder
@ToString
@Getter
public class Book {


    private String title;
    private String author;
    private int yearPushlished;
    private int numberOfPages;
    private double price;
    private Genre genre;
}

