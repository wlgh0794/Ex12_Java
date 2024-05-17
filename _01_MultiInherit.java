package chap12_interface;

import chap12_interface.multiflex.ConcertHall;
import chap12_interface.multiflex.MultiFlexStadium;
import chap12_interface.multiflex.SeoulMulitflexStadium;
import chap12_interface.multiflex.Stadium;

public class _01_MultiInherit {

	public static void main(String[] args) 
	{
		// SeoulMultiFlexStadium은 부모 클래스를 MultiFlexStadium
		// 조부모인터페이스로는 Stadum , ConcertHall을 상속 받았기 때문에
		// 부모와 조부모의 형태를 모두 가지고 있다.
		
		// 따라서 부모타입의변수나조부모 타입의 변수에 객체를 담아서 사용할 수 있게 됟나.
		
		Stadium st = new SeoulMulitflexStadium();
		
		ConcertHall ch = new SeoulMulitflexStadium();
		
		MultiFlexStadium mfs = new SeoulMulitflexStadium();
		
		Theater theater = new SeoulMulitflexStadium();
		
		SeoulMulitflexStadium smfs = new SeoulMulitflexStadium();
		
		
//		mfs.getTicketprice()

	}

}
