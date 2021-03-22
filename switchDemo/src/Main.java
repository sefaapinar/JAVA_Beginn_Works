public class Main {

    public static void main(String[] args) {
        char grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel Geçtiiz");
                break;
            case 'C':
                System.out.println("geçtiniz");
                break;
            case 'F':
                System.out.println("KALDIN LAN SALAK!!!");
                break;
            default:
                System.out.println("GEÇERSİZ NOT GİRDİNİZ...");

        }
    }
}
