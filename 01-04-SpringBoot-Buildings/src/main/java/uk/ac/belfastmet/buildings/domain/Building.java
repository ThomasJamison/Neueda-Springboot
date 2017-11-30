package uk.ac.belfastmet.buildings.domain;

public class Building
{

	private String name;
	private String country;
	private String place;
	private String size;
	private String image;
	
	public Building (String name, String country, String place, String size, String image)
	{
		this.name = name;
		this.country = country;
		this.place = place;
		this.size = size;
		this.image = image;
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String getPlace()
	{
		return place;
	}

	public void setPlace(String place)
	{
		this.place = place;
	}

	public String getSize()
	{
		return size;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

}
