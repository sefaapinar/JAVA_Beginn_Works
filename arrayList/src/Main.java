public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Sefa";
        String ogrenci2 = "İrem";
        String ogrenci3 = "Emircan";
        String ogrenci4 = "Gül";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("************");


        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Sefa";
        ogrenciler[1] = "İrem";
        ogrenciler[2] = "Emircan";
        ogrenciler[4] = "SALİH";

        for (int i = 0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[1]);
        }
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);

        }

    }
}
