package net.codejava.springmvc.test;

import org.springframework.stereotype.Component;

//@Component
public class Guitar implements Instrument {

	public Guitar() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("da da da ...");

	}

}
