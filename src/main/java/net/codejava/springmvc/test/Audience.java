package net.codejava.springmvc.test;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats(){
		System.out.println("拿板凳");
	}
	public void turnOffPhones(){
		System.out.println("关手机");
	}
	public void applaud(){
		System.out.println("鼓掌");
	}
	public void demandRefund(){
		System.out.println("要求退款");
	}
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		try{
			System.out.println("拿板凳");
			System.out.println("关手机");
			long start = System.currentTimeMillis();
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("鼓掌");
			System.out.println("表演总时长： "+(end - start)+"毫秒");
		}catch(Throwable t ){
			System.out.println("要求退款");
		}
	}
}
