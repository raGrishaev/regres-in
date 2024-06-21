package tests;

import helpers.UserHelper;
import org.junit.jupiter.api.Test;
import utils.TestBase;

public class CreateUserTest extends TestBase {
    UserHelper userHelper = new UserHelper();

    @Test
    public void createUserTest(){
        userHelper.createUser("test", "123456Qwerty");
    }
}
