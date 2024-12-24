import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of levels for the tree: ");
        int levels = sc.nextInt();

        JFrame frame = new JFrame("Christmas Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);

        ChristmasTree tree = new ChristmasTree(levels);
        frame.add(tree);

        frame.setVisible(true);
    }
}