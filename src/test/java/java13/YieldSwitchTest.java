package java13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YieldSwitchTest {

    @Test
    void executeOperation() {
        int result = YieldSwitch.executeOperation("double", 2);

        assertEquals(result, 4);
    }

}