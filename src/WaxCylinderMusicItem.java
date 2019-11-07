// WaxCylinderMusicItem.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016

import java.util.ArrayList;

public class WaxCylinderMusicItem extends MusicItem{
	
	String maker;
	
	// Default constructor for WaxCylinderMusicItem
	// super() calls the constructor in the MusicItem parent class
	public WaxCylinderMusicItem(ArrayList<String> item) {
		super(item);
		maker = item.get(3);
	}
	
	// Formats the WaxCylinderMusicItem's supplemental/additional information 
	// and returns a string that is suitable for printing
	public String displaySupplementalInfo() {
		String displayString;
		displayString = "Maker: " + maker;
		return displayString;
	}
	
	// Getters
	
	// Returns the WaxCylinderMusicItem's maker
	public String getMaker(){
		return maker;
	}

}
