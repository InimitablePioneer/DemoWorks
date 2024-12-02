package com.example.Mydemo.domain.member.dao;

public interface MemberDao {
    Member selectMemberByEmail(String email);

    void insertMember(Member member);

    void updateMember(Member member);
}
