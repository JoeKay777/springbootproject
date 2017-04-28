package net.baba.aspect.utils;

import net.baba.domain.Result;

/**
 * 返回结果工具类
 * 
 * @author 乔凯华 2017年4月27日 下午5:01:07
 * @version 1.0
 */
public class ResultUtil {

	public static Result success(Object o){
		Result result = new Result();
		result.setCode(200);
		result.setMsg("成功");
		result.setData(o);
		return result;
	}
	
	public static Result error(Integer code, String msg){
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}
