package models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String description;
	
	@Column
	private LocalDate date;
	
	@Column
	private Double totalSpent;
	
	@Column
	private Double total;
	
	@Column
	private Double balance;
	
	@Column
	private boolean paid;
	
	@ManyToOne
	@JoinColumn(name = "group_id", nullable = true)
	private Group group;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = true)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "owner_user_id", nullable = false)
	private User owner;

	public Payment() {
	
	}
	
	public Payment(Integer id, String description, LocalDate date, Double totalSpent, Double total, Double balance,
			boolean paid, User owner) {
		super();
		this.id = id;
		this.description = description;
		this.date = date;
		this.totalSpent = totalSpent;
		this.total = total;
		this.balance = balance;
		this.paid = paid;
		this.owner = owner;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotalSpent() {
		return totalSpent;
	}

	public Double getTotal() {
		return total;
	}

	public Double getBalance() {
		return balance;
	}

	public boolean isPaid() {
		return paid;
	}

	public Group getGroup() {
		return group;
	}

	public User getUser() {
		return user;
	}

	public User getOwner() {
		return owner;
	}
	
}
