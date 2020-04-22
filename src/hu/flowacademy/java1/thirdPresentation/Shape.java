package hu.flowacademy.java1.thirdPresentation;

public abstract class Shape {
    private int sideCount;
    private int cornerCount;
    private boolean isConvex;
    private String name;

    public Shape() {
        System.out.println("Ős konstruktor");
        this.name = "Forma";
    }

    public Shape(int sideCount, int cornerCount, String name) {
        this.sideCount = sideCount;
        this.cornerCount = cornerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();

    public abstract double getArea();


    public int getSideCount() {
        return sideCount;
    }

    public void setSideCount(int sideCount) {
        this.sideCount = sideCount;
    }

    public int getCornerCount() {
        return cornerCount;
    }

    public void setCornerCount(int cornerCount) {
        this.cornerCount = cornerCount;
    }

    public boolean isConvex() {
        return isConvex;
    }

    public void setConvex(boolean convex) {
        isConvex = convex;
    }
}
