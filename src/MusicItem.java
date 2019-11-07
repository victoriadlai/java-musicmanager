// MusicItem.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.util.ArrayList;

abstract class MusicItem implements MusicItemInterface{
	MusicFile musicFile;
	ArrayList<String> oneItemInfo;
	
	// DEFAULT CONSTRUCTOR //
	public MusicItem(ArrayList<String> item) {
		oneItemInfo = item;
	}
	
	// GETTERS //
	
	// returns a MusicItem's Accession Number 
	public String getAccessionNumber() {
		return oneItemInfo.get(ACCESSION_NUMBER_POSITION);
	}
	
	// returns a MusicItem's Title 
	public String getTitle() {
		return oneItemInfo.get(TITLE_POSITION);
	}

	// returns a MusicItem's Media Code
	public String getMedia() {
		return oneItemInfo.get(MEDIA_CODE_POSITION);
	}

}
