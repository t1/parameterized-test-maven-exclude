package testpackage;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static testpackage.SomeTest.Mode.three;

public class SomeTest {
    @SuppressWarnings("unused")
    enum Mode {one, two, three}

    @EnumSource(Mode.class)
    @ParameterizedTest void shouldRunWithMode(Mode mode) {
        assertNotEquals(three, mode);
    }
}
