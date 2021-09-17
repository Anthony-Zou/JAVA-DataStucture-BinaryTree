package DSA;// Java program to demonstrate working of hashTable
import java.util.*;
public class HashTable {
    public static void main (String args[])
    {
        Hashtable<Integer,Integer> ht =   new Hashtable<Integer,Integer>();

        ht.put(123,432);
        ht.put(12,2345);
        ht.put(15,5643);
        ht.put(3,2);
        System.out.println(ht);
        ht.put(3,321);
        System.out.println(ht);
        ht.remove(12);

        System.out.println(ht);
    }
}

/*
* Applications of Hash Table
Hash tables are implemented where

constant time lookup and insertion is required
cryptographic applications
indexing data is required
* */