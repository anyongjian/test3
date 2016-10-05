package net.codejava.springmvc.test;

public class Sonnet29 implements Poem {
	
	private static String[] LINES = {
			"aaaaaaaaaaaaaaaa",
			"bbbbbbbbbbbbbb"
	};
	public Sonnet29() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(int i = 0;i<LINES.length;i++){
			System.out.println(LINES[i]);
		}

	}

}
