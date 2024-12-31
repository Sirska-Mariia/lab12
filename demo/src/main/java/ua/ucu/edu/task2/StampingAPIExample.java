package ua.ucu.edu.task2;

public class StampingAPIExample {
    public static void main(String[] args) {
        
        Signature<String> task1 = new Signature<>(arg -> System.out.println("Executing Task 1 with: " + arg));
        Signature<String> task2 = new Signature<>(arg -> System.out.println("Executing Task 2 with: " + arg));
        Signature<String> task3 = new Signature<>(arg -> System.out.println("Executing Task 3 with: " + arg));

        Group<String> group = new Group<>();
        group.addTask(task1).addTask(task2).addTask(task3);

        group.apply("Stamping API Example");

        System.out.println("Group ID: " + group.getId());
        for (Task<String> task : group.tasks) {
            System.out.println("Task ID: " + task.getId() + ", Group UUID: " + group.groupUuid);
        }
    }
}
