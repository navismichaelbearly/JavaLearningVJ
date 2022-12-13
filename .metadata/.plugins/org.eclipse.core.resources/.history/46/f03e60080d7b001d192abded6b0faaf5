package com.n2s.SpringAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Tea {
	
	@Autowired
	private Brand br;
	
	public Tea(Brand br) {
		super();
		this.br = br;
	}

	public Brand getBr() {
		return br;
	}

	public void setBr(Brand br) {
		this.br = br;
	}

	@Override
	public String toString() {
		return br.getName() + " " + br.getPrice();
	}
	
	public void drink() {
		System.out.println("Drinking Tea");
	}
	

}
