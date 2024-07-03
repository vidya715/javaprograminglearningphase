import java.util.*;
class arrays{
    public static void main(String[] args) {
       int[]marks={87,98,90,84};
int[][]finalmarks={{89,90,89,71},{76,89,90,67}};
       System.out.println(marks[0]);
       System.out.println(marks.length);
       
Arrays.sort(marks);
System.out.println(marks[0]); // Output: [65, 78, 87, 88, 92]
System.out.println(finalmarks[0][0]);
System.out.println(finalmarks[0][1]);
System.out.println(finalmarks[2][0]);
       
    }
}
