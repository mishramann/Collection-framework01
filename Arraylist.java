import java.lang.classfile.components.ClassPrinter.Node;
import java.util.*;

import org.w3c.dom.NodeList;

public class Arraylist {
  public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // // int x;
    // list.add(12);// 0
    // list.add(2);// 1
    // list.add(3);// 2
    // list.add(5);// 3
    // System.out.println(list.get(2));
    // System.out.println(list.size());
    // for (i = 0; i < list.size(); i++) {
    // // System.out.println(list.get(i));
    // }

    // for (int x : list) {
    // // System.out.println(x);
    // }

    // method for check existence
    // System.out.println(list.contains(5));
    // System.out.println(list.contains(50));

    // remove the element of index present
    // list.remove(2);

    // list.add(2, 50);
    // list.set(2, 40); //remove the element of index replace by new value
    // for (int x : list) {
    // System.out.println(x); // if we intitialize an arraylist with the capacity of
    // 12 element then if
    // // inceases size of that arraylist it will increase 1.5 times of that
    // arraylist

    // }

    // List<String> list = new ArrayList<>();
    // System.out.println(list.getClass().getName());
    // List<String> list1 = Arrays.asList("apple", "mango", "banana");
    // System.out.println(list1.getClass().getName());
    // list1.set(1, "kiwi");
    // System.out.println(list1.get(1));
    // String[] array = { "Apple", "Banana", "Cherry" };
    // List<String> list2 = Arrays.asList(array);
    // System.out.println(list2.getClass().getName());

    // // List<Integer> list3 = List.of(1, 2, 3, 4);
    // // list3.set(3, 10);
    // List<String> list4 = new ArrayList<>(list2);
    // list4.add("Mango");
    // System.out.println(list4);
    // List<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(0, 0);
    // // System.out.println(list);
    // List<Integer> list1 = List.of(4, 5, 6, 7, 8, 9);
    // list.addAll(list1);
    // System.out.println(list);
    // List<Integer> list = new ArrayList<>();
    // list.add(1); // 0
    // list.add(5); // 1
    // list.add(3); // 2
    // list.remove(1); // by index remove 2
    // list.remove(Integer.valueOf(1)); // it will remove the value 1 and hide the
    // index
    // System.out.println(list);
    // Object[] array = list.toArray();
    // Integer[] array2 = list.toArray(new Integer[0]); // converting list to array
    // Collections.sort(list); // Modification occur or we can say it will change in
    // ascending order
    // list.sort(null);
    // Time-Complexity
    // Access by index (get)) is O(n).
    // Adding an element is O(n) in the worst case when resizing occurs.
    // Removing elements can be O(n) beacause it may involve shifting elements.
    // Iteration is O(n).
    // System.out.println(list);
    // comparator method

    // LinkedList
    // linkedlist class in java is a part of collection framework and implements the
    // List interface. Unlike an ArrayList which uses the dynamic array to store the
    // element, a Linkedlist stores its elements as nodes in doubly Linked list.
    // This provide a different performance characterstics and usage scenerios
    // compared to Arraylist.

    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    // A Linkedlist is a Linear data structure where each element is a seperate
    // object called a node. Each node contain two parts:
    // Data : The value stored in the node ;
    // Pointer: Two pointers, one pointing to the next node (next) and the other
    // pointing to the prexious node (previous).

  }
}

class Node {

  public int value;
  public Node next;

}
