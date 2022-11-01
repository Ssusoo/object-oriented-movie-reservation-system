package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

// 0원이라는 할인 요금
public class NoneDiscountPolicy extends DiscountPolicy {

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}