package domain;

public class Member {
    private MemberName name;
    private Company company;
    private MemberShipType memberShipType;
    private MemberId memberId;

    private Member(MemberName name, Company company, MemberShipType memberShipType) {
        this.name = name;
        this.company = company;
        this.memberShipType = memberShipType;
    }

    public static Member of(MemberName name,Company company,MemberShipType type){
        return new Member(name,company,type);
    }

    public MemberId getMemberId() {
        return memberId;
    }
}
