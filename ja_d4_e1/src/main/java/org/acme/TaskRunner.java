package org.acme;

public class TaskRunner {

    public class Task extends Thread {
        private String taskName;

        public Task(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(taskName + " - Running iteration " + i);
            }
        }
    }

    public void runTasks() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 3");

        task1.start();
        task2.start();
        task3.start();

        try {
            task1.join();
            task2.join();
            task3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TaskRunner runner = new TaskRunner();
        runner.runTasks();
    }
}

