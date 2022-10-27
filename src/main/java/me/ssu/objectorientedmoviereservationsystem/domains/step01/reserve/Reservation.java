package me.ssu.objectorientedmoviereservationsystem.domains.step01.reserve;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

// 예매(Reservation)
public class Reservation {
	private Customer customer;      // 예매자
	private Money fee;              // 기본요금
	private Screening screening;    // 상영정보
	private int audienceAmount;     // 인원수

	public Reservation(Customer customer, Money fee, Screening screening, int audienceAmount) {
		this.customer = customer;
		this.fee = fee;
		this.screening = screening;
		this.audienceAmount = audienceAmount;
	}
}