package src.com.hoho.android.usbserial.examples;

public abstract class ConnectListener {
	public enum CommanderStatus
	{
		SUCCESS, 
		FAIL, 
		STATE, 
	}
	public abstract void OnConnectStatusCallBack( boolean bSucceed );
	public abstract void OnDisConnectCallBack();
}
