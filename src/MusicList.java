// MusicList.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.util.ArrayList;

public class MusicList implements MusicListInterface {
	
	ArrayList<Bucket> bucketArrayList;
	int totalItemCount;
	int paperItemCount;
	int compactMediaItemCount;
	int vinylItemCount;
	int waxCylinderItemCount;
	
	// Default constructor for a MusicList object
	// Creates an ArrayList of 26 items, each corresponding to a letter A-Z
	public MusicList() {
		bucketArrayList = new ArrayList<Bucket>();
		
		for (int i = 0; i < 26; i++) {
			bucketArrayList.add(new Bucket());
		}
		
	}
	
	// Adds a MusicItem to the appropriate bucket
	// The first letter of the title of the first MusicItem in the Bucket should 
	// correspond to the the first letter of the title of the MusicItem to be added
	public void addItem(MusicItem item) {
		String itemTitle;
		String itemMediaCode;
		
		itemTitle = item.getTitle();
		itemMediaCode = item.getMedia();

		bucketArrayList.get(itemTitle.charAt(0) - 'A').addItem(item);
		
		totalItemCount++;
		
		switch (itemMediaCode) {
		case "P":
			paperItemCount++;
			break;
		case "C":
			compactMediaItemCount++;
			break;
		case "V":
			vinylItemCount++;
			break;
		case "W":
			waxCylinderItemCount++;
			break;
		}
	}

	// Getters
	
	// Returns the ArrayList of Buckets
	public ArrayList<Bucket> getBuckets() {
		return bucketArrayList;
	}

	// Returns the total number of items in the music list
	public int getTotalItemCount() {
		return totalItemCount;
	}

	// Returns the total number of paper items in the music list
	public int getPaperItemCount() {
		return paperItemCount;
	}

	// Returns the total number of compact media items in the music list
	public int getCompactMediaItemCount() {
		return compactMediaItemCount;
	}

	// Returns the total number of vinyl items in the music list
	public int getVinylItemCount() {
		return vinylItemCount;
	}

	// Returns the total number of wax cylinder items in the music list
	public int getWaxCylinderItemCount() {
		return waxCylinderItemCount;
	}

}
