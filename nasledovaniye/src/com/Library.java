package com;

import com.company.ScientificBook;

public class Library {
    private String name;
    private String city;
    private  String country;
    private  Book[] books;
    private  int sizeOfBooks;

    public Library() {
    }

    public Library(String name, String city, String country, Book[] books) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public  void  addBook(Book b){
     if(sizeOfBooks<books.length){
         books[sizeOfBooks]=b;
         sizeOfBooks++;
     }
    }
    public  void  printLibraryData(){
        System.out.println("Library: "+name);
        System.out.println("Location: " + city + ", " + country);
        System.out.println("Books in the Library:");
        for (Book book : books) {
            if(book instanceof ScientificBook){
                System.out.println(book.getBookData());
            }else if(book instanceof LiteratureBook){
                System.out.println(book.getBookData());
            }
        }
    }
}
