package me.ssu.objectorientedmoviereservationsystem.domains.step01.screening;

import me.ssu.objectorientedmoviereservationsystem.domains.step01.money.Money;
import me.ssu.objectorientedmoviereservationsystem.domains.step01.movie.Movie;

import java.time.LocalDateTime;

// 상영(Screening)
public class Screening {
	private Movie movie;                    // 영화
	private LocalDateTime whenScreened;     // 상영시간
	private int sequence;                   // 순번

	// TODO 1) 영화 상영을 위해 영화, 상영시간, 순번이 필요
	public Screening(Movie movie, LocalDateTime whenScreened, int sequence) {
		this.movie = movie;
		this.whenScreened = whenScreened;
		this.sequence = sequence;
	}

	// TODO 2) 상영시작 시간 반환
	public LocalDateTime getStartTime() {
		return whenScreened;
	}

	// TODO 3) 순번 체크(순법이 같으면 true)
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}

	// TODO 4) 기본 요금 반환하는 메서드(영화 기본요금)
	public Money getMovieFee() {
		return movie.getFee();
	}

	// TODO 5) 영화 예매(예매자, 인원수)
	public Reselvation reserve(Customer customer, int audienceCount) {
		return new Reselvation(customer, calculateFee(audienceCount), audienceCount);
	}

	// TODO 6) 예매 요금 금액(전체 예매)
	private Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
}