// CompactMusicItem.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.util.ArrayList;

public class CompactMusicItem extends MusicItem {
	int numOfTracks;
	String yearOfRelease;
	
	// DEFAULT CONSTRUCTOR //
	public CompactMusicItem(ArrayList<String> item) {
		super(item);
		numOfTracks = Integer.parseInt(item.get(3));
		yearOfRelease = item.get(4);
	}
	
	// Returns the Supplemental Information in a form suitable for printing
	public String displaySupplementalInfo() {
		String displayString;
		displayString = "# of tracks: " + numOfTracks + " | Year released: " + yearOfRelease;
		return displayString;
	}
	
	// GETTERS //
	
	// Returns a CompactMusicItem's number of tracks
	public int getNumOfTracks(){
		return numOfTracks;
	}
	
	// Returns a CompactMusicItem's year of release
	public String getYearOfRelease(){
		return yearOfRelease;
	}

}
