package pl.edu.wszib.jwd.Spotkanie4.lab15;

public class Farm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal();
        animals[1] = new Dog("Burek");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Pig("Peppa");
        animals[4] = new Cat("Filemon");
        for (Animal animal: animals) {
            animal.introduce();
        }
    }
}
