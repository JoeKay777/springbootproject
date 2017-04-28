package net.baba.enums;

/**
 * 使用枚举统一异常返回结果
 * 
 * @author 乔凯华 2017年4月28日 下午1:07:21
 * @version 1.0
 */
public enum ResultEnum {

	UNKONW_ERROR(-1,"未知错误"),
	SCUCESS(0,"成功"),
	TOO_YOUNG(100,"年龄太小了"),
	TOO_OLD(102,"年龄太大了"),
	;
	
	private Integer code;
	
	private String msg;

	private ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	
}
