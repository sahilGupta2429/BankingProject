package com.testbank.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	final static Logger logger = Logger.getLogger(LoggingAspect.class);
	@Around("execution(* com.testbank..*.*(..))")
	public Object trace(ProceedingJoinPoint proceedingJP ) throws Throwable {
		String methodInformation = 
				proceedingJP.getStaticPart().getSignature().toString();
		logger.info("Entering "+methodInformation);
		try {
			return proceedingJP.proceed();
		} catch (Throwable ex) {
			logger.error("Exception in "+methodInformation, ex);
			throw ex;
		} finally {
			logger.info("Exiting "+methodInformation);
		}
	}

}
