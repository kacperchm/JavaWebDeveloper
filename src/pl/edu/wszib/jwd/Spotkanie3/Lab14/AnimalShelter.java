package pl.edu.wszib.jwd.Spotkanie3.Lab14;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Random random = new Random();
        Animal[] animals = new Animal[100];

        for (int i = 0; i<animals.length; i++) {
            int typeOfAnimal = random.nextInt(3);
            switch (typeOfAnimal) {
                case 0:
                {
                    animals[i] = new Dog();
                } break;
                case 1:
                {
                    animals[i] = new Cat();
                } break;
                case 2:
                {
                    animals[i] = new Sheep();
                } break;
            }
//            System.out.println("Kojec nr " + (i+1) + " zwierzę umieszczone w kojcu to " + animals[i].getType());
        }

        System.out.println("Typ zwięrzęcia w kojcu 33 to: " + animals[32].getType());
        System.out.println("Ilość zwierząt tego samego typu co zwierzę w kojcu 33: " + animals[32].getInstanceNumber());

    }
}
