package mx.edu.tecdesoftware.library_backend.domain;

import java.time.LocalDate;

public class Loan {

    private Integer id;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private Integer bookId;
    private Integer clientId;

    public Loan() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public LocalDate getLoanDate() { return loanDate; }
    public void setLoanDate(LocalDate loanDate) { this.loanDate = loanDate; }

    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public Integer getClientId() { return clientId; }
    public void setClientId(Integer clientId) { this.clientId = clientId; }
}