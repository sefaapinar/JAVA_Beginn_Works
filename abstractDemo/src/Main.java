public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDataBaseManager();
        customerManager.databaseManager = new SqlServerDatabaseManager();

        customerManager.getCustomers();
    }
}
