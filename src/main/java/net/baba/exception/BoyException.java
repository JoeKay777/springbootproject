package net.baba.exception;

import net.baba.enums.ResultEnum;

public class BoyException extends RuntimeException {

	private Integer code;
	//private String msg;
//	public BoyException(Integer code, String msg) {
//		super(msg);
//		this.code = code;
//		this.msg = msg;
//	}
	public BoyException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
//	public String getMsg() {
//		return msg;
//	}
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
	
	
}
