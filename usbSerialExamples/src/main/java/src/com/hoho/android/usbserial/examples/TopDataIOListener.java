package src.com.hoho.android.usbserial.examples;

public abstract class TopDataIOListener {
	 public abstract void OnIOCallBack(int nLength,final byte[] data);
}
