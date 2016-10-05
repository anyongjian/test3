package net.codejava.springmvc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer {

	public Instrumentalist() {
		// TODO Auto-generated constructor stub
	}
	
	private String song;
	@Autowired
	private Instrument instrument;
	private int age;
	
	

	public void setSong(String song) {
		this.song = song;
	}



/*	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}*/
	
	

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public void perform() {
		System.out.println("plalying " + song + ":");
		instrument.play();
		System.out.println("age is:"+age);

	}

}
