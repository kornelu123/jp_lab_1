package org.example;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        doFirstAss();
        doSecAss();
        doThirdAss();
    }

    public static void doFirstAss(){
        Car car = new Car("i1","hy5da","ce22e4");
        Car car1 = new Car("i2","hy2a","ce22e4");
        Car car2 = new Car("i3","hyu543nda","ce32e4");
        Car car3 = new Car("i4","h24unda","ce32e4");
        Car car4 = new Car("i5","heunda","ce52e");

        HashSet<Object> carSet = new HashSet<Object>();
        carSet.add(car);
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);

        for (Object c : carSet ) {
            System.out.println(c);
        }
        System.out.println("\n Jak widac sa tylko 3 rekordy, mimo ze dodanych bylo 5 , co oznacza ze HashSet nie bierze pod uwage duplikatow\n");
    }

    public static void doSecAss() {
        Random rand = new Random();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        LinkedList<Integer> linList = new LinkedList<Integer>();
        long addMeanArr = 0;
        long addMeanLin = 0;

        for(int i=0; i<100; i++) {
            long start = System.nanoTime();
            aList.add(rand.nextInt(30));
            long elapsed = System.nanoTime() - start;
            addMeanArr = (addMeanArr + elapsed)/(2);
            start = System.nanoTime();
            linList.add(rand.nextInt(30));
            elapsed = System.nanoTime() - start;
            addMeanLin = (addMeanLin + elapsed)/(2);
        }

        System.out.println("Mean time of adding to ArrayList :" + addMeanArr + "\nMean time of adding to LinkedList :" + addMeanLin + "\n");
        long start = System.nanoTime();
        aList.remove(20);
        long elapsed = System.nanoTime() - start;
        System.out.println("Elapsed deleting time of ArrayList is "+ elapsed + "\n");

        start = System.nanoTime();
        linList.remove(20);
        elapsed = System.nanoTime() - start;
        System.out.println("Elapsed deleting time of LinkedList is "+ elapsed + "\n");

        start = System.nanoTime();
        aList.contains(10);
        elapsed = System.nanoTime() - start;
        System.out.println("Elapsed searching time of ArrayList is "+ elapsed);

        start = System.nanoTime();
        linList.contains(10);
        elapsed = System.nanoTime() - start;
        System.out.println("Elapsed searching time of linkedList is "+ elapsed + "\n");
        System.out.println("Time is measured in ns\n");
    }

    public static void doThirdAss(){
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Entry> hMap = new HashMap<>();
        TreeMap<Integer, Entry> tMap = new TreeMap<>();
        Integer i = 0;
        while(true){
            System.out.println("do you want to continue ? y/n");
            String choice = scan.nextLine();
            if(choice.equals("n")){
                break;
            }

            System.out.println("Insert word for dictionary :\n");
            String name = scan.nextLine();
            System.out.println("Insert description for that word");
            String desc = scan.nextLine();
            Entry ent = new Entry(name, desc);
            hMap.put(i, ent);
            tMap.put(i, ent);
            i++;
        }

        for(int j=0; j<i ;j++){
            System.out.println("Hashmap entry no. " + j + "\n");
            System.out.println(hMap.get(j).getName() + " :" + hMap.get(j).getDesc());
            System.out.println("Treemaps entry no. " + j + "\n");
            System.out.println(tMap.get(j).getName() + " :" + tMap.get(j).getDesc());
        }
    }
}