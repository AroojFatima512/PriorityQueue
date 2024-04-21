public class Main {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
//        q.display();
        q.enqueue(14);
        q.enqueue(11);
        q.enqueue(17);
        q.enqueue(15);
        q.enqueue(10);
        q.enqueue(21);
        q.enqueue(25);
        q.enqueue(16);
        q.enqueue(9);
        q.display();
        q.enqueue(1);
        System.out.println("After Dequeue: ");
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
