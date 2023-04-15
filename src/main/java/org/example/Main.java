package org.example;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Long.sum;


public class Main {
    public static void main(String[] args) {
        solution(10);

    }

    public static int otherAngle(int angle1, int angle2) {
        int angle3 = 0;
        if (angle1 > 0 && angle2 > 0) {
            angle3 = 180 - angle1 - angle2;
        }
        return angle3;
    }


    //Multiples of 3 or 5


        public static int solution(int number) {
            Set<Integer> multiple = new HashSet<>();
            int addition = 0;


            for (int i = 1; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    multiple.add(i);

                }
            }
            for (int element : multiple) {
                addition = addition + element;
            }
            System.out.println(addition);
            return addition;
        }


            //Array.diff

            public static int[] arrayDiff(int[] a, int[] b) {
//duke kaluar array ne hashset heq dublikimet
                Set<Integer> list1 = new HashSet<>();
               for (int element: a){
                   list1.add(element);
               }
//duke kaluar array ne hashset heq dublikimet
                Set<Integer> list2 = new HashSet<>();
                for (int element: b){
                    list2.add(element);
                }
//keshtu heq te gjitha elementet e perbashket

                list1.removeAll(list2);

                int array[] = new int[list1.size()];

                int i = 0;
                for (int element:list1) {
                    array[i++] = element;

                }
                return array;
            }












    }



