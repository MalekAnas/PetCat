package LabJUNIT5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetCatTest {





    @Test
    public void getDefaultClass() throws Exception{
        PetCat petCat = new PetCat("Muffin", 6, "Somali");

        assertEquals("Muffin", petCat.getName());
        assertEquals(6, petCat.getAge());
        assertEquals ("Somali", petCat.getRaceName());
        assertFalse(petCat.isHappy());
    }


    @Test
    public void getName() throws  Exception{

        PetCat petCat = new PetCat("TOR");
        assertEquals("TOR", petCat.getName() );
    }


    @Test
    public void initialHappiness() throws Exception{
        PetCat petCat = new PetCat("Darwin", 3, "Shiraz");

        assertFalse( petCat.isHappy());
    }


    @Test
    public void isHappyAfterPetting() throws  Exception{
        PetCat petCat = new PetCat("Darwin", 3, "Shiraz");

        petCat.playWithPet();
        assertTrue( petCat.isHappy());
    }



    @Test
    public void assertThatGrwo1Year() throws Exception{

         PetCat pudding = new PetCat("Pudding", 4, "Somali");
        PetCat muffin = new PetCat("muffin", 6, "Somali");

        assertNotSame(pudding, muffin);
    }



    @Test
    public void checkIfNameIsReversable(){
        PetCat lol = new PetCat("Lol", 4, "Somali");

        assertTrue(lol.getReversedName(lol.getName().toCharArray()).equalsIgnoreCase(lol.getName()));


    }
}