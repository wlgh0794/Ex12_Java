package chap12_interface.device;

public class SamsungTv implements Tv 
{


	
	@Override
	public void powerOn()
	{
		System.out.println( "삼성티비 전원을 킵니다" );
	}
	
	@Override
	public void sound()
	{
		System.out.println( "삼성티비 소리를 틉니다." );
	}
		
	@Override
	public void changeChannel( int channel )
	{
		System.out.println( "삼성티비" + channel + "로 이동합니다.");
	}
	@Override
	 public void reset() 
	 {
		 System.out.println( "삼성티비재부팅합니다" );
	 }


	@Override
	public void showDisplay() {
		// TODO Auto-generated method stub
		System.out.println( "삼성티비 화면을 보여줍니다." );
	}

	@Override
	public void poweroff() {
		System.out.println( "삼성티비 전원을 끕니다." );
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}


	


}
