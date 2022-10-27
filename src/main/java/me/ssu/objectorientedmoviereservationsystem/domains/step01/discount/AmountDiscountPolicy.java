package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

// 금액 할인 정책
public class AmountDiscountPolicy extends DiscountPolicy {

	private Money discountAmount;   // 할인금액

	// TODO 1) 금액 할인 정책
	public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
		super(conditions);
		this.discountAmount = discountAmount;
	}

	// TODO 2) 상영정보에 따른 할인 금액 반환
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}

