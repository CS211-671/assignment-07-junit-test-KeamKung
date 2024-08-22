package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList ul1;

    @BeforeEach
    void init(){
        ul1 = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        ul1.addUser("KeamKung","1234");
        ul1.addUser("KeamKRUB","12346");
        ul1.addUser("Keamlol","9271");

        // TODO: find one of them
        User user = ul1.findUserByUsername("KeamKung");
        // TODO: assert that UserList found User
        String expected = "KeamKung";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        ul1.addUser("KeamKung","1234");
        ul1.addUser("KeamKRUB","12346");
        ul1.addUser("Keamlol","9271");

        // TODO: change password of one user
        boolean actual = ul1.changePassword("KeamKung","1234","9271");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        ul1.addUser("KeamKung","1234");
        ul1.addUser("KeamKRUB","12346");
        ul1.addUser("Keamlol","9271");

        // TODO: call login() with correct username and password
        User user = ul1.login("KeamKRUB","12346");
        // TODO: actual assert that User object is found
        assertEquals(ul1.findUserByUsername("KeamKRUB"), user);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        ul1.addUser("KeamKung","1234");
        ul1.addUser("KeamKRUB","12346");
        ul1.addUser("Keamlol","9271");

        // TODO: call login() with incorrect username or incorrect password
        User user = ul1.login("KeamKung","12346");
        // TODO: assert that the method return null
        assertNull(user);
    }
    @Test
    @DisplayName("Add user")
    public void testAddUser() {
        ul1.addUser("Keamzaza","1111");
        assertNotNull(ul1.findUserByUsername("Keamzaza"));
    }
}