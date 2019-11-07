// VinylMusicItem.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.util.ArrayList;

public class VinylMusicItem extends MusicItem {
	
	String labelImprint;
	int speedOfPlay;
	
	// Default constructor for VinylMusicItem
	// super() calls the constructor in the MusicItem parent class
	public VinylMusicItem(ArrayList<String> item) {
		super(item);
		labelImprint = item.get(3);
		speedOfPlay = Integer.parseInt(item.get(4));
	}
	
	// Formats the VinylMusicItem's supplemental/additional information and returns a
	// string that is suitable for printing
	public String displaySupplementalInfo() {
		String displayString;
		displayString = "Label: " + labelImprint + " | RPM: " + speedOfPlay;
		return displayString;
	}
	
	// Getters 
	
	// Returns the VinylMusicItem's label imprint
	public String getLabelImprint(){
		return labelImprint;
	}
	
	// Returns the VinylMusicItem's speed of play
	public int getSpeedOfPlay(){
		return speedOfPlay;
	}

}
