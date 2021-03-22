public class Product {

    public Product(){
        System.out.println("Yapıcı Blok çalıştı");
    }
    //attribute or field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;
        //Getter
    public int getId() {
        return _id;
    }
        //Setter
    public void setId(int id){
       _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        this._renk = _renk;
    }

    public String get_kod() {
        return _kod;
    }

    public void set_kod(String kod) {
        this._kod = _kod;
    }
}







