import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String > sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Sivas");
        sehirler.add("Kars");
        sehirler.add("Aydın");


        sehirler.remove("Ankara");
        Collections.sort(sehirler);

        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
