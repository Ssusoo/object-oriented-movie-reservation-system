package me.ssu.objectorientedmoviereservationsystem.domains.step01.money;

import java.math.BigDecimal;

// 금액(Money)
public class Money {
	public static final Money ZERO = Money.wons(0);

	// TODO BigDecimal(숫자를 정밀하게 저장하고 표현할 수 있는 유일한 방법)
	//  자바에서 돈과 소수점을 다룬다면 'BigDecimal'은 선택이 아니라 필수다.
	//  BigDecimal의 단점은 느린 속도와 기본 타입보다 조금 불편한 사용법이 있다.
	private final BigDecimal amount;

	Money(BigDecimal amount) {
		this.amount = amount;
	}

	// TODO 정수 떨어질 때
	public static Money wons(long amount) {
		// valueOf() : Number 객체 형으로 변환해 반환함.
		return new Money(BigDecimal.valueOf(amount));
	}

	// TODO 소수로 떨어질 때
	public static Money wons(double amount) {
		// valueOf() : Number 객체 형으로 변환해 반환함.
		return new Money(BigDecimal.valueOf(amount));
	}

	// TODO BigDecimal(더하기 add())
	public Money plus(Money amount) {
		return new Money(this.amount.add(amount.amount));
	}

	// TODO BigDecimal(뺴기 subtract())
	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}

	// TODO BigDecimal(곱하기 multiply()) : 할인 정책에서 비율 금액할인 적용
	public Money times(double percent) {
		return new Money(this.amount.multiply(
			BigDecimal.valueOf(percent)
		));
	}

	// TODO BigDecimal(값 비교 compareTo()) 적을 때
	public boolean isLessThan(Money other) {
		return amount.compareTo(other.amount) < 0;
	}

	// TODO BigDecimal(값 비교 compareTo()) 많을 때
	public boolean isGreaterThanOrEqual(Money other) {
		return amount.compareTo(other.amount) >= 0;
	}
}