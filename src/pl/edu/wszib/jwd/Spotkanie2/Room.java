package pl.edu.wszib.jwd.Spotkanie2;

public class Room {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(200,250,100);
        System.out.println(wardrobe);

        wardrobe.depth = 50;
        wardrobe.width = 200;

        System.out.println(wardrobe);
    }
}
