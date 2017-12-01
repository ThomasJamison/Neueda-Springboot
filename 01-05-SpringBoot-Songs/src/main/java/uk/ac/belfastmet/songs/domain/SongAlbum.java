package uk.ac.belfastmet.songs.domain;

public class SongAlbum
{

	private int position;
	private String title;
	private String artist;
	private int peakPosition;
	private int weeksOnChart;
	
	public SongAlbum(int position, String title, String artist, int peakPosition, int weeksOnChart)
	{
		this.position = position;
		this.title = title;
		this.artist = artist;
		this.peakPosition = peakPosition;
		this.weeksOnChart = weeksOnChart;
	}

	//getters and setters
	public int getPosition()
	{
		return position;
	}

	public void setPosition(int position)
	{
		this.position = position;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public int getPeakPosition()
	{
		return peakPosition;
	}

	public void setPeakPosition(int peakPosition)
	{
		this.peakPosition = peakPosition;
	}

	public int getWeeksOnChart()
	{
		return weeksOnChart;
	}

	public void setWeeksOnChart(int weeksOnChart)
	{
		this.weeksOnChart = weeksOnChart;
	}
	
}
