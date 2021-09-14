/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex01;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name;
        Scanner input_val = new Scanner(System.in);
        name = input_val.next();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
