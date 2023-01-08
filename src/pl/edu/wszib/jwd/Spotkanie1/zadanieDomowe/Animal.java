public class Animal {
    String name;
    String color;
    int weight;

    public Animal(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
}

interface Voice {
    public void speak();
}

class Dog extends Animal implements Voice {

    public Dog(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Cat extends Animal implements Voice {

    public Cat(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void speak() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

    class Test {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Burek", "Black", 13);
            Cat cat1 = new Cat("Łatka", "Gray", 3);

            dog1.speak();
            cat1.speak();

            System.out.println(dog1.toString());
            System.out.println(cat1.toString());
        }
    }