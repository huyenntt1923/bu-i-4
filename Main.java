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
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());

        Nhanvien[] ds = new Nhanvien[n];

        // Nhap danh sach
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhan vien thu " + (i + 1));
            ds[i] = new Nhanvien();
            ds[i].nhap(sc);
        }

        // Tim nhan vien cong tac lau nhat
        int vt = 0;

        for (int i = 1; i < n; i++) {
            if (ds[i].getSnct() > ds[vt].getSnct()) {
                vt = i;
            }
        }

        System.out.println("\nNhan vien cong tac lau nhat:");
        ds[vt].xuat();

        // Sap xep luong giam dan
        Arrays.sort(ds, Comparator.comparingDouble(
            Nhanvien::tinhLuong
        ).reversed());

        // Xuat danh sach
        System.out.println("\nDanh sach nhan vien theo luong giam dan:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhan vien thu " + (i + 1));
            ds[i].xuat();
        }

        sc.close();
    }
}
