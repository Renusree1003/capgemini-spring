package com.capgemini.library_Management.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.library_Management.entity.Loan;

public interface LoanService {

    Loan issueBook(Long memberId, Long bookId, LocalDate dueDate);

    Loan returnBook(Long loanId);

    Loan getLoanById(Long loanId);

    List<Loan> getLoansByMember(Long memberId);

    List<Loan> getAllLoans();
}
