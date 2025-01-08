package LAB10;

import java.util.LinkedList;
import java.util.Queue;
class TicketQueue {
    Queue<Integer> queue;

    TicketQueue() {
        queue = new LinkedList<>();
    }
    void enqueue(int ticketNumber) {
        queue.add(ticketNumber);
    }
    void process(int k) {
        boolean found = false;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int currentTicket = queue.poll();
            if (currentTicket % k == 0) {
                System.out.println("Processing ticket number: " + currentTicket);
                found = true;
                break;
            } else {
                queue.add(currentTicket);
            }
        }
        if (!found) {
            System.out.println("No person to process");
        }
    }
    void size() {
        System.out.println("Queue size: " + queue.size());
    }
}
class TicketQueueSimulation {
    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();
        ticketQueue.enqueue(10);
        ticketQueue.enqueue(15);
        ticketQueue.enqueue(20);
        ticketQueue.enqueue(25);
        ticketQueue.size();
        ticketQueue.process(5);
        ticketQueue.size();
        ticketQueue.process(7);
        ticketQueue.size();
        ticketQueue.process(20);
        ticketQueue.size();
    }
}
