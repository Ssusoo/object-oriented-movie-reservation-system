package me.ssu.objectorientedmoviereservationsystem.domains.step01.discount;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

// 할인조건(기간조건)
public class PeriodCondition implements DiscountCondition {

	private DayOfWeek dayOfWeek;    // 조건에 따른 요일(요일을 표현하는 enum 클래스)
	private LocalTime startTime;    // 시작 시간
	private LocalTime endTime;      // 종료 시간

	// TODO 1) 기간조건

	public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	// TODO 2) 상영정보에 따른
	@Override
	public boolean isSatisfiedBy(Screening screening) {
		// 조건(상영 요일이 dayOfWeek이랑 같고 상영 시작 시간이 startTime과 endTime 사이에 있을 경우
		return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
				startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
				endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
	}
}