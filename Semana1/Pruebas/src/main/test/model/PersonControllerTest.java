package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonControllerTest {
    private PersonController controller;

    private void setups1(){
        controller = new PersonController();
    }

    private void setUp2(){
        controller = new PersonController();
        controller.addPerson("Name0", 10, "A0", 60);
        controller.addPerson("Name1", 10, "A0", 60);
        controller.addPerson("Name2", 10, "A0", 60);
        controller.addPerson("Name3", 10, "A0", 60);
        controller.addPerson("Name4", 10, "A0", 60);
        controller.addPerson("Name5", 10, "A0", 60);
        controller.addPerson("Name6", 10, "A0", 60);
        controller.addPerson("Name7", 10, "A0", 60);
        controller.addPerson("Name8", 10, "A0", 60);
        controller.addPerson("Name9", 10, "A0", 60);
    }




    @Test
    public void testAddPerson(){
        // init
        setups1(); // la lista esta vacia

        // act
        controller.addPerson("NameA", 10, "A0", 60.7);

        // Assert
        //assertFalse(controller.getPeople().isEmpty());
        assertTrue( !controller.getPeople().isEmpty() );
    }

    @Test
    public void testAddPerson2(){
        // init
        setups1();

        // act
        String name = "NameA";
        int age = 10;
        String cc = "A0";
        double weight = 60.7;
        controller.addPerson(name, age, cc, weight);

        // assert
        assertEquals(name, controller.getPeople().get(0).getName());
        assertEquals(age, controller.getPeople().get(0).getAge());
        assertEquals(cc, controller.getPeople().get(0).getCc());
        assertEquals(weight, controller.getPeople().get(0).getWeight(), 0.3);
        //assertEquals(weight, 60.5, 0.3);
    }
}
