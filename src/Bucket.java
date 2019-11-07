// Bucket.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.util.LinkedList;

public class Bucket implements BucketInterface {

	LinkedList<MusicItem> bucket; 
	
	// DEFAULT CONSTRUCTOR //
	public Bucket(){
		bucket = new LinkedList<MusicItem>();
	}
	
	// Adds a MusicItem to its corresponding bucket in alphabetical order
	public void addItem(MusicItem itemToAdd) {
		if (bucket.size() == 0) {
			bucket.add(itemToAdd);
		}
		else {
			for (int i = 0; i < bucket.size(); i++) {
				if (itemToAdd.getTitle().compareTo(bucket.get(i).getTitle()) <= 0) { 
					bucket.add(i, itemToAdd);
					return;
				}
				else {
					bucket.add(itemToAdd);
					return;
				}
			}
		}
	}
	
	// Returns the MusicItems in the bucket
	public LinkedList<MusicItem> getItems() {
		return bucket;
	}
	


}
