import java.io.*;
import java.util.*;

// run this demo via:
// javac BSTDemo.java
// java BSTDemo
// (assuming that the file BSTInput.txt is in the same directory as this Java file)

class BSTDemo {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("BSTInput.txt"));
    BST T = new BST();                                           // an empty BST

    try {
      System.out.println(T.findMin());                       // Exception occurs
      System.out.println(T.findMax());                   // will not be executed
    }
    catch (NoSuchElementException e) {
      System.out.println(e);
    }

    int n = sc.nextInt(), key;
    while (n-- > 0) {
      key = sc.nextInt();
      T.insert(key);
    }

    System.out.println(T.search(71));                               // found, 71
    System.out.println(T.search(7));                                 // found, 7
    System.out.println(T.search(22));                           // not found, -1

    T.inorder();                          // The BST: 4, 5, 6, 7, 15, 23, 50, 71

    try {
      System.out.println(T.findMin());                                      // 4
      System.out.println(T.findMax());                                     // 71
    }
    catch (NoSuchElementException e) {
      System.out.println(e);                             // will not be executed
    }

    System.out.println(T.successor(23));                                   // 50
    System.out.println(T.successor(7));                                    // 15
    System.out.println(T.successor(71));                                   // -1
    System.out.println(T.predecessor(23));                                 // 15
    System.out.println(T.predecessor(7));                                   // 6
    System.out.println(T.predecessor(71));                                 // 50

    System.out.println("---");
    n = sc.nextInt();
    while (n-- > 0) {
      key = sc.nextInt();
      System.out.println("Deleting " + key);
      T.delete(key);
    }

    T.inorder();
  }
}
