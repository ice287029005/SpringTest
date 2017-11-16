package com.hollespring;

public class HolleSpring {
	@SuppressWarnings("unused")
	private String message;

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
