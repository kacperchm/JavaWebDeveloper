package pl.edu.wszib.jwd.Spotkanie2;

public class Matrix {
    public static void main(String[] args) {
        int n= 29;
        if(n>=1 && n<=30)
            System.out.println("n = " + n);
            System.out.println("-----------------");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < i+n ; j++) {
                System.out.printf("%3s",j + " ");
            }
            System.out.println();
        }
    }
}
