package com.bloc.securitypackages.citrus;
import com.bloc.securitypackages.Fruit;

class Orange extends Fruit {
	Orange() {
		super("Orange", 130, new Orange(), .21d);
	}
}