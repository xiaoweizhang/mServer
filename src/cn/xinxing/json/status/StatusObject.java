package cn.xinxing.json.status;

/**
 * 状态对象
 */
public class StatusObject {
	// 状态码
	private String code;

	// 状态信息
	private String msg;

	public StatusObject(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
