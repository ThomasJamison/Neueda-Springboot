package uk.ac.belfastmet.songs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.songs.domain.SongAlbum;

@Service
public class SongService
{

	public ArrayList<SongAlbum> getSongs()
	{
		ArrayList<SongAlbum> songs = new ArrayList<SongAlbum>();
		
		SongAlbum song1 = new SongAlbum(1, "Havana", "Camila Cabello FT Young Thug", 1, 16);
		songs.add(song1);
		SongAlbum song2 = new SongAlbum(2, "Anywhere", "Rita Ora", 2, 5);
		songs.add(song2);
		SongAlbum song3 = new SongAlbum(3, "Silence", "Marshmello FT Khalid", 3, 15);
		songs.add(song3);
		SongAlbum song4 = new SongAlbum(4, "Perfect", "Ed Sheeran", 4, 28);
		songs.add(song4);
		SongAlbum song5 = new SongAlbum(5, "Too Good At Goodbyes", "Sam Smith", 1, 11);
		songs.add(song5);
		SongAlbum song6 = new SongAlbum(6, "Man's Not Hot", "Big Shaq", 6, 9);
		songs.add(song6);
		SongAlbum song7 = new SongAlbum(7, "Blinded By Your Grace - Part 2", "Stormzy FT Mnek", 7, 7);
		songs.add(song7);
		SongAlbum song8 = new SongAlbum(8, "Rockstar", "Post Malone FT 21 Savage", 1, 10);
		songs.add(song8);
		SongAlbum song9 = new SongAlbum(9, "Wolves", "Selena Gomez & Marshmello", 9, 4);
		songs.add(song9);
		SongAlbum song10 = new SongAlbum(10, "Dusk Till Dawn", "Zayn FT Sia", 5, 11);
		songs.add(song10);
		return songs;
	}

	public ArrayList<SongAlbum> getAlbums()
	{
		ArrayList<SongAlbum> albums = new ArrayList<SongAlbum>();
		SongAlbum album1 = new SongAlbum(1, "The Architect", "Paloma Faith", 0, 0);
		albums.add(album1);
		SongAlbum album2 = new SongAlbum(2, "", "", 0, 0);
		albums.add(album2);
		SongAlbum album3 = new SongAlbum(3, "", "", 0, 0);
		albums.add(album3);
		SongAlbum album4 = new SongAlbum(4, "", "", 0, 0);
		albums.add(album4);
		SongAlbum album5 = new SongAlbum(5, "", "", 0, 0);
		albums.add(album5);
		SongAlbum album6 = new SongAlbum(6, "", "", 0, 0);
		albums.add(album6);
		SongAlbum album7 = new SongAlbum(7, "", "", 0, 0);
		albums.add(album7);
		SongAlbum album8 = new SongAlbum(8, "", "", 0, 0);
		albums.add(album8);
		SongAlbum album9 = new SongAlbum(9, "", "", 0, 0);
		albums.add(album9);
		SongAlbum album10 = new SongAlbum(10, "", "", 0, 0);
		albums.add(album10);
		return albums;	
	}
}
