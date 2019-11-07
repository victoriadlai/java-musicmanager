// IndexFile.java
// ICS 45J Lab Assignment 5
//
// Coded by: 
// Victoria Lai 49451704
// Theresa Tran 89363501
// November 2016


import java.io.IOException;
import java.io.PrintWriter;

public class IndexFile implements IndexFileInterface {
	PrintWriter indexOut;
	
	// DEFAULT CONSTRUCTOR //
	public IndexFile(){
		indexOut = null;
	}
	
	// Opens the IndexFile
	// Writes the header to the IndexFile
	public void open(String indexFileName) throws IOException {
		try {
			indexOut = new PrintWriter(indexFileName);
			indexOut.println("TITLE                                             ACCESSION # MEDIA  ADDITIONAL INFORMATION");
			indexOut.println("--------------------------------");
		} catch (IOException e){
			System.out.println(e.toString());
		} 
	}

	// Writes each MusicItem into the IndexFile
	public void writeItem(MusicItem itemToWrite) {
		String title = itemToWrite.getTitle();
		String accessionNum = itemToWrite.getAccessionNumber();
		String media = itemToWrite.getMedia();
		String supplementalInfo = itemToWrite.displaySupplementalInfo();
		indexOut.format("%-50s%-12s%-7s%-25s%n", title, accessionNum, media, supplementalInfo);
	}

	// Closes the IndexFile
	public void close() {
		if (indexOut != null){
			indexOut.close();
		}
		
	}

}
