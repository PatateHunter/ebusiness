package domain;

import service.PaymentService;

public interface MemberSubscribe {
    public Member applyForMembership(PaymentService payment, MemberShipType memberShipType);
}
