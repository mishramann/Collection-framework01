import java.util.*;

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

    List<String> list = new ArrayList<>();
    System.out.println(list.getClass().getName());
    List<String> list1 = Arrays.asList("apple", "mango", "banana");
    System.out.println(list1.getClass().getName());
    list1.set(1, "kiwi");
    System.out.println(list1.get(1));
    String[] array = { "Apple", "Banana", "Cherry" };
    List<String> list2 = Arrays.asList(array);
    System.out.println(list2.getClass().getName());

  }
}