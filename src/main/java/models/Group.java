package models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupos")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private Double totalBalance;
	
	@ManyToOne
    @JoinColumn(name="owner_user_id", nullable=false)
    private User owner;
	
	// Usuarios que conforman el grupo
	@ManyToMany(mappedBy = "groups")
	private Set<User> users;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private GroupCategory groupCategory;
	
	@OneToMany(mappedBy = "group")
	private Set<Spending> spendings;
	
	@OneToMany(mappedBy = "group")
	private Set<Payment> payments;
	
	public Group() {
		
	}

	public Group(Integer id, String name, Double totalBalance, User owner, GroupCategory groupCategory) {
		super();
		this.id = id;
		this.name = name;
		this.totalBalance = totalBalance;
		this.owner = owner;
		this.users = new HashSet<>();
		this.groupCategory = groupCategory;
		this.spendings = new HashSet<>();
		this.payments = new HashSet<>();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getTotalBalance() {
		return totalBalance;
	}

	public User getOwner() {
		return owner;
	}

	public Set<User> getUsers() {
		return users;
	}

	public GroupCategory getGroupCategory() {
		return groupCategory;
	}

	public Set<Spending> getSpendings() {
		return spendings;
	}

	public Set<Payment> getPayments() {
		return payments;
	}
	
}
