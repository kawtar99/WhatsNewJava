package java15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SealedClassExampleTest {

    @Test
    public void testSealedClasses(){
        SealedClassExample s1 = new SubClass1();

        int id = 0;
        if (s1 instanceof SubClass1){
            id = ((SubClass1)s1).getId();
        }
        if (s1 instanceof SubClass2){
            id = ((SubClass2)s1).getId();
        }

        assertEquals(id, 1);

    }

}