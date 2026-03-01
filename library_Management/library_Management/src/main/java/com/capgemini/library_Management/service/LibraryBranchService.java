package com.capgemini.library_Management.service;

import java.util.List;
import com.capgemini.library_Management.entity.LibraryBranch;

public interface LibraryBranchService {

    LibraryBranch addBranch(LibraryBranch branch);

    LibraryBranch getBranchById(Long id);

    List<LibraryBranch> getAllBranches();

    LibraryBranch updateBranch(Long id, LibraryBranch branch);

    void deleteBranch(Long id);
}