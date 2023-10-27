package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classesDAO.FactoryDAO;
import classesDAO.UserDAO;
import classesDAOImpl.GenericDAOHibernateJPA;
import models.User;

public class UserTest {
	
	private User user;
	private User user2;
	private UserDAO userDAO;
	
	@BeforeEach
    void setUp() throws Exception {
        user = new User();
        user2 = new User();
        
        userDAO = FactoryDAO.getUserDAO();
	}
	
	@Test
	public void userCreationTest() {
		User user = new User(0, "manaos@gmail.com", "manaos", "12password21", "Juan Cruz", "Gutierrez", "photo.png");
        userDAO.persist(user);
        
        Assertions.assertEquals("manaos", user.getUsername());
	}
}
