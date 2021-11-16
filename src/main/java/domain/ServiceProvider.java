package domain;

import service.PaymentService;

public class ServiceProvider implements MemberSubscribe{
    private ProviderName name;
    private Company company;

    private ServiceProvider(ProviderName name, Company company) {
        this.name = name;
        this.company = company;
    }

    public static ServiceProvider of(ProviderName providerName,Company company){
        return new ServiceProvider(providerName,company);
    }

    public Member applyForMembership(PaymentService paymentService, MemberShipType memberShipType) {
        if(name.getName().equals("Hitler"))
            throw new RuntimeException("On aime pas les nazis ici");
        // J'aurais bien voulu renvoyer un objet MemberNotValid comme vous l'avez fait en cours
        // mais en utilisant les private constructor pour member + le of(), je n'arrive pas à faire hériter
        // la classe vu qu'il n'y a pas de constructor public. J'aimerai bien savoir comment on peut faire :)

        Payment payment = paymentService.makePayment(this,memberShipType.getAmount());
       return Member.of(new MemberName(this.name.toString()),this.company,memberShipType);
    }
}
