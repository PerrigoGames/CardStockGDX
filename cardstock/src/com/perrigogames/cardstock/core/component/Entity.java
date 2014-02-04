package com.perrigogames.cardstock.core.component;

import com.badlogic.gdx.utils.OrderedMap;

public class Entity {
	
	protected final OrderedMap<Class<? extends Component>, Component> components = new OrderedMap<Class<? extends Component>, Component>();
	public final int id;
	
	public Entity(int id) {
		this.id = id;
	}
}
