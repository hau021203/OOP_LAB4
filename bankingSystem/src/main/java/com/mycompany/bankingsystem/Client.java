package com.mycompany.bankingsystem;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Client c = new Client();
        c.menu();
        
    }
    public void menu(){
        TPBank a = new TPBank();
        VietcomBank b = new VietcomBank();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.TPBANK : 2.VietcomBank");
        int menu = sc.nextInt();
        switch(menu){
            case 1:
                System.out.println(a.getBankName());
                break;
            case 2:
                System.out.println(b.getBankName());
                break;
        }
    }
    
}
