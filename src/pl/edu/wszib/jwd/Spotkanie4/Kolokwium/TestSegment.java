// Stwórz klasę reprezentującą odcienk o nazwie Segment. Klasa powinna przechowywać informacje o punkcie początkowym
// odcinka - startPoint, oraz punkcie końcowym odcinka - endPoint. Do zdefiniowania punktów skorzystaj ze znanej
// klasy Point z pakietu java.awt. Klasa powinna dostarczać konstruktor, którego parametrami są 4 liczby
// całkowite: x1, y1, x2, y2, gdzie x1 i y1 określają współrzędne punktu początkowego a x2 i y2 współrzędne
// punktu końcowego odcinka. Stwórz dwie instancje klasy Segment i jednym wyrażeniem sprawdź czy porównywane
// obiekty to ten sam odcinek (wymagane przesłonięcie odpowiedniej metody).

package pl.edu.wszib.jwd.Spotkanie4.Kolokwium;

public class TestSegment {
    public static void main(String[] args) {
        Segment segment1 = new Segment(1,2,3,4);
        Segment segment2 = new Segment(1,2,3,4);

        if(segment1.equals(segment2)) {
            System.out.println("To ten sam odcinek.");
        }else {
            System.out.println("To różne odcinki.");
        }
    }
}
