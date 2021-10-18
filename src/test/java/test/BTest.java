package test;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tree.BTree;


public class BTest {

    private static BTree<Character, Integer> BTree = new BTree<>();

    @BeforeAll
    static void initialize() {
        BTree.put('a', 34);
        BTree.put('b', 4562);
        BTree.put('c', 12456);
        BTree.put('d', 667);
        BTree.put('e', 34);
        BTree.put('f', 75);
        BTree.put('g', 5);
        BTree.put('h', 94);
        BTree.put('i', 67);
        BTree.put('j', 23);
        System.out.println(BTree);
    }


    @Test
    void standardAssertions() {
        assertEquals(2, BTree.height());
        assertEquals(4562, BTree.get('b'));
        assertEquals(67, BTree.get('i'));
        assertEquals(23, BTree.get('j'));
        assertEquals(34, BTree.get('a'));
        assertEquals(75, BTree.get('f'));
        assertEquals(10, BTree.size());
        assertFalse(BTree.isEmpty());
    }

}

