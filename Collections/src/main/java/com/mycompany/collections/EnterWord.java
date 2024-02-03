package com.mycompany.collections;

import java.util.Scanner;
import java.util.HashMap;

public class EnterWord {

    private HashMap<String, String> word = new HashMap<String, String>();

    public void Input() {
        word.put("caculate", "tinh toan");
        word.put("method", "phuong phap");
        word.put("require", "yeu cau");
        word.put("customer", "khach hang");
        word.put("system", "he thong");
        word.put("future", "tuong lai");
        word.put("code", "ma so");
        word.put("screen", "man hinh");
        word.put("contain", "bao gom");
        word.put("search", "tim kiem");
    }

    public boolean check(String a) {
        for (String i : word.keySet()) {
            if (a.equals(i)) {
                return true;
            }
        }
        return false;
    }

    public void meaning(String b) {
        for (String i : word.keySet()) {
            if (b.equals(i)) {
                System.out.println(word.get(i));
            }
        }
    }
}
