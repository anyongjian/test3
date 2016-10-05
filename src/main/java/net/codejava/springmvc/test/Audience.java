package net.codejava.springmvc.test;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats(){
		System.out.println("�ð��");
	}
	public void turnOffPhones(){
		System.out.println("���ֻ�");
	}
	public void applaud(){
		System.out.println("����");
	}
	public void demandRefund(){
		System.out.println("Ҫ���˿�");
	}
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		try{
			System.out.println("�ð��");
			System.out.println("���ֻ�");
			long start = System.currentTimeMillis();
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("����");
			System.out.println("������ʱ���� "+(end - start)+"����");
		}catch(Throwable t ){
			System.out.println("Ҫ���˿�");
		}
	}
}
