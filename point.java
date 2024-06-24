import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Point {
    int x, y, z;

  
    public void accept() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the x coordinate of the point:");
            x = Integer.parseInt(br.readLine());

            System.out.println("Enter the y coordinate of the point:");
            y = Integer.parseInt(br.readLine());

            System.out.println("Enter the z coordinate of the point:");
            z = Integer.parseInt(br.readLine());

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    public void display() {
        System.out.println("The point is (" + x + ", " + y + ", " + z + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.accept();
        p1.display();
    }
}
       
