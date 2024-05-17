package chap12_interface.device;

public class LgTv implements Tv  {

	@Override
	public void showDisplay() 
	{
		System.out.println( "엘지티비 화면을 보여줍니다." );
		
	}

	@Override
	public void powerOn() {
		System.out.println( "LG TV : 전원을 킵니다." );
		
	}

	@Override
	public void poweroff() {
		System.out.println( "LG TV : 전원을 끕니다." );
		
	}	
	
	
	@Override
	public void sound() {
		System.out.println( "LG TV : 노래를 틉니다." );
		
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println( "LG TV : "  +  channel + "채널 로 변경합니다." );
		
	}


	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

}
