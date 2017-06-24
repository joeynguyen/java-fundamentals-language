public class Main {

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        float result3 = floatVal - longVal;

        System.out.println(result1); // This is a comment
        // System.out.println("Hello World Two");
        System.out.println(result2);
        System.out.println(result3);

        float students = 30;
        float rooms = 4;

        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;
        System.out.println(studentsPerRoom);

        int v1 = 10;
        int v2 = 5;

        if (v1 > v2)
            System.out.println("v1 is bigger");
        else if (v1 < v2)
            System.out.println("v2 is bigger");
        else
            System.out.println("v1 and v2 are equal");

    }
}
