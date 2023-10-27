package models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class SpendingCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String base64Image;

	@OneToMany(mappedBy="spending_category")
	private Set<Spending> spendings;
	
	public SpendingCategory() {
		
	}
	
	public SpendingCategory(Integer id, String name, String base64Image) {
		super();
		this.id = id;
		this.name = name;
		this.base64Image = base64Image;
	}
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBase64Image() {
		return base64Image;
	}

	public Set<Spending> getSpendings() {
		return spendings;
	}
	
	
}
