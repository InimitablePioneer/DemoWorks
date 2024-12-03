package com.example.Mydemo.domain.member.dao;

import com.example.Mydemo.domain.member.Member;

public interface MemberDao {
    Member selectMemberByEmail(String email);

    void insertMember(Member member);

    void updateMember(Member member);
}
