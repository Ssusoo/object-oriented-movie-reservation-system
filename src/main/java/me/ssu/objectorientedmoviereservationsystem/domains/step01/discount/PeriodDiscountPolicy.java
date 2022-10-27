package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

// 기간 할인 정책
public class PeriodDiscountPolicy extends DiscountPolicy {

	private double percent;

	// TODO 1) 기간 할인 정책
	public PeriodDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	// TODO 2) 상영정보에 따른 기간 할인 금액
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
