package uk.ac.belfastmet.constituencies.domain;

import java.util.ArrayList;

public class Members
{

	private ArrayList<Member> allMembers = new ArrayList<Member>();	
	
	public Members()
	{
		
	}
	
	public Members(ArrayList<Member> allMembers)
	{
		this.allMembers = allMembers;
	}

	
	public ArrayList<Member> getAllMembers()
	{
		return allMembers;
	}

	public void setAllMembers(ArrayList<Member> allMembers)
	{
		this.allMembers = allMembers;
	}
	
	
	
}


