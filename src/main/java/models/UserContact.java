package models;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "user_contact")
public class UserContact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contact_id")
    private User contact;
    
    @Column
    private LocalDate contactSince;

    
	public UserContact() {
		
	}

	public UserContact(Integer id, User user, User contact, LocalDate contactSince) {
		super();
		this.id = id;
		this.user = user;
		this.contact = contact;
		this.contactSince = contactSince;
	}

	public Integer getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public User getContact() {
		return contact;
	}

	public LocalDate getContactSince() {
		return contactSince;
	}
    
    
}
