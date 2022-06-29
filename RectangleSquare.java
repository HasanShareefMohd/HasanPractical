
package com.java;

public class RectangleSquare {
	
    public static void main(String[] args) {
    Rectangle r = new Rectangle();
    System.out.println("Perimeter of rectangle:- ");
    System.out.println(r.perimeterRectangle(72,48));
        System.out.println("Area of rectangle:- ");
    System.out.println(r.areaRectangle(72,48));
    Square s = new Square();
    System.out.println("Area of square:- ");
    System.out.println(s.areaSquare(24));
    }
}

class Rectangle{
    int length;
    int width;

    static int perimeterRectangle(int l, int w){
        return 2 * (l + w);
    }

    static int areaRectangle(int l, int w){
        return l * w;
    }

}

class Square{
    int a;
    static int areaSquare(int a){
        return a * a;
    }
}
