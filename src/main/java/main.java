import domain.*;
import infrastructure.InMemoryMemberRepository;
import infrastructure.MasterCardPayementRepository;
import service.MemberService;
import service.PaymentService;


public class main {

    public static void main(String[] args) {
        CompanyId siret = new CompanyId("EDEEFEGEF");
        CompanyName name = new CompanyName("Acceinture");

        ServiceProvider jean = ServiceProvider.of(new ProviderName("Jean"), new Company(name, siret));

        PaymentMethod masterCard = new MasterCardPayementRepository();
        PaymentService paymentService = new PaymentService(masterCard);

        Member newMember = jean.applyForMembership(paymentService,MemberShipType.annual);

        MemberRepository memberRepository = new InMemoryMemberRepository();
        MemberService memberService = new MemberService(memberRepository);

        memberService.create(newMember);


    }
}
