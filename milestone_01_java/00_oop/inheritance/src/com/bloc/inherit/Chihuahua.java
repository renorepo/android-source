package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
class Chihuahua extends Dog {
	@Override
	void feed() {
		mWeight += WEIGHT_GAINED_FROM_FEEDING;
			if (++mFeedCounter == 5) {
				changeSize(true);
				mFeedCounter = 0;
			}
	}
}