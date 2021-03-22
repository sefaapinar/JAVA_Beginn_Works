import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String>sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("apple","elma");
        sozluk.size();
        //System.out.println(sozluk.get("book"));


        for (String item : sozluk.keySet()){
            System.out.println(item);
        }


    }
}
