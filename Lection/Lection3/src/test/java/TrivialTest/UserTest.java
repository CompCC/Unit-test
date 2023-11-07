package TrivialTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void checkUserName(){
        User testUser = new User();
        testUser.setName("John Smith");
        assertEquals("John Smith",testUser.getName());
    }

}
