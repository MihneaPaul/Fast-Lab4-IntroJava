/**
 * Created by Mihnea on 18.03.2017.
 */
public class exercitiul2 {
    public static void main(String[] args) {



    int numar;
    numar =SkeletonJava.readIntGUI("Introduceti un numar: ");

    for (int i=0; i<=10; i++) {
        System.out.println(i+"X"+numar+"="+i*numar);
    }

    }
}