/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses.aritmatika.komputer;

/**
 *
 * @author yongki
 */
public class Aritmatika {

    private int des1, des2, a, m, q, count;
    //private String binary1, binary2;

    public int getA() {
        return a;
    }

    public int getDes1() {
        return des1;
    }

    public void setDes1(int des1) {
        this.des1 = des1;
    }

    public int getDes2() {
        return des2;
    }

    public void setDes2(int des2) {
        this.des2 = des2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void jadiBinary() {

        String tes1 = Integer.toBinaryString(getDes1());
        String tes2 = Integer.toBinaryString(getDes2());
        System.out.println("bin1 " + tes1);
        System.out.println("bin2 " + tes2);
        String s = "1001";
        int j = s.length();
//        String n = "";
//        for (int i = 0; i <= j; i++) {
//            if (1 == Integer.parseInt(s.substring(i, 1))) {
//                n += "0";
//
//            } else {
//                n += "1";
//            }
String pp =s.substring(0, 1);
        System.out.println("n " + pp);
        }
        
    }

