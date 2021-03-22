public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price=10;
        product.name="Mouse";
        product.id=1;
        manager.add(product);

        DatabaseHelper.Crud.Delete();
    }
}
