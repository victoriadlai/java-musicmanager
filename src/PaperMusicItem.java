// PaperMusicItem.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.util.ArrayList;

public class PaperMusicItem extends MusicItem{
	
	int numOfPages;
	
	// Default constructor for PaperMusicItem
	// super() calls the constructor in the MusicItem parent class
	public PaperMusicItem(ArrayList<String> item) {
		super(item);
		numOfPages = Integer.parseInt(item.get(3));
	}
	
	// Formats the PaperMusicItem's supplemental/additional information and returns a
	// string that is suitable for printing
	public String displaySupplementalInfo() {
		String displayString;
		displayString = "# of pages: " + numOfPages;
		return displayString;
	}
	
	// Getters
	
	// Returns PaperMusicItem's number of pages
	public int getNumOfPages(){
		return numOfPages;
	}

}
