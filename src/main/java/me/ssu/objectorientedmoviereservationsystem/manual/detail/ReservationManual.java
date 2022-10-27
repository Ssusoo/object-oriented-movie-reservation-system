package me.ssu.objectorientedmoviereservationsystem.manual.detail;

public class ReservationManual {
/*
1. 예매(Reserve)
	: 영화를 예매하기 위해 영화(movie), 상영정보(Screening), 예매(Reservation) 객체들은
	: 서로의 메서드를 호출하며 상호작용한다.
	: 어떤 기능을 구현하기 위해 객체들 사이에 이뤄지는 상호작용을 협력(Collaboration)이라고 한다.

	1-1) 변수
		1-1)-1. 영화 요금(fee)
		1-1)-2. 상영정보(Screening 클래스)
		1-1)-3. 예매자(Customer 클래스)
		1-1)-4. 인원수(audienceCount)
	1-2) 생성자
		예매(영화, 상영정보, 요금, 예매자)

TODO Q 1 : 객체지향 프로그램을 작성할 때?
	먼저 협력의 관점에서 어떤 객체가 필요한지를 결정하고,
	객체들의 공통 상태와 행위를 구현하기 위해 클래스를 작성한다.
	따라서 협력에 대한 개념을 간략하게라도 살펴보는 것이 도움이 될 수 있다.

TODO Q 2 : 협력을 정의하는 용어는?
	요청(Request)와 응답(Response) : 요청을 받은 객체를 자율적인 방법에 따라
	요청을 처리한 후 응답한다.

TODO Q 3 : 다른 객체와 상호작용할 수 있는 유일한 방법은?
	1) 메시지를 전송하는 것이다(send a message)
	2) 다른 객체에게 요청이 도착할 때 해당 객체가 메시지를 수신(receive a message)
	3) 메시지를 수신한 객체는 스스로의 결정에 따라 자율적으로 메시지를 처리할 방법을 결정한다.
	4) 이처럼 수신된 메시지를 처리하기 위한 자신만의 방법을 메서드(method)라고 한다.
*/
}