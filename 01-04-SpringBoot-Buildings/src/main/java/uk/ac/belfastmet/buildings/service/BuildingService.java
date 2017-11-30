package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.Building;

@Service
public class BuildingService
{

	public ArrayList<Building> getLargestFloorArea()
	{
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building building1 = new Building("New Century Global Center","China", "Chengdu", "1,760,000", "LFA1.jpg");
		buildings.add(building1);
		Building building2 = new Building("Dubai International Airport Terminal 3","United Arab Emirates", "Dubai", "1,713,000", "LFA2.jpg");
		buildings.add(building2);
		Building building3 = new Building("Abraj Al-Bait Endowment","Saudi Arabia", "Mecca", "1,575,815", "LFA3.jpg");
		buildings.add(building3);
		Building building4 = new Building("Central World", "Thailand", "Bangkok", "1,024,000", "LFA4.jpg");
		buildings.add(building4);
		Building building5 = new Building("Aalsmeer Flower Auction","Netherlands", "Aalsmeer", "990,000", "LFA5.jpg");
		buildings.add(building5);
		Building building6 = new Building("Beijing Capital International Airport Terminal 3", "China", "Beijing", "986,000", "LFA6.jpg");
		buildings.add(building6);
		Building building7 = new Building("The Venetian Macao","Macau", "Macau", "980,000", "LFA7.jpg");
		buildings.add(building7);
		Building building8 = new Building("Sands Cotai Central","Macau", "Macau", "890,000", "LFA8.jpg");
		buildings.add(building8);
		Building building9 = new Building("Ciputra World Surabaya","Indonesia", "Surabaya", "750,000", "LFA9.jpg");
		buildings.add(building9);
		Building building10 = new Building("Berjaya Times Square","Malaysia", "Kuala Lumpur", "700,000", "LFA10.jpg");
		buildings.add(building10);
		
		return buildings;
	}
	
	public ArrayList<Building> getLargestFootprint()
	{
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building building1 = new Building("Aalsmeer Flower Auction","Netherlands", "Aalsmeer", "518,000", "LFP1.jpg");
		buildings.add(building1);
		Building building2 = new Building("Tesla Factory","United States", "California", "427,354" , "LFP2.jpg");
		buildings.add(building2);
		Building building3 = new Building("Boeing Everett Factory","United States", "Everett", "398,000", "LFP3.jpg");
		buildings.add(building3);
		Building building4 = new Building("Michelin Distribution Center", "United States", "Spartanburg", "371,612", "LFP4.jpg");
		buildings.add(building4);
		Building building5 = new Building("Great Mosque of Mecca","Saudi Arabia", "Hijaz", "356,000", "LFP5.jpg");
		buildings.add(building5);
		Building building6 = new Building("Nike - North America Logistics Center", "United States", "Memphis", "260,000", "LFP6.jpg");
		buildings.add(building6);
		Building building7 = new Building("John Deere North American Parts Distribution Center","United States", "Illinois", "246,000" , "LFP7.jpg");
		buildings.add(building7);
		Building building8 = new Building("Mall of Dubai","United Arab Emirates", "Dubai", "500,000" , "LFP8.jpg");
		buildings.add(building8);
		Building building9 = new Building("Mitsubishi Motors North America","United States", "Illinois", "220,000", "LFP9.jpg");
		buildings.add(building9);
		Building building10 = new Building("Indonesia Convention Exhibition","Indonesia", "Bumi Serpong Damai", "220,000", "LFP10.jpg");
		buildings.add(building10);
		
		return buildings;
	}
	
	public ArrayList<Building> getLargestUsableVolume()
	{
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building building1 = new Building("Boeing Everett Factory","United States", "Everett", "13,300,000", "LUV1.jpg");
		buildings.add(building1);
		Building building2 = new Building("Great Mosque of Mecca","Saudi Arabia", "Hijaz", "8,000,000" , "LUV2.jpg");
		buildings.add(building2);
		Building building3 = new Building("Jean-Luc Lagardère Plant","France", "Toulouse", "5,600,000", "LUV3.jpg");
		buildings.add(building3);
		Building building4 = new Building("Boeing Composite Wing Center", "United States", "Everett", "3,700,000", "LUV4.jpg");
		buildings.add(building4);
		Building building5 = new Building("Aerium","Germany", "Brandenburg", "5,200,000" , "LUV5.jpg");
		buildings.add(building5);
		Building building6 = new Building("Meyer Werft Dockhalle 2", "Germany", "Papenburg", "4,720,000", "LUV6.jpg");
		buildings.add(building6);
		Building building7 = new Building("NASA Vehicle Assembly Building","United States", "Brevard County", "3,660,000" , "LUV7.jpg");
		buildings.add(building7);
		Building building8 = new Building("The O2","United Kingdom", "London", "2,790,000" , "LUV8.jpg");
		buildings.add(building8);
		Building building9 = new Building("Tesco Ireland Distribution Centre","Ireland", "Donabate", "1,550,000", "LUV9.jpg");
		buildings.add(building9);
		Building building10 = new Building("Target Import Warehouse","United States", "Savannah", "1,500,000" , "LUV10.jpg");
		buildings.add(building10);
		
		return buildings;
	}
}
