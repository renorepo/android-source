package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;
	Song mSong;


	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and weeks on billboard
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong() {
		mSong = new Song();
		mWeeksOnBillboard = 4;


	}

	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong(Ensemble ensemble, String title) {
		mSong = new Song(ensemble, title);
		mWeeksOnBillboard = 0;
	}

	/*
	 * Full Song Constructor
	 * Side-effects: Sets the weeks on billboard to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong(Ensemble ensemble, String title, int yearReleased) {
		mSong = new Song(ensemble, title, yearReleased);
		mWeeksOnBillboard = 0;
	}
	/*
	 * Full PopSong Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong(Ensemble ensemble, String title, int yearReleased, int weeksOnBillboard) {
		mSong = new Song(ensemble, title, yearReleased);
		mWeeksOnBillboard = weeksOnBillboard;
	}
}