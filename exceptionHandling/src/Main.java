public class Main {

    public static void main(String[] args) {
	   try{
           int[] sayilar = new int[]{1,2,3};
           System.out.println(sayilar[7]);
       } catch (Exception exception) {
           System.out.println("Hata oluştu");
       }finally {
	       System.out.println("Her türlü çalışır.");
       }
    }
}
