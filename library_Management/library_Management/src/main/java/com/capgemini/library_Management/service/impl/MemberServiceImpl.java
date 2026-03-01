package com.capgemini.library_Management.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.library_Management.dao.MemberRepository;
import com.capgemini.library_Management.entity.Member;
import com.capgemini.library_Management.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepo;

    @Override
    public Member addMember(Member memberDetails) {
        memberDetails.setStatus("ACTIVE");
        return memberRepo.save(memberDetails);
    }

    @Override
    public Member getMemberById(Long memberId) {
        return memberRepo.findById(memberId).orElseThrow();
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepo.findAll();
    }

    @Override
    public Member updateMember(Long memberId, Member updatedDetails) {
        Member member = memberRepo.findById(memberId).orElseThrow();

        member.setName(updatedDetails.getName());
        member.setEmail(updatedDetails.getEmail());
        member.setPhone(updatedDetails.getPhone());

        return memberRepo.save(member);
    }

    @Override
    public void deleteOrDisableMember(Long memberId) {
        Member member = memberRepo.findById(memberId).orElseThrow();
        member.setStatus("BLOCKED");
        memberRepo.save(member);
    }
}
