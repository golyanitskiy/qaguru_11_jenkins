package tests.qaguru;

import helpers.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OwnerTest {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("owner")
    void ownerTest() {
        String login = config.login();
        String password = config.password();

        System.out.println(login);
        System.out.println(password);
    }
}
