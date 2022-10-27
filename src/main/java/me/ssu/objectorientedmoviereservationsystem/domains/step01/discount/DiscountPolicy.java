package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 할인정책(DiscountPolicy)
public abstract class DiscountPolicy {
	// 할인조건
	private List<DiscountCondition> conditions = new ArrayList<>();

	// TODO 1) 할인정책
	public DiscountPolicy(DiscountCondition ... conditions) {
		// ArrayList class -> set(), get(), contains(). size()는 바꿀 수 없음.
		this.conditions = Arrays.asList(conditions);
	}

	// TODO 2) 할인금액 계산
	public Money calculateDiscountAmount(Screening screening) {
		// 할인조건 조회
		for(DiscountCondition each : conditions) {
			// 할인조건에 따른 상영정보가 참일 경우
			if (each.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}
		return Money.ZERO;
	}

	// TODO 3) 상영정보에 따른 할인금액내역
	abstract protected Money getDiscountAmount(Screening screening);
}
/*
TODO 추상 클래스(abstract class)
	정의
		1) 일반 변수나 메소드를 같이 선언할 수 있음.
		2) 상속(extends)은 클래스를 통해 강하게 결합된다.

TODO new ArrayList<>()와 Arrays.asList()
	1) new ArrayList<>()
		1-1) ArrayList를 리턴
	2) Arrays.asList()
		2-1) List 원소를 추가하거나 삭제할 수 없다.
		2-2) Arrays의 정적 클래스인 ArrayList를 리턴
*/