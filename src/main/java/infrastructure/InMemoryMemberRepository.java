package infrastructure;

import domain.Member;
import domain.MemberId;
import domain.MemberRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class InMemoryMemberRepository implements MemberRepository {
    private final AtomicInteger counter = new AtomicInteger(0);
    private final Map<MemberId,Member> members = new HashMap<MemberId,Member>();
    public void save(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Member byId(MemberId memberId) {
        final Member member = members.get(memberId.getId());
        if(member == null)
            throw new RuntimeException("No Member for " + memberId.getId());
        return member;
    }

    public MemberId nextId() {
        return new MemberId(counter.incrementAndGet());
    }

    public List<Member> findAll() {
        return (List<Member>) members.values();
    }
}
