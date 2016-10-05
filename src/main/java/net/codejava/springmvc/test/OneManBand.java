package net.codejava.springmvc.test;

import java.util.List;

public class OneManBand implements Performer {
	
	private List<Instrument> instruments;
	
    public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		for(Instrument instrument:instruments){
			instrument.play();
		}

	}

}
