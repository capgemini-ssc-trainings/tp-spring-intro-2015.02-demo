package com.capgemini.springtp.bookdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class CallMonitoringAspect {
  Logger logger = org.slf4j.LoggerFactory.getLogger(CallMonitoringAspect.class);

  @Pointcut("execution(* com.capgemini..service.BookService.*(..))")
  public void serviceMethods() {

  }

  @Around("serviceMethods()")
  public Object monitor(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

    this.logger.info("Monitoring of " + proceedingJoinPoint.toString() + " started");
    StopWatch sw = new StopWatch(proceedingJoinPoint.toString());

    try {
      sw.start(proceedingJoinPoint.toShortString());
      return proceedingJoinPoint.proceed();

    } finally {

      sw.stop();
      this.logger.info(sw.prettyPrint());
      this.logger.info("Monitoring of " + proceedingJoinPoint.toString() + " finished after "
          + sw.getLastTaskTimeMillis() + " ms");
    }

  }
}
