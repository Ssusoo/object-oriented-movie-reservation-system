package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

// 할인 조건(DiscountCondition)
public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
/*
TODO 인터페이스(Interface)
	정의
		1) 다중상속
		2)
*/
