package uk.ac.belfastmet.rhi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Beneficiary
{
	@Id
	@GeneratedValue
	private Integer beneficiaryId;
	private String name;
	private String applicationDate;
	private String installLocation;
	private String technology;
	private int capacity;
	private int payments;
	
	public Beneficiary()
	{
		
	}
	
	public Beneficiary(Integer beneficiaryId, String name, String applicationDate,
			   String installLocation, String technology, int capacity, int payments)
	{
			this.beneficiaryId = beneficiaryId;
			this.name = name;
			this.applicationDate = applicationDate;
			this.installLocation = installLocation;
			this.technology = technology;
			this.capacity = capacity;
			this.payments = payments;
	}

	public Integer getBeneficiaryId()
	{
		return beneficiaryId;
	}

	public void setBeneficiaryId(Integer beneficiaryId)
	{
		this.beneficiaryId = beneficiaryId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getApplicationDate()
	{
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate)
	{
		this.applicationDate = applicationDate;
	}

	public String getInstallLocation()
	{
		return installLocation;
	}

	public void setInstallLocation(String installLocation)
	{
		this.installLocation = installLocation;
	}

	public String getTechnology()
	{
		return technology;
	}

	public void setTechnology(String technology)
	{
		this.technology = technology;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	public int getPayments()
	{
		return payments;
	}

	public void setPayments(int payments)
	{
		this.payments = payments;
	}
	

}
