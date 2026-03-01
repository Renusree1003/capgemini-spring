package com.capgemini.library_Management.service;

import java.util.List;

import com.capgemini.library_Management.entity.Member;

public interface MemberService {

    Member addMember(Member memberDetails);

    Member getMemberById(Long memberId);

    List<Member> getAllMembers();

    Member updateMember(Long memberId, Member updatedDetails);

    void deleteOrDisableMember(Long memberId);
}