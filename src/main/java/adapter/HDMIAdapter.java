package adapter;

public class HDMIAdapter implements VGA{

	private HDMI hdmi;
	
	public HDMIAdapter(HDMI hdmi) {
		this.hdmi = hdmi;
	}
	
	//我没有vga接口，只有vga接口，只能在vga接口中调用hdmi接口
	@Override
	public void playvga() {
		hdmi.playhdmi();
	}

}
