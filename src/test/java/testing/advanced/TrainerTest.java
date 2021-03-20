package testing.advanced;

import advanced_coding.classroom.resources.Trainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class TrainerTest {
    @Test
    void verifyIsAuthorizedReturnsTrue() {
        Trainer trainer = new Trainer(null, null, null, true);
        Assertions.assertTrue(trainer.getIsAuthorized());
    }
}
