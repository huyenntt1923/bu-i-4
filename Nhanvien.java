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

public class Nhanvien extends Nguoi {
    private int snct;
    private double hsl;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }

    public double tinhLuong() {
        double lcb = 1.5;
        double phucap = 0.2 * snct;

        return lcb * hsl + phucap;
    }

    public int getSnct() {
        return snct;
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.printf("Tien luong: %.2f trieu dong%n",
                          tinhLuong());
    }
}

