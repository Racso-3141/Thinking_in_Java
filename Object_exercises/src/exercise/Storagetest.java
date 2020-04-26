package exercise;
public class Storagetest {
    public static void main(String[] args) {
        class Storage {
            int storage(String s) {
                return s.length() * 2;
            }
        }
        Storage s = new Storage();
        System.out.print(s.storage("Hello"));
    }
}
