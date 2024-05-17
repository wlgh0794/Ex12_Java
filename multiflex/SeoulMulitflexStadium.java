package chap12_interface.multiflex;

import chap12_interface.Theater;

// MultiFlexStadium 이 Stadium과 ConcertHall의 형태도 가지고 있기 때문에 
// Stadium 타입의 변수에도 사용할 수 있고 ConcertHall 타입의 변수에도 사용할 수 있고
// MultiFlexStadium 타입 변수에도 사용할 수 있으며 , SeoulMultiflexStadium 타입 변수로도 사용할 수 있다 .

// 한 클래스에서 클래스 상속도 받고 인터페이스도 상속 받을 수 있다.

public class SeoulMulitflexStadium extends Theater implements MultiFlexStadium {

	@Override
	public void gotSportSchedule(int month) 
	{
		System.out.println( month + "월에 예정된 경기는 총 5 경기 입니다." );
	}

	@Override
	public int getSportsTicktPrice(int people) 
	{
		return 7000 * people ;
	}

	@Override
	public void getSupporterItem(int people) {
		
		System.out.println( people + "명의 아이템 구매 가격 :" +   people * 15000 + "원 입니다." );

	}

	@Override
	public void printSchedule(int month) {
		// TODO Auto-generated method stub
		
		System.out.println( month + "월에 예정된 콘서트는 총 2건 입니다." );
	}

	@Override
	public int getTicketprice(int people) {
		// TODO Auto-generated method stub

		return people * 96000 ;
	}

	@Override
	public void getRemainSeat() {
		// TODO Auto-generated method stub
		System.out.println( "남아 잇는 총 좌석은 125석 입니다." );
	}

	@Override
	public void playSportsgameOrConcert() {
		// TODO Auto-generated method stub
		
		System.out.println( "토요일에는 수원 대 서울 경기가 진행되고 " + "일요일에는 싸이 콘서트가 진행될 예정입니다." );
	}

	public void playMovie() 
	{
		System.out.println( "영화를 상영한다." );
	}
	
}
