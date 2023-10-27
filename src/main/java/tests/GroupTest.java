package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classesDAO.FactoryDAO;
import classesDAO.GroupDAO;
import classesDAO.UserDAO;
import models.Group;
import models.GroupCategory;
import models.User;

public class GroupTest {
	private User user;
	private GroupDAO groupDAO;
	private UserDAO userDAO;
	
	@BeforeEach
    void setUp() throws Exception {
        user = new User();
        
        groupDAO = FactoryDAO.getGroupDAO();
        userDAO = FactoryDAO.getUserDAO();
	}
	
	@Test
	public void groupCreationTest() {
		User user = new User("manaos@gmail.com", "manaos", "12password21", "Juan Cruz", "Gutierrez", "photo.png");
        
		Group group = new Group(0, "ManaosGroup", 5000.0, user, new GroupCategory(0,"Viaje"));
		
		groupDAO.persist(group);
//		userDAO.persist(user);
        
        Assertions.assertEquals("manaos", user.getUsername());
	}
}
