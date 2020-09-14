package LabJUNIT5;

public class PetCat {




    public String name;
    public int age;
    public String raceName;
    public boolean isHappy = false;







    public void playWithPet(){
        setHappy(true);
    }


    public void growOneYear(){
        this.age +=1;
    }






    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public PetCat(String name, int age, String raceName) {
        this.name = name;
        this.age = age;
        this.raceName = raceName;
    }

    public PetCat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }
}
