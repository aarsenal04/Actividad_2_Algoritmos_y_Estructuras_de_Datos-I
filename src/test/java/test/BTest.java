package test;

public class BTest {

    public static void main(String[] args) {
        BTree b = new BTree (3, null);
        b.insertKey(12);
        b.insertKey(24);
        b.insertKey(37);
        b.insertKey(3);
        b.insertKey(45);
        b.insertKey(50);
        b.printfTree(b.getRoot(),0);
    }

}

}