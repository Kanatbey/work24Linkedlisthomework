package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        nolBir();
        nolBir(new ArrayList<>(), new LinkedList<>());
    }

    public static void nolBir(List<Integer> array2, List<Integer> array3) {
        Random random = new Random();
        array2 = new ArrayList<>();
        array3 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            array2.add(random.nextInt(2));
            array3.add(random.nextInt(2));
        }
        System.out.print("\nArrayList     : ");
        Collections.sort(array2);
        for (Integer a : array2) {
            System.out.print(a + " ");
        }
        System.out.print("\nLinkedList    : ");
        Collections.sort(array3);
        for (Integer a : array3) {
            System.out.print(a + " ");
        }
    }

    public static void nolBir() {
        Random random = new Random();
        int[] array1 = new int[10];
        System.out.print("Jonokoi array : ");
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(2);
            if (array1[i] == 0) {
                System.out.print(array1[i] + " ");
            }
        }
        for (int j : array1) {
            if (j == 1) {
                System.out.print(j + " ");
            }
        }
    }
}

