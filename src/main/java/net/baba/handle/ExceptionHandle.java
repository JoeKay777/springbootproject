package net.baba.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import net.baba.aspect.utils.ResultUtil;
import net.baba.domain.Result;
import net.baba.exception.BoyException;

/**
 * 异常处理类
 * 
 * @author 乔凯华 2017年4月28日 上午10:49:11
 * @version 1.0
 */
@ControllerAdvice		//控制层增强类(统一异常处理类)
public class ExceptionHandle {

	private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	@ExceptionHandler(value = Exception.class)	//异常捕获
	@ResponseBody
	public Result handle(Exception e) {
		if (e instanceof BoyException) {
			BoyException boyException = (BoyException) e;
			return ResultUtil.error(((BoyException) e).getCode(), ((BoyException) e).getMessage());
		} else {
			logger.error("【系统错误】{}", e);
			return ResultUtil.error(-1, "系统错误");

		}
	}
}
