package service;

import domain.Member;
import domain.MemberRepository;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    public void create(Member member){
        this.memberRepository.save(member);
    }
}
