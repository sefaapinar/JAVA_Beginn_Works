import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();

		sayilar.add(1);
		sayilar.add("Sivas");
		sayilar.add(10);
		//System.out.println(sayilar.size());

		//sayilar.set(0,100);
		//System.out.println(sayilar.get(1));
		//sayilar.remove(1);
		//sayilar.clear();
		//System.out.println(sayilar.get(2));

		for (Object i:sayilar){
			System.out.println(i);
		}
    }
}
