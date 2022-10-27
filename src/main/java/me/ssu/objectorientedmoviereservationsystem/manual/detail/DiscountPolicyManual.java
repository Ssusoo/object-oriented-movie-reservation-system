package me.ssu.objectorientedmoviereservationsystem.manual.detail;

public class DiscountPolicyManual {
/*
1. 할인 정책
	: 두 클래스는 대부분의 코드가 유사하다.
	: 할인 요금 계산하는 방식만 다름
	: 두 클래스 사이의 중복 코드를 제거하기 위해
	: 공통 코드를 보관할 장소가 필요하다.

	->	부모 클래스
		: DiscountPolicy(객체를 생성할 필요가 없기 때문에 추상 클래스(abstract class)로 구현
		=> 자식 클래스 : AmountDiscountPolicy
		=> 자식 클래스 :  PercentDiscountPolicy

	1) 할인정책(DiscountPolicy : abstract)
		1-1) 변수
			1-1)-1. 할인 조건(DiscountCondition)
				-> 할인정책은 할이조건의 리스트인 conditions를 객체 변수로 가지고 있기에
				-> 하나의 할인 정책은 여러 개의 조건을 포함할 수 있다.

		1-2) 메서드
			1-2)-1. 할인금액 계산 메서드(calculateDiscountAmount)
				-> calculateDiscountAmount 메서드는 전체 할인 조건에 대해 할인조건의 isSatisfiedBy 메서드 호출
				-> isSatisfiedBy 메서드는 인자로 전달된 상영정보(Screening)로 받음.
			1-2)-2. 할인금액 정보 메서드, getDiscountAmount(상영정보)

		1-3) 조건
			상영정보(Screening)가 할인조건에 부합하면
			true, 할인금액을 정보 반환
			false, 제로 반환

	2) 금액 할인 정책(AmountDiscountPolicy)
		1-1)-1. 변수
			할인 금액(discountAmount)
		1-1)-2. 생성자
			금액할인정책(할인금액, 할인조건)
*/
}