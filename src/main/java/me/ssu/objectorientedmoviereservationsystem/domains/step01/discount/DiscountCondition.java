package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

// 할인 조건(DiscountCondition)
public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
