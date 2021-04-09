package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Point2D point2D= new Point2D();
        System.out.println(point2D.toString());
        Point2D point2D1 = new Point2D(1,2);
        System.out.println(point2D1.toString());
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D point3D1 = new Point3D(5,6,7);
        System.out.println(point3D1);
    }
}
