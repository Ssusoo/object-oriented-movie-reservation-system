package me.ssu.objectorientedmoviereservationsystem.manual.detail;

public class DiscountConditionManual {
/*
1. 할인조건(DiscountCondition)
	1-1) 순번 조건(Squence Condition)
		상영 순번을 이용해 할인 여부를 경정하는 규칙.
			-> 영화 회차 할인 같은 개념(2회차 상영 / 10회차 상영)
			-> 조조 할인 개념
		1-1)-1. 변수
			순번(Squence)

		1-1)-2. 생성자
			순번할인조건(순번)
				-> 순번에 따른 순번할인조건

		1-1)-3. 메서드
			상영정보에 따른 순번조건 할인 여부, isSatisBy(상영정보)		// 인터페이스를 상속 받았기에 구현부 마음대로 수정가능

	1-2) 기간 조건(Period Condition)
		영화 상영 시작 시간을 이용해 할인 여부를 결정하는 규칙
			-> 월요일 18:00-21:00에 하는 상영작에 대하여 할인 적용
			-> 수요일(영화의 날?)

		1-1)-1. 변수
			조건에 사용할 요일(dayOfWeek)
			상영시작 시간(startTime)
			사영종료 시간(endTime)

		1-2)-2. 생성자
			기간조건(조건에 사용할 요일, 상영시작 시작, 상영정료 시간)

		1-2)-3. 메서드
			조건
				상영정보가 같고
				상영시작 시간이 시작 시간과 종료 시간 사이에 있을 경우 참
				그렇지 않을 경우 false
*/
}