package uk.ac.belfastmet.buildings.domain;

public class Building
{

	private String name;
	private String country;
	private String place;
	
	public Building (String name, String country, String place)
	{
		this.setName(name);
		this.setCountry(country);
		this.setPlace(place);
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

}
