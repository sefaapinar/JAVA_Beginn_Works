import javax.net.ssl.SSLContext;

public class Main {

    public static void main(String[] args) {
	int sayi = 10;
	if (sayi<20)
	{
	    System.out.println("Sayı 20'den küçüktür");
    }
	else if (sayi == 20){
		System.out.println("Sayi 20'ye eşittir.");
	}
	else{
		System.out.println("Sayı 20'den büyüktür.");
	}
    }
}
