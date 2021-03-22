public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.set_name("masa");
        product.set_price(4500);
        product.set_description("Asus laptop");
        product.set_stockAmount(2);
        product.setId(1);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());

    }
}
