package datastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        MsQueue msQueue = new MsQueue();

        msQueue.enqueue(1);
        msQueue.enqueue(2);
        msQueue.enqueue(3);

        msQueue.dequeue();
        msQueue.enqueue(4);
        msQueue.enqueue(5);
        msQueue.enqueue(6);

        System.out.println(msQueue.dequeue());

        msQueue.dequeue();
        msQueue.enqueue(7);
        msQueue.enqueue(8);

        msQueue.print();
    }
}
