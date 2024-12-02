package com.example.Mydemo.domain.member;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepo {
    private static List<Member> members;

    public MemberRepo() {
    }

    public void insertMember(Member member) {
        members.add(member);
        System.out.println(member.getMemberId());
    }

    public Member selectMemberByEmail(String email) {
        for(Member member : members) {
            if (member.getEmail().equals(email)) {
                return member;
            }
        }

        return null;
    }
}