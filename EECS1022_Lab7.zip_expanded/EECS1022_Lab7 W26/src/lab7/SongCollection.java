package lab7;

// You are NOT allowed to add any "import" statement other than 
// the ones already in the starter files. 
import java.util.*;

///////////////////////////////////////////////////////////////////////////
//Full Name : Anthony Tu
//Yorku Email : ant2@my.yorku.ca
//Date : 29/03/26
//Authenticity Declaration:
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider. This submitted
//piece of work is entirely of my own creation.
///////////////////////////////////////////////////////////////////////////

public class SongCollection {
	
	
	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * NOTE:
	 * 1. No System.out.println statements should be present.
	 * 	  Instead, you need to return the results in your methods.
	 * 2. No Scanner operations either (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of the methods.   
	 */
	
	private String colName = "";
	private List<Song> songList = new ArrayList<>();
	
	public SongCollection(String name) {
		this.colName = name;
	}
	
	public SongCollection(SongCollection other) {
		this.colName = other.colName;
		this.songList = new ArrayList<>(other.songList);
	}
	
	public void setListName(String name) {
		this.colName = name;
	}
	
	public void addSongs(List<Song> songs) {
		for(Song s: songs) {
			songList.add(s);
		}
	}
	
	public void removeSong (Song s) {
		if(this.songList.contains(s)) {
			this.songList.remove(songList.indexOf(s));
		}
	}
	
	public List<Song> getSongsforArtist(String artist){	
		List<Song> songs = new ArrayList<>();
		for (Song s: this.songList) {
			if (s.getSongArtist().equals(artist)) {
				songs.add(s);
			}
		}
		
		return songs;
	}
	
	public String getListName() {
		return this.colName;
	}
	public List<Song> getListofSongs(){
		return this.songList;
	}
	public boolean inSongCollection(String artist) {
		for (Song s: this.songList) {
			if (s.getSongArtist().equals(artist)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean contains(Song s) {
		if(this.songList.contains(s)) {
			return true;
		}
		
		return false;
	}
	public String totalListeningTime() {
        int totalLength = 0;
        for(Song song : this.songList) {
            totalLength+=song.getSongLength();
        }
        return String.format("Total Listening Time: %d:%02d:%02d", totalLength/3600, totalLength%3600/60, totalLength%60);
    }

}
//////////////////////////////////////////
/**
 * The class defines a simple structure called Song,
 * capable of storing the following information about a single song:
 * <p> artist</p>
 * <p> title</p>
 * <p> album</p>
 * <p>price</p>
 * <p>release year</p>
 * <p>length of the song in seconds </p>
 * 
 *
 */
class Song {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String songArtist;
	private String songTitle;
	private String songAlbum;
	private double songPrice;
	private int songYear;
	private int songLength; // Length in seconds

	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public Song(String songTitle, String songArtist, String songAlbum,
			int songYear, int songLength, double songPrice) {

		this.songArtist = songArtist;
		this.songTitle = songTitle;
		this.songAlbum = songAlbum;
		this.songPrice = songPrice; 
		this.songYear = songYear;
		this.songLength = songLength; // length in seconds
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public String getSongArtist() {
		return songArtist;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public String getSongTitle() {
		return songTitle;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public String getSongAlbum() {
		return songAlbum;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongAlbum(String songAlbum) {
		this.songAlbum = songAlbum;
	}

	public double getSongPrice() {
		return songPrice;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongPrice(double songPrice) {
		this.songPrice = songPrice;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public int getSongYear() {
		return songYear;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongYear(int songYear) {
		this.songYear = songYear;
	}

	public int getSongLength() {
		return songLength;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	public void setSongLength(int songLength) {
		this.songLength = songLength;
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	@Override
	public String toString() {
		return String.format("Song|%-20s|%-15s|%-20s|%6s|%d:%02d|%6.2f", this.songTitle, this.songArtist,
				this.songAlbum, this.songYear > 0 ? String.format("%d", this.songYear) : "", this.songLength / 60,
				this.songLength % 60, this.songPrice);
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	@Override
	public int hashCode() {
		return Objects.hash(songAlbum, songArtist, songLength, songPrice, songTitle, songYear);
	}
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(songAlbum, other.songAlbum) && Objects.equals(songArtist, other.songArtist)
				&& songLength == other.songLength
				&& Double.doubleToLongBits(songPrice) == Double.doubleToLongBits(other.songPrice)
				&& Objects.equals(songTitle, other.songTitle) && songYear == other.songYear;
	}
	
}

