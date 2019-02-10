package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 ArrayList<Integer> main_list = new ArrayList<>();
 ArrayList<Integer> list_div3 = new ArrayList<>();  
 ArrayList<Integer> list_div2 = new ArrayList<>();  
 ArrayList<Integer> list_rest = new ArrayList<>(); 
 
   for (int a = 0; a < 20; a ++)
    {
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        main_list.add(x);
    }   
    
      
    for(int i = 0; i < main_list.size(); i++){
        Integer k =  main_list.get(i);
        
        if (k %3 == 0 && k %2 != 0){
            list_div3.add(k);
        }
        else if (k % 2 == 0 && k %3 != 0 ){
            list_div2.add(k);
        }
        else if (k %3 == 0  && k % 2 == 0){
            list_div3.add(k);
            list_div2.add(k);
        }
        else{
            list_rest.add(k);
        }
    }
        
    printList(list_div3);
    printList(list_div2);
    printList(list_rest);
    
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
         for (Integer i : list)
           System.out.println(i);
    }
}
