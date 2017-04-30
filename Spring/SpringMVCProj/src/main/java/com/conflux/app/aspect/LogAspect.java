package com.conflux.app.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	private Logger logger = Logger.getLogger(LogAspect.class);

	
	  @Before("execution(public * com.conflux.app.controller.RegisterController.*(..))") 
	  public void logMethod(JoinPoint joinPoint){
	  
	  Object targetRef = joinPoint.getTarget();
	  
	  Object[] arguments=joinPoint.getArgs();
	  
	  logger.info("*****"+joinPoint.toShortString()+"*****");
	 

	/*
	 * @AfterReturning(pointcut =
	 * "execution(public * com.conflux.app.controller.*.*(..))", returning =
	 * "returnValue") public void logMethod(JoinPoint joinPoint) {
	 * 
	 * Object targetRef = joinPoint.getTarget();
	 * 
	 * Object[] arguments = joinPoint.getArgs();
	 * 
	 * logger.info("*****" + joinPoint.toShortString() + "*****");
	 */

	/*@Around("execution(public * com.conflux.app.controller.*.*(..))")
	public Object logMethod(ProceedingJoinPoint proceedingJoinPoint, SQLException sqlException) throws Throwable {

		Object targetRef = proceedingJoinPoint.getTarget();

		Object[] arguments = proceedingJoinPoint.getArgs();

		logger.info("*****Before: " + proceedingJoinPoint.toShortString() + "*****");
		Object returnValue = proceedingJoinPoint.proceed();
		logger.info("*****After: " + proceedingJoinPoint.toShortString() + "*****");
		return returnValue;*/
	}
}
