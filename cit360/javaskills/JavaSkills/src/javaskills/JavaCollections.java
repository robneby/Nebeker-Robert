/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaskills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Robert Nebeker
 */
public class JavaCollections {
    
    public static void run(){
        //run all of the java collection in here
        JavaCollections.arrayListExample();
        JavaCollections.treeSetExample();
        JavaCollections.hashMapExample();
        JavaCollections.treeMapExample();
        JavaCollections.queueExample();
    }

    public static void arrayListExample() {
        System.out.println("Starting ArrayList examples");
        
        //make a new ArrayList
        ArrayList arr = new ArrayList();
        
        //add to the list
        arr.add("First element");
        arr.add("Second element");
        arr.add("First element"); //duplicate to see how it handles it
        
        //get size of array, notice how it doesn't care if there are duplicates
        System.out.println("The size of the array is: " + arr.size());
        
        //remove from the list
        arr.remove(0);
        
        //get size of array after remove
        System.out.println("The size of the array is now: " + arr.size());
        
        
    }

    public static void treeSetExample() {
        System.out.println("Starting TreeSet examples");
        
        //make a new tree set
        TreeSet tree = new TreeSet();
        
        //add to the set
        tree.add(2);
        tree.add(50);
        tree.add(1);
        tree.add(2); //duplicate to see how it handles it
        
        //get last object in list (which is the biggest in a sorted set)
        System.out.println("The last is: " + tree.last());
        
        //get size of set, notice how it removes duplicates
        System.out.println("The set size is: " + tree.size());
        
        //is the set empty? (returns a boolean)
        System.out.println("Is the set empty? " + tree.isEmpty());
        
        //clear the list
        tree.clear();
        
        //get size of set
        System.out.println("The set size is now: " + tree.size());
        
    }

    private static void hashMapExample() {
        System.out.println("Starting HashMap examples");
        
        //make a new hash map
        HashMap hash = new HashMap();
        
        //Add elements into the hash map (Produce prices)
        hash.put("Apple", 3.74);
        hash.put("Banana", 0.68);
        hash.put("Pear", 1.25);
        hash.put("Apple", 5.20); //duplicate to see how it handles it
        
        //get set size
        System.out.println("The size of the set is: " + hash.size()); 
        
        //get price for Apple from map, notice how it removes a duplicate and uses the latest value put in
        System.out.println("The price of an apple is: " + hash.get("Apple")); 
        
        //check to see if the map contains grapes
        System.out.println("The hash map contains grapes: " + hash.containsKey("Grape"));
        
        //check if there is a value of $1.25 in the hash map
        System.out.println("Does the hash map contain a value of $1.25? : " + hash.containsValue(1.25)); 
    }

    private static void treeMapExample() {
        System.out.println("Starting TreeMap examples");
        
        //make a new tree map
        TreeMap tree = new TreeMap();
        
        //Add elements into the tree map (Vacation days left)
        tree.put("Gina", 5);
        tree.put("Mark", 3);
        tree.put("Tom", 13);
        tree.put("Gina", 15); //duplicate to see how it handles it
        
        //get first key/lowest value
        System.out.println("The first person in the tree map is: " + tree.firstKey()); 
        
        //get entryset for this map, notice how it removes a duplicate and uses the latest value
        System.out.println("The tree map is: " + tree.entrySet()); 
        
        //get the size of the map
        System.out.println("The size of the tree map is: " + tree.size()); 
        
        //see if the map contains Tim
        System.out.println("Does the tree map contain Tim? : " + tree.containsKey("Tim")); 
        
        //clear the tree set and get size again
        tree.clear();
        System.out.println("The size of the tree map after clearing it is: " + tree.size()); 
    }
    
    private static void queueExample(){
        System.out.println("Starting Queue examples");
        
        Queue<Integer> queue = new LinkedList<>();
        
        //Adding numbers to the queue
        queue.add(3);
        queue.add(2);
        
        System.out.println("The queue of elements: " + queue);
        
        System.out.println("The size of the queue: " + queue.size());
        
        System.out.println("Removing and displaying first in the queue: " + queue.poll());
        
        System.out.println("The size of the queue after removing the head: " + queue.size());
        
        System.out.println("The queue of elements now: " + queue);
        
    }
    
}
