package com.javacode.samples.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Library {
    public void examples(){
        //Single Streams
        // Lazy Method
        ArrayList<Book> books = populateBooks();
        books.stream().filter(book->{
            return book.getAuthor().startsWith("a");
        }).filter(book -> {
          return book.getTitle().startsWith("f");
        }).forEach(System.out::println);
        // Lazy Method
        // Single Streams

        // Parallel Streams
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("a");
        }).forEach(System.out::println);
        // Parallel Streams
    }
    ArrayList<Book> populateBooks(){
        ArrayList<Book> books = new ArrayList<>();
        for(Character character = 'a'; character <= 'z'; character++){
            books.add(new Book(character.toString(),character.toString()+"d"));
        }
        books.add(new Book("aaa","ff"));
        return books;
    }
}
