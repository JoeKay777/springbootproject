package net.baba.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 切面类
 * 
 * @author 乔凯华 2017年4月26日 下午3:35:39
 * @version 1.0
 */
@Aspect
@Component
public class BoyAspect {
	
	//日志输出,方便控制台查看输出效果
	private final static Logger logger = LoggerFactory.getLogger(BoyAspect.class);
	
	//定义切点
	@Pointcut("execution(public * net.baba.controller.BoyController.*(..))")
	public void log(){
		
	}
	
//	@Before("log()")
//	public void doBefore(JoinPoint joinPoint){
//		logger.info("方法执行前...");
//		//用来获取请求参数
//		ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
//		HttpServletRequest request = attributes.getRequest();
//		
//		//url
//		logger.info("url={}", request.getRequestURL());
//
//		 //method
//        logger.info("method={}", request.getMethod());
//
//        //ip
//        logger.info("ip={}", request.getRemoteAddr());
//        
//        //类方法
//        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        
//        //参数
//        logger.info("args={}", joinPoint.getArgs());
//	}
//	
//	@After("log()")
//	public void doAfter(){
//		logger.info("方法执行后...");
//	}
//
//	@AfterReturning(pointcut = "log()", returning = "object")
//	public void doAfterReturning(Object object){	//object为切点方法返回的结果
//		logger.info("response={}", object.toString());
//		
//	}
	
	/*@Around("log()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		logger.info("@around执行前...");
		Object proceed = joinPoint.proceed();
		logger.info(proceed.toString());
		logger.info("@around执行后...");
	}*/
	
	
}
