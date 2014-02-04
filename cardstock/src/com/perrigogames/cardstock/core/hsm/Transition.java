package com.perrigogames.cardstock.core.hsm;

public abstract class Transition {
	State source;
	State destination;
	
	public Transition(State source, State destination) {
		super();
		this.source = source;
		this.destination = destination;
		source.transitions.add(this);
	}

	public abstract boolean isTriggered();
}
