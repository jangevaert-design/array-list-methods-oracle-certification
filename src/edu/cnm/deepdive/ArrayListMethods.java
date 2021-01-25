package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

  public static void main(String[] args) {
    List<String> pets = new ArrayList<>();
    System.out.println("The list is empty: " + pets.isEmpty());
    System.out.println("The size of the list is " + pets.size());

    if (pets.isEmpty()) {//both methods isEmpty() and size() can be used but isEmpty() is preferred.
      System.out.println("\nNo pets with isEmpty()");
    }
    if (pets.size() == 0) {
      System.out.println("No pets with size()");
    }

    pets.add("cat");
    System.out.println("\nThe list is empty: " + pets.isEmpty());
    System.out.println("The size of the list is " + pets.size());

    pets.clear();//removes all the elements from the list.
    System.out.println("\n" + pets);
    System.out.println("The list is empty: " + pets.isEmpty());
    System.out.println("The size of the list is " + pets.size());

    pets.add("dog");
    System.out.println("\nThe list contains \"cat\": " + pets.contains("cat"));
    System.out.println("The list contains \"dog\": " + pets.contains("dog"));

    List<String> newList = new ArrayList<>();
    newList.add("dog");
    System.out.printf("\nThe ArrayLists %s and %s are equal: " + pets.equals(newList), pets, newList);

    newList.add("cat");
    System.out.printf("\nThe ArrayLists %s and %s are equal: " + pets.equals(newList) + "\n", pets, newList);
    //Here we check whether the two ArrayLists contain the same objects in the same order.

    pets.add(0, "cat");
    System.out.println();
    System.out.println(pets);
    System.out.println(newList);
    System.out.printf("The ArrayLists %s and %s are equal: " + pets.equals(newList), pets, newList);
    //in newList "cat" is added to the end while in pets it has been added to index 0. result = false.
  }
}
