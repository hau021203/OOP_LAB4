package com.mycompany.collections;

import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {
        Dictionary a = new Dictionary();
        a.trans();
    }

    public void trans() {
        EnterWord a = new EnterWord();
        a.Input();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a word :");
        String b = obj.next();
        if (a.check(b)) {
            System.out.print("the meaning of the word :");
            a.meaning(b);
        } else {
            System.out.println("this word is not exist");
        }
    }
}
