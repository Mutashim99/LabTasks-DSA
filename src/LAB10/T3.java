package LAB10;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    int priority;
    String taskName;

    Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return taskName + " (Priority: " + priority + ")";
    }
}

class PriorityTaskQueue {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.offer(new Task("Task A", 7));
        taskQueue.offer(new Task("Task B", 5));
        taskQueue.offer(new Task("Task C", 9));
        taskQueue.offer(new Task("Task D", 3));

        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("" + task);
        }
    }
}
