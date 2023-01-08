package pl.edu.wszib.jwd.Spotkanie2;

public class FamilyMemberTester {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.surname = "Kowalski";
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname);
        dad.name = "Karol";
        dad.age = 34;
        FamilyMember mom = new FamilyMember();
        mom.name = "Dorota";
        mom.age = 30;

    }
}
