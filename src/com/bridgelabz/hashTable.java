package com.bridgelabz;

import java.util.Hashtable;


public class hashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> h = new Hashtable<>();// Created Hashtable

        // Adding the mappings to hashtable
        h.put("This", 2);
        h.put("is", 5);
        h.put("hash", 9);
        h.put("Table", 10);


        System.out.println("Welcome to the Hash table");
        System.out.println(h);


        // To Get the value of key
        String v = String.valueOf(h.get("10")); // to get the data at 4th index
        System.out.println("The value of the key is: ");
        System.out.println("Table"); // to print the value at above index


        // Removing a key and its value
        h.remove("this"); // to delete key and value at index 5
        System.out.println("Removing the key and value: ");
        System.out.println(h);


        // checking if value is present in the hash table or not
        System.out.println("Is the value 'this' present? " + h.contains("This"));
        if (h.containsValue("bridgelabs"))
            System.out.println("value exists in the table");
        else System.out.println("value does not exists in the table");


        // checking whether a key exists in table or not
        if (h.containsKey(20))
            System.out.println("Key exists in the table");
        else System.out.println("key does not exists in the table");


        // checking the size of hash table
        System.out.println("Size is: " + h.size());


    }
}