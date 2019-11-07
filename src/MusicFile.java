// MusicFile.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MusicFile implements MusicFileInterface {
	Scanner musicFileInput;
	static ArrayList<String> oneItemInfo;
	
	// DEFAULT CONSTRUCTOR //
	public MusicFile() {
		musicFileInput = null;
		oneItemInfo = new ArrayList<String>();
	}
	
	// Opens the MusicFile from a local disk
	public void openDiskFile(String musicFileName) throws IOException {
		musicFileInput = new Scanner(new File(musicFileName));
	}

	// Opens the MusicFile from the web
	public void openWebFile(String musicFileName) throws IOException {
		URL remoteFileLocation = new URL(musicFileName);
		URLConnection connection = remoteFileLocation.openConnection();
			
		musicFileInput = new Scanner(connection.getInputStream()); // Scanner for reading in contents from a URL
	}

	// Returns True if MusicFile has more items, false otherwise
	public boolean hasMoreItems() {
		return musicFileInput.hasNextLine();
	}

	// Reads one line of music item in the MusicFile
	public ArrayList<String> readItem() {
		String nextLine = musicFileInput.nextLine();
		oneItemInfo = new ArrayList<String>(Arrays.asList(nextLine.split("; ")));
		return oneItemInfo;
	}

	// Closes the MusicFile
	public void close() {
		if (hasMoreItems()) {
			musicFileInput.close();
		}
	}

}
