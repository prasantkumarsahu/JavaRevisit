package collections.Queue;

import java.util.concurrent.*;

/**
 * Author: PRASANT
 * Date: 21/03/25
 */

public class BlockingQueueDemo {
	public static void main(String[] args) throws Exception {
		// thread-safe queue
		// wait for queue to become non-empty / wait for space
		// simplify concurrency problems like producer-consumer
		// standard queue --> immediately
			// empty --> remove (no waiting)
			// full --> add (no waiting)
		// BlockingQueue
			// put --> Blocks if the queue is full until space becomes available
			// take --> Blocks if the queue is empty until an element becomes available
			// offer --> Waits for space to become available, up to the specified timeout

		// ArrayBlockingQueue
		// A bounded, blocking queue backed by a circular array
		// low memory overhead
		// single lock, producers and consumers block each other
		// uses a single lock for both enqueue and dequeue operations
		// more threads --> problem
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		producer.start();
		consumer.start();

		// optionally bounded backed by LinkedList
		// Uses two separate locks for enqueue and dequeue operations
		// Higher concurrency between producers and consumers
		BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();

		// Unbounded
		// Binary Heap as array and can grow dynamically
		// Head is based on their natural ordering or a provided Comparator like priority queue
		// Put won't block
		BlockingQueue<Integer> queue2 = new PriorityBlockingQueue<>();

		// each insert operation must wait for a corresponding remove operation by another thread and vice versa
		// it can't store elements, capacity of at most 1 element
		BlockingQueue<Integer> queue3 = new SynchronousQueue<>();
	}
}

class Producer implements Runnable {
	private BlockingQueue<Integer> queue;
	private int value = 0;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Producer produced: " + value);
				queue.put(value++);
				Thread.sleep(500);
			} catch (Exception e) {
				Thread.currentThread().interrupt();
				System.out.println("Producer interrupted");
			}
		}
	}
}

class Consumer implements Runnable {
	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Integer value = queue.take();
				System.out.println("Consumer consumed: " + value);
				Thread.sleep(2000);
			} catch (Exception e) {
				Thread.currentThread().interrupt();
				System.out.println("Consumer interrupted");
			}
		}
	}
}