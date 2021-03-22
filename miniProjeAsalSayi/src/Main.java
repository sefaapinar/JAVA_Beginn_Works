public class Main {

    public static void main(String[] args) {
        int number=13;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;
        if(number ==1){
            System.out.println("Sayı Asal Değildir.");
            return;
        }
        if(number <1){
            System.out.println("Geçersiz Sayı, Lütfen tekrar deneyiniz...");
        }

        for (int i =2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Sayi Asaldır");
        }
        else {
            System.out.println("Sayı Asal Değildir");
        }
    }
}
