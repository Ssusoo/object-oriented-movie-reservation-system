package me.ssu.objectorientedmoviereservationsystem.domains.step01.movie;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

import java.time.Duration;

// 영화(Movie)
public class Movie {
	private String title;                       // 영화제목
	private Duration runningTime;               // 상영시간
	private Money fee;                          // 요금
	private DiscountPolicy discountPolicy;      // 할인정책

	// TODO 1) 영화
	public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountPolicy = discountPolicy;
	}

	// TODO 2) 기본 요금 정보 가져오기
	public Money getFee() {
		return fee;
	}

	// TODO 3) 할인 요금 차감하기
	public Money calculateMovieFee(Screening screening) {
		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}
}