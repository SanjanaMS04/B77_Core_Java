package multithread;

public class usingRunnable implements Runnable {
	private int h, l;
	private String msg;
	Thread t;
	
	
	public usingRunnable(int l, int h, String msg) {
		this.l = l;
		this.h = h;
		this.msg = msg;
		t=new Thread(this, "Child Thread");
		t.start();
	}

	@Override
	public void run() {
		System.out.println("In run");
		for (int i = l;i<=h;i++) {
			
			
			  try { 
				  Thread.sleep(500); 
			  } 
			  catch (InterruptedException e) {
			  System.out.println("Error " + e.getMessage()); }
			 
			System.out.println(msg + i);
		}
	}

}