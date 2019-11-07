// MusicFileInterface.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


// Sets up requirements for open, read,
// and close routines for the music file.
// Note it does not specify that file's location,
// you must place the music file in your application's 
// root directory and use a relative path.

import java.io.IOException;
import java.util.ArrayList;

public interface MusicFileInterface
{
	// public MusicFile()

	// Opens a sequential text file to accept 
	// music info and parse it
	//
	// Throws IOException if music file cannot
	// be opened or other IO problems occur
	// openDiskFile opens the file when it's located on the local disk
	// openWebFile opens the file when it's located on the web site
	public void openDiskFile(String musicFileName) throws IOException;
	public void openWebFile(String musicFileName) throws IOException;


	// Are there more items in the file?
	// true = yes (not at end of file); false otherwise
	public boolean hasMoreItems();


	// Read and return one music item, as as ArrayList<String>
	// Number of attributes will varying depending on type of item
	//	read -- but first three are always the same:
	//	accession number, title, media code
	// Hint: Read in a line, then use string tokenizer to break it
	//	into fields, with ";" (and end of string) as the delimiter
	public ArrayList<String> readItem();


	// Close the file
	public void close();
}