public class Main {

    public static void main(String[] args) throws Exception {
	    AccountManager manager = new AccountManager();
	    System.out.println("Hesap : " + manager.getBalance());
	    manager.deposit(3000);
        System.out.println("Hesap : " + manager.getBalance());
        manager.withdraw(1500);
        try{
            manager.withdraw(90);
        }catch (Exception exception){
            exception.getMessage();
        }
        System.out.println("Hesap = " + manager.getBalance());

        try{
            manager.withdraw(10000);
        }catch (Exception exception){
            exception.getMessage();
        }
        System.out.println("Hesap = " + manager.getBalance());
        System.out.println("Hesap : " + manager.getBalance());


    }
}
