package com.bloc.inherit;
class GoldenRetriever extends Dog {
	@Override
	void play() {
		setWeight(getWeight() - WEIGHT_LOST_FROM_FEEDING);
		if (getWeight() < MINIMUM_WEIGHT) {
			setWeight(MINIMUM_WEIGHT);
		}
		// Pre-increment play counter
		if (++mPlayCounter == 3) {
			changeSize(false);
			mPlayCounter = 0;
		}
	}
}
// CLASS DEFINITION GOES HERE