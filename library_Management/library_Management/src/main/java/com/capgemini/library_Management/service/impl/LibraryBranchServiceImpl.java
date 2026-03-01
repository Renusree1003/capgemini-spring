package com.capgemini.library_Management.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.library_Management.entity.LibraryBranch;
import com.capgemini.library_Management.dao.LibraryBranchRepository;
import com.capgemini.library_Management.service.LibraryBranchService;

@Service
public class LibraryBranchServiceImpl implements LibraryBranchService {

    @Autowired
    private LibraryBranchRepository branchRepo;

    @Override
    public LibraryBranch addBranch(LibraryBranch branch) {
        return branchRepo.save(branch);
    }

    @Override
    public LibraryBranch getBranchById(Long id) {
        return branchRepo.findById(id).orElseThrow();
    }

    @Override
    public List<LibraryBranch> getAllBranches() {
        return branchRepo.findAll();
    }

    @Override
    public LibraryBranch updateBranch(Long id, LibraryBranch branch) {
        LibraryBranch existing = branchRepo.findById(id).orElseThrow();
        existing.setName(branch.getName());
        existing.setLocation(branch.getLocation());
        existing.setContactNumber(branch.getContactNumber());
        return branchRepo.save(existing);
    }

    @Override
    public void deleteBranch(Long id) {
        branchRepo.deleteById(id);
    }
}