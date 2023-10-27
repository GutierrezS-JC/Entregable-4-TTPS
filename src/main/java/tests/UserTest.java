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
		User user = new User("manaos@gmail.com", "manaos", "12password21", "Juan Cruz", "Gutierrez", "photo.png");
        userDAO.persist(user);
        
        User searchedUser = userDAO.getBy("manaos", "username");
        Assertions.assertEquals("manaos", searchedUser.getUsername());
	}
	
	@Test
	public void userDeletionTest() {
		User user = new User("matokuun@gmail.com", "matokuun", "12password21", "Matias", "Adorno", "photo.png");
        userDAO.persist(user);
        
        User searchedUser = userDAO.getBy("matokuun@gmail.com", "email");
        Assertions.assertEquals("matokuun@gmail.com", searchedUser.getEmail());
        
        userDAO.delete(user);
        searchedUser = userDAO.getBy("matokuun@gmail.com", "email");
        Assertions.assertEquals(searchedUser, null);
	}
}
