/**
 * Created by Mihnea on 18.03.2017.
 */
public class exercitiul1 {
    public static void main(String[] args) {
        int numar;
        numar = SkeletonJava.readIntGUI("Introduceti un numar: ");
        if(numar >= 0) {
            // aici voi calcula si afisa patratul sau
            int patrat = numar*numar;
            SkeletonJava.printGUI("Numarul este: " + patrat);
        }
        else {
            //aici voi afisa numarul asa cum l-am citit
            SkeletonJava.printGUI(numar);
        }
    }
}
