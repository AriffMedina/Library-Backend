package mx.edu.tecdesoftware.library_backend.domain;

import java.util.List;

public class Book {

    private Integer id;
    private String title;
    private String author;
    private List<Loan> loans;

    public Book() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public List<Loan> getLoans() { return loans; }
    public void setLoans(List<Loan> loans) { this.loans = loans; }
}