public class Queue {
    int front, rear, size, capacity, array[];

    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity -1;
        array = new int[this.capacity];
    }

    public boolean isFull (Queue queue){
        return queue.size == queue.capacity;
        //here if the size is full, then it returns true
    }

    public boolean isEmpty(Queue queue){
        return queue.size == 0;
    }

    public void enqueue(int item){
        if (isFull(this)) {
            return;
        } //if the queue is full then nothing will be added to queue

        this.rear = (this.rear+1)%this.capacity;

        this.array[this.rear] = item;
        this.size = this.size +1;
        System.out.println(item + " enqueued to");
    }
    public int dequeue(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size-1;
        return item;
    }//basically what this function does is it return an item from queue
     //and return the item
    public int front(){
        if (isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    public int rear(){
        if (isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }

    public static void main (String[] args){
        Queue queue = new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue\n");

        System.out.println("Front item is " + queue.front());

        System.out.println("Rear item is " + queue.rear());

    }


}

