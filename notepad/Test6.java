class A11{
	boolean flag = true;
	int itemCount = 0;
	
	public synchronized void produce() {
		try {
			while(true) {
				if(flag == true) {
					itemCount += 1;
					System.out.println("Producer produced Item - "+itemCount);
					flag = false;
					notify();
					wait();
				}
				else {
					wait();
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void consume() {
		try {
			while(true) {
				if(flag == true) {
					wait();
				}
				else {
					System.out.println("Consumer consumed Item - "+itemCount);
					flag = true;
					notify();
					wait();
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Producer extends Thread{
	A11 a;
	public Producer(A11 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.produce();
	}
}
class Consumer extends Thread {
	A11 a;
	public Consumer(A11 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.consume();
	}
}
public class Test6 {

	public static void main(String[] args) {
		A11 a = new A11();
		Producer p = new Producer(a);
		Consumer c = new Consumer(a);
		
		p.start();
		c.start();
	}

}
