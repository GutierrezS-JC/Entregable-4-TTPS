package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "group_categories")
public class GroupCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String base64Image;
	
	public GroupCategory() {
	
	}

	public GroupCategory(Integer id, String name, String base64Image) {
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
	
}
