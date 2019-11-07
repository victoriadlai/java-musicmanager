// MusicManager.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicManager implements MusicManagerInterface {

	private String fileTypeInput; // User input
	Scanner scanner;
	MusicFile musicFile;
	String diskFileName;
	String webFileName;
	String indexFileName;
	
	// DEFAULT CONSTRUCTOR 
	public MusicManager() {
		musicFile = new MusicFile();
		diskFileName = "music.txt";
		webFileName = "http://www.ics.uci.edu/~rkwang/music.txt";
		indexFileName = "index.txt";
	}
	
	// Takes a list of music items and creates a index text file with all items
	// sorted alphabetically and formatted nicely
	public void makeIndexAndDisplayCounts() {
		Scanner scanner = new Scanner(System.in);	// Scanner for user input
		System.out.println("Welcome to the Donation Music Archive!");
		System.out.print("Is the music file on a disk or on the web? ");
		fileTypeInput = scanner.next();

		try {
			if (fileTypeInput.toLowerCase().equals("disk")) {
				musicFile.openDiskFile(diskFileName);
			}
			else if (fileTypeInput.toLowerCase().equals("web")) {	
				musicFile.openWebFile(webFileName);
			}
			
			MusicList musicList = new MusicList();
			
			while (musicFile.hasMoreItems()) {
	
				ArrayList<String> convertToMusicItem = musicFile.readItem();					
				String itemMediaCode = convertToMusicItem.get(2);
					
				switch (itemMediaCode) {
				case "P":
					PaperMusicItem paperMusicItem = new PaperMusicItem(convertToMusicItem);
					musicList.addItem(paperMusicItem);
					break;
				case "C":
					CompactMusicItem compactMusicItem = new CompactMusicItem(convertToMusicItem);
					musicList.addItem(compactMusicItem);
					break;
				case "V":
					VinylMusicItem vinylMusicItem = new VinylMusicItem(convertToMusicItem);
					musicList.addItem(vinylMusicItem);
					break;
				case "W":
					WaxCylinderMusicItem waxCylinderMusicItem = new WaxCylinderMusicItem(convertToMusicItem);
					musicList.addItem(waxCylinderMusicItem);
					break;
				}
			}	
			
			musicFile.close();
			
			IndexFile indexFile = new IndexFile();
			indexFile.open(indexFileName);
			
			for (int i = 0; i < musicList.getBuckets().size(); i++) { // for each Bucket in the MusicList
				for (int j = 0; j < musicList.getBuckets().get(i).getItems().size(); j++) { // for each MusicItem in Bucket
					indexFile.writeItem(musicList.getBuckets().get(i).getItems().get(j));
				}
			}

			indexFile.close();
			
			System.out.println("Index File Name: " + indexFileName);
			System.out.format("Paper Count: %d%nCompact Media Count: %d%nVinyl Count: %d%nWax Cylinder Count: %d%nTotal Count: %d", 
					musicList.getPaperItemCount(), musicList.getCompactMediaItemCount(), musicList.getVinylItemCount(),
					musicList.getWaxCylinderItemCount(), musicList.getTotalItemCount());
			
		} catch (FileNotFoundException e) {
			System.out.println("The file cannot be found.");
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println("An error has occured.");
		} 
		
	scanner.close();
	
	}

	



	
	
	
	
}
