package Utils;

public class No_Body_Exception extends Throwable {

	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public No_Body_Exception(String msg) 
	{
		this.msg = msg;
	}

}
