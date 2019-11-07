// MusicListInterface.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.util.ArrayList;

// The list of music items (an ArrayList of 26 cells,
// representing the letters A to Z, with each cell 
// a Bucket that contains a list of MusicItems whose
// title all start with the letter the cell represents,
// and in sorted order by title.
interface MusicListInterface
{
	
	// Make a bucket for each of the 26 list locations;
	// Set counts of items to zero
	// public MusicList()

	
	// Add an item into the correct bucket in the list
	// Bucket to use is one corresponding to first letter in title
	// Increment the appropriate media count
	public void addItem(MusicItem item);
	
	
	
// Accessors	
	
	public ArrayList<Bucket> getBuckets();	
	
	public int getTotalItemCount();
	
	public int getPaperItemCount();
	
	public int getCompactMediaItemCount();	
	
	public int getVinylItemCount();
	
	public int getWaxCylinderItemCount();
}
