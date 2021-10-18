import tree.BTree;
import java.util.Random;


public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {

        int[] keys = new int[1000000];
        char[] values = new char[1000000];
        BTree<Character, Integer> b = new BTree<>();


        for (int i = 0; i < keys.length; i++) {
            int var = random.nextInt(50);
            char rChar = (char)(random.nextInt(26) + 'a');
            keys[i] = var;
            values[i] = rChar;
        }

        for (int j = 0; j < keys.length; j++) {
            b.put(values[j], keys[j]);
        }

        for (char value: values) {
            System.out.println("value: " + value + " - " + b.get(value));
        }

        System.out.println(b);
        System.out.println(b.height());
        System.out.println(b.size());
    }
}
