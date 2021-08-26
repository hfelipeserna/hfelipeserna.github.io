import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void isTheAnimalHeavy() {
        Animal horse = new Animal("Horse", "Big", 3000);
        Animal dog = new Animal("Dog", "Medium", 20);

        boolean isHeavy1 = horse.isHeavy();
        boolean isHeavy2 = dog.isHeavy();

        Assertions.assertEquals(true, horse.isHeavy());
        Assertions.assertFalse(isHeavy2);
    }
}
