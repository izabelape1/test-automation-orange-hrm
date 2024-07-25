package helpers;

import com.github.javafaker.Faker;

public class RandomDataGenerator {

    private static Faker faker = new Faker();

    public static String generateUserName() {
        return faker.name().username();
    }

    public static String generatePassword() {
        return faker.internet().password();
    }
}