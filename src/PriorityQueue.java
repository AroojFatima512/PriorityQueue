public class PriorityQueue {
    int[] arr;
    int size;
    int rear, front;
    int capacity;
    PriorityQueue(){
        this.capacity = 10;
        this.arr = new int[capacity];
        this.size = 0;
        this.front = -1;
        this.rear = -1;
    }

    boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    boolean isFull(){
        return rear == arr.length-1;
    }
    void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()){
            front = rear = 0;
            arr[rear] = data;
            size++;
            return;
        }

        int index = rear;
        for (int i = rear; i >= front; i--){
            if (data < arr[i]){
                arr[i+1] = arr[i];
                index--;
            }
        }
        arr[index+1] = data;
        size++;
        rear++;
    }

    int dequeue(){
        if (isEmpty()){
            return -1;
        }
        int data = arr[0];
        size--;
        front++;
        return data;
    }

    void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
