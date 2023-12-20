package com.fdmgroup.mockitoDemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TestUserManager {
	
	@Mock
	User user1, user2;
	
	@Mock
	UserDatabaseAccess mockUserDatabaseAccess;
	
	UserManager userManager;
	
	@BeforeEach
	void setUp() throws Exception {
	userManager = new UserManager(mockUserDatabaseAccess);
	
	Mockito.lenient().when(mockUserDatabaseAccess.getUser("userone")).thenReturn(user1);
	Mockito.lenient().when(mockUserDatabaseAccess.getUser("usertwo")).thenReturn(user2);

	Mockito.lenient().when(user1.getUsername()).thenReturn("userone");
	Mockito.lenient().when(user2.getUsername()).thenReturn("usertwo");
	Mockito.lenient().when(user1.getPassword()).thenReturn("password1");
	Mockito.lenient().when(user2.getPassword()).thenReturn("password2");

	}

	@Test
	void test_authenticate_callsGetUserwith_argUserOne_whenUserOnepassedIn() {
		boolean authenticated = userManager.authenticate("userone", "password1");
		verify(mockUserDatabaseAccess).getUser("userone");
	}
	
	

	@Test
	void test_authenticate_isTrue_whenUserOneandPassword1PassedIn() {
		boolean auth = userManager.authenticate("userone", "password1");
		assertTrue(auth);
	}
	
	
	@Test
	void test_authenticate_isFalse_whenUserOneandPassword2PassedIn() {
		boolean auth = userManager.authenticate("userone", "password2");
		assertFalse(auth);
	}
	
	@Test
	void test_authenticate_isTrue_whenUserTwoandPassword2PassedIn() {
		boolean auth = userManager.authenticate("usertwo", "password2");
		assertTrue(auth);
	}
	
	@Test
	void test_authenticate_isFalse_whenUserTwoandPassword1PassedIn() {
		boolean auth = userManager.authenticate("usertwo", "password1");
		assertFalse(auth);
	}

}
