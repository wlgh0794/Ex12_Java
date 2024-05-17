package chap12_interface.multiflex;

public interface ConcertHall {
	
	
	public int printSchedule( int month )
	{
		System.out.println( month + "월에 예정된 콘서트는 총 2건 입니다." );
	}
	
	public int getTicketprice( int people )
	{
		return people * 96000 ;
		
	}
	
	public int  getRemainSeat();
	{
		System.out.println( "남아 있는 총 좌석은 125석입니다." );
		
		
	}
}
