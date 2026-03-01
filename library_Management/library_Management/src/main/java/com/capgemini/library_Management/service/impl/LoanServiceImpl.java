package com.capgemini.library_Management.service.impl;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.library_Management.dao.BookRepository;
import com.capgemini.library_Management.dao.LoanRepository;
import com.capgemini.library_Management.dao.MemberRepository;
import com.capgemini.library_Management.entity.Book;
import com.capgemini.library_Management.entity.Loan;
import com.capgemini.library_Management.entity.Member;
import com.capgemini.library_Management.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepo;

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private MemberRepository memberRepo;

    @Override
    public Loan issueBook(Long memberId, Long bookId, LocalDate dueDate) {

        Book book = bookRepo.findById(bookId).orElseThrow();
        Member member = memberRepo.findById(memberId).orElseThrow();

        if (book.getCopiesAvailable() <= 0) {
            throw new RuntimeException("Book not available");
        }

        Loan loan = new Loan();
        loan.setIssueDate(LocalDate.now());
        loan.setDueDate(dueDate);
        loan.setLoanStatus("ISSUED");
        loan.setBook(book);
        loan.setMember(member);

        book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        bookRepo.save(book);

        return loanRepo.save(loan);
    }

    @Override
    public Loan returnBook(Long loanId) {

        Loan loan = loanRepo.findById(loanId).orElseThrow();

        loan.setReturnDate(LocalDate.now());
        loan.setLoanStatus("RETURNED");

        Book book = loan.getBook();
        book.setCopiesAvailable(book.getCopiesAvailable() + 1);
        bookRepo.save(book);

        return loanRepo.save(loan);
    }

    @Override
    public Loan getLoanById(Long loanId) {
        return loanRepo.findById(loanId).orElseThrow();
    }

    @Override
    public List<Loan> getLoansByMember(Long memberId) {
        return loanRepo.findByMemberMemberId(memberId);
    }

    @Override
    public List<Loan> getAllLoans() {
        return loanRepo.findAll();
    }
}