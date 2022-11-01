package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

public interface DefaultDiscountPolicy {
	Money calculateDiscountAmount(Screening screening);
}
/*
TODO 인터페이스(Interface)
	정의
		1) 다중상
		2) 일반 변수나 메소드를 같이 선언할 수 없음.
		3) 합성은 메시지를 통해 느슨하게 결합된다.
		4) 자식클래스에서 상속을 받으면 메소드 오버라이딩(재정의)해 무조건 사용해야 한다.
	오버라이딩 또는 오버라이드
		1) 부모에게 받은 메소드를 그냥 사용할 경우 재정의를 안해도 됨(자식 클래스의 경우)
		2) 부모에게 받은 메소드를 재정의할 경우 구현부만 재정의하면 됨(자식 클래스의 경우)

	오버로딩이랑 헷갈리면 안됨
		다양한 주문서를 구분할 수 있는 게 그게 오버로딩이다.
*/