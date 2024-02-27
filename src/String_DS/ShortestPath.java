package String_DS;
import java.util.Scanner;
public class ShortestPath {
    public static double getShortestPath(String path){
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S' || dir == 's')
                y--;
            if (dir == 'E' || dir == 'e')
                x++;
            if (dir == 'W' || dir == 'w')
                x--;
            if (dir == 'N' || dir == 'n')
                y++;
        }
        return Math.sqrt(x*x + y*y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path: ");
        String path = sc.next();
        System.out.println(getShortestPath(path));
    }
}
