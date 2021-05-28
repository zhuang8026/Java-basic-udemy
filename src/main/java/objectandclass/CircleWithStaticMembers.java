package objectandclass;

public class CircleWithStaticMembers {
    /**
     * The radius of the circle
     */
    double radius;

    /**
     * The number of the objects created
     */
    static int numberOfObjects = 0; // static 會導致，只要有其他文件有修改到 numberOfObjects。全世界都會一起改
    private int numberOfObjectsv2 = 0; // private 只能在類中被使用

    /**
     * Construct a circle with radius 1
     * 但被實例化的時候，如果是什麼都沒有傳入，就是使用這個默認 構造函數
     */
    CircleWithStaticMembers() {
        radius = 1.0;
        numberOfObjects++; // numberOfObjects = numberOfObjects + 1; // 1
    }

    /**
     * Construct a circle with a specified radius
     */
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++; // numberOfObjects = numberOfObjects + 1; // 2
    }

    /**
     * Return numberOfObjects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        // numberOfObjects 必須大於0
        if(!(numberOfObjects < 0)) {
            CircleWithStaticMembers.numberOfObjects = numberOfObjects;
        }

    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    public int getNumberOfObjectsv2() {
        return numberOfObjectsv2;
    }

    public void setNumberOfObjectsv2(int numberOfObjectsv2) {
        this.numberOfObjectsv2 = numberOfObjectsv2;
    }

}

