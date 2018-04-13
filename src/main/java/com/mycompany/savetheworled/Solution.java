/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.savetheworled;

import java.util.Scanner;

/**
 *
 * @author Altysh
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int shild = sc.nextInt();
            String code = sc.nextLine();
            code.trim();
            swap(shild, code, i);

        }
    }

    public static void swap(int shild, String code, int caseNu) {
        int caseNumer = caseNu+1;
        if (calculateDamage(code) > shild) {
            int steps = getSteps(code, shild);
            switch (steps){
                case -1:System.out.println("Case #" + caseNumer + ": IMPOSSIBLE");
                break;
               
                default:System.out.println("Case #" + caseNumer + ": "+steps);
                break;
                
            }
        } else {
            
            System.out.println("Case #" + caseNumer + ": 0");
            
        }
    }

    static int getSteps(String code, int shild) {
        char[] array = code.toCharArray();
        int index = 0;
        int steps = 0;
        boolean impossible = false;
        stee:
        while (!impossible) {
            impossible = true;
            for (index=0; index < array.length-1; index++) {
                if (calculateDamage(String.valueOf(array)) < shild) {
                    impossible = false;
                    break stee;
                }
                if (array[index] == 'C' && array[index + 1] == 'S') {
                    char ch = array[index];
                    array[index] = array[index + 1];
                    array[index+1] = ch;
                    impossible = false;
                    steps++;
                }
            }
   
            if (calculateDamage(String.valueOf(array)) <= shild) {
                    impossible = false;
                    break stee;
                }
        }
       // System.out.println(String.valueOf(array)+"   " + steps);
        if(impossible)
            steps=-1;
        return steps;
    }

    static int calculateDamage(String code) {
        int d = 1;
        int sum = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == 'S') {
                sum += d;
            } else {
                d *= 2;
            }
        }
       // System.out.println(code+ " "+sum+" "+d);
        return sum;
    }

}
