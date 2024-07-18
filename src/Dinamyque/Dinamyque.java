package Dinamyque;


import java.util.ArrayList;

public class Dinamyque {
	public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        System.out.println("Contenu de l'ArrayList:");
        for (int element : dynamicArray) {
            System.out.println(element);
        }

        int element = dynamicArray.get(1);
        System.out.println("Élément à l'index 1: " + element);

        dynamicArray.set(1, 50);
        System.out.println("ArrayList après modification:");
        for (int elem : dynamicArray) {
            System.out.println(elem);
        }

        dynamicArray.remove(0);
        System.out.println("ArrayList après suppression:");
        for (int elem : dynamicArray) {
            System.out.println(elem);
        }

        int size = dynamicArray.size();
        System.out.println("Taille de l'ArrayList: " + size);
    }
}