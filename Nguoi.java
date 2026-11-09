/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class Nguoi {
    protected String hoten;
    protected int tuoi;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoten);
        System.out.println("Tuoi: " + tuoi);
    }
}

