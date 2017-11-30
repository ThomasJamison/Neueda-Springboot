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
		
		Building building1 = new Building("New Century Global Center","China", "1,760,000", "LFA1.jpg");
		buildings.add(building1);
		Building building2 = new Building("Dubai International Airport Terminal 3","United Arab Emirates", "1,713,000", "LFA2.jpg");
		buildings.add(building2);
		Building building3 = new Building("Abraj Al-Bait Endowment","Saudi Arabia", "1,575,815", "LFA3.jpg");
		buildings.add(building3);
		Building building4 = new Building("Central World", "Thailand", "1,024,000", "LFA4.jpg");
		buildings.add(building4);
		Building building5 = new Building("Aalsmeer Flower Auction","Netherlands", "990,000", "LFA5.jpg");
		buildings.add(building5);
		Building building6 = new Building("Beijing Capital International Airport Terminal 3", "China", "986,000", "LFA6.jpg");
		buildings.add(building6);
		Building building7 = new Building("The Venetian Macao","Macau", "980,000", "LFA7.jpg");
		buildings.add(building7);
		Building building8 = new Building("Sands Cotai Central","Macau", "890,000", "LFA8.jpg");
		buildings.add(building8);
		Building building9 = new Building("Ciputra World Surabaya","Indonesia", "750,000", "LFA9.jpg");
		buildings.add(building9);
		Building building10 = new Building("Berjaya Times Square","Malaysia", "700,000", "LFA10.jpg");
		buildings.add(building10);
		
		return buildings;
	}
	
	public ArrayList<Building> getLargestFootprint()
	{
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building building1 = new Building("Aalsmeer Flower Auction","Netherlands", "518,000", "LFP1.jpg");
		buildings.add(building1);
		Building building2 = new Building("Tesla Factory","United States", "427,354" , "LFP2.jpg");
		buildings.add(building2);
		Building building3 = new Building("Boeing Everett Factory","United States", "398,000", "LFP3.jpg");
		buildings.add(building3);
		Building building4 = new Building("Michelin Distribution Center", "United States", "371,612", "LFP4.jpg");
		buildings.add(building4);
		Building building5 = new Building("Great Mosque of Mecca","Saudi Arabia", "356,000", "LFP5.jpg");
		buildings.add(building5);
		Building building6 = new Building("Nike - North America Logistics Center", "United States", "260,000", "LFP6.jpg");
		buildings.add(building6);
		Building building7 = new Building("John Deere North American Parts Distribution Center","United States", "246,000" , "LFP7.jpg");
		buildings.add(building7);
		Building building8 = new Building("Mall of Dubai","United Arab Emirates", "500,000" , "LFP8.jpg");
		buildings.add(building8);
		Building building9 = new Building("Mitsubishi Motors North America","United States", "220,000", "LFP9.jpg");
		buildings.add(building9);
		Building building10 = new Building("Indonesia Convention Exhibition","Indonesia", "220,000", "LFP10.jpg");
		buildings.add(building10);
		
		return buildings;
	}
	
	public ArrayList<Building> getLargestUsableVolume()
	{
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building building1 = new Building("Boeing Everett Factory","United States", "13,300,000", "LUV1.jpg");
		buildings.add(building1);
		Building building2 = new Building("Great Mosque of Mecca","Saudi Arabia", "8,000,000" , "LUV2.jpg");
		buildings.add(building2);
		Building building3 = new Building("Jean-Luc Lagardère Plant","France", "5,600,000", "LUV3.jpg");
		buildings.add(building3);
		Building building4 = new Building("Boeing Composite Wing Center", "United States", "3,700,000", "LUV4.jpg");
		buildings.add(building4);
		Building building5 = new Building("Aerium","Germany", "5,200,000" , "LUV5.jpg");
		buildings.add(building5);
		Building building6 = new Building("Meyer Werft Dockhalle 2", "Germany", "4,720,000", "LUV6.jpg");
		buildings.add(building6);
		Building building7 = new Building("NASA Vehicle Assembly Building","United States", "3,660,000" , "LUV7.jpg");
		buildings.add(building7);
		Building building8 = new Building("The O2","United Kingdom", "2,790,000" , "LUV8.jpg");
		buildings.add(building8);
		Building building9 = new Building("Tesco Ireland Distribution Centre","Ireland", "1,550,000", "LUV9.jpg");
		buildings.add(building9);
		Building building10 = new Building("Target Import Warehouse","United States", "1,500,000" , "LUV10.jpg");
		buildings.add(building10);
		
		return buildings;
	}
}
