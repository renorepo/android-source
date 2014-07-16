package com.bloc.generics;

class ToyBox extends Object {
	private Toy<?>[] mToys;
	// create a new empty toy box
	public ToyBox() {
		this(new Toy<?>[0]);
	}
	/*Pass an unspecificed amount of Toys with
	 *with a generic type to Toybox. */
	
	public ToyBox(Toy<?>... toys) {
		super();
		mToys = toys;
	}
	// add a generic toy of any type to the list.
	public void addToy(Toy<?> newToy) {
		Toy<?>[] toysTemp = new Toy<?>[mToys.length + 1];
		for (int i = 0; i < mToys.length; i++) {
			toysTemp[i] = mToys[i];
		}
		toysTemp[mToys.length] = newToy;
		mToys = toysTemp;
	}

	public Toy<?> getToyAtIndex(int index) {
		if (index < 0 || index >= mToys.length) {
			return null;
		}
		return mToys[index];
	}

	public int getToyCount() {
		return mToys.length;
	}
}