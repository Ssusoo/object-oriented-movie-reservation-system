package me.ssu.objectorientedmoviereservationsystem.domains.step01.reserve;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.screening.Screening;

// 예매(Reservation)
public class Reservation {
	private Customer customer;
	private Money fee;
	private Screening screening;
	private int audienceAmount;

	public Reservation(Customer customer, Money fee, Screening screening, int audienceAmount) {
		this.customer = customer;
		this.fee = fee;
		this.screening = screening;
		this.audienceAmount = audienceAmount;
	}
}