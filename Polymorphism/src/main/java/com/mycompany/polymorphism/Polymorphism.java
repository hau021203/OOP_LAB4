package com.mycompany.polymorphism;

import java.util.Scanner;
import java.util.Vector;
import java.util.Comparator;

public class Polymorphism {

    public static void main(String[] args) {
        Polymorphism a = new Polymorphism();
        a.menu();
    }
    private Vector<Student> a = new Vector<Student>();

    public void addCol() {
        Student b = new College();
        b.Input();
        a.add(b);
    }

    public void addUni() {
        Student b = new University();
        b.Input();
        a.add(b);
    }

    public void remove() {
        System.out.println("Enter student code :");
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        for (int i = 0; i < a.size(); i++) {
            if (c.equals(a.get(i).getStudentNum())) {
                a.remove(i);
                break;
            }
        }
    }

    public void print() {
        for (int i = 0; i < a.size(); i++) {
            a.get(i).Output();

        }
    }

    public void studentGra() {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).graduation()) {
                a.get(i).Output();
                count++;
            }
        }
        System.out.println("Number of graduated student :" + count);
    }

    public void sortup() {

    }

    public void findStu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to find students :");
        String d = sc.nextLine();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getStudentFName().contains(d)) {
                a.get(i).Output();
            }
        }
    }

    public void menu() {
        int menu;
        Polymorphism p = new Polymorphism();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("1. Add a new college student\n"
                    + "2. Add a new university student\n"
                    + "3. Remove a student from the list\n"
                    + "4. Print student list\n"
                    + "5. Print the list of students eligible for graduation and indicate the number of eligible students\n"
                    + "6. Sort the student list ascending by Student type (College, university) and student code\n"
                    + "7. Find student list by student's full name\n"
                    + "8. Exit\nInput: ");

            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    p.addCol();
                    break;
                case 2:
                    p.addUni();
                    break;
                case 3:
                    p.remove();
                    break;
                case 4:
                    p.print();
                    break;
                case 5:
                    p.studentGra();
                    break;
                case 6:
                    p.sort();
                    break;
                case 7:
                    p.findStu();
                    break;
                case 8:
                    break;
            }
        } while (menu != 8);
    }

    private void sort() {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student e1, Student e2) {
                return e1.getStudentNum().compareTo(e2.getStudentNum());
            }
        };
        a.sort(com);
    }

}
