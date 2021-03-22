import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    readFile();
    writeFile();
    }
    public  static void CreateFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya Oluşturuldu...");
            }else{
                System.out.println("Dosya zaten sistemde var.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı = " + file.getName()); //Dosya adını verir.
            System.out.println("Dosya yolu = " + file.getAbsolutePath()); //Dosya yolunu verir.
            System.out.println("Dosya okunabilir mi =" + file.canRead());
            System.out.println("Dosya yazılabilir mi = " + file.canWrite());
            System.out.println("Dosya boyutu nedir =" + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader= new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt"));
            writer.write("AHMET");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
