package studentqueuesimulation;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentQueueSimulation {
    public static void main(String[] args) {
        Queue<String> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        // 1. Add students interactively
        System.out.println("Enter 3 student names:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Student " + i + ": ");
            students.offer(scanner.nextLine());
        }
        
        System.out.println("\nInitial Queue: " + students);

        // 2. Serve the first student
        if (!students.isEmpty()) {
            System.out.println("Served: " + students.poll());
        }

        // 3. Challenge: Add a new student
        System.out.print("\nEnter new student name to join the queue: ");
        students.offer(scanner.nextLine());
        System.out.println("Updated Queue: " + students);

        // 4. Serve remaining students
        System.out.println("\nServing remaining students:");
        while (!students.isEmpty()) {
            System.out.println("Served: " + students.poll());
        }
        
        scanner.close();
    }
}
