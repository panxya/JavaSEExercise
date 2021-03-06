package it.cast_07;

public class Student {
	private String name;
	private int age;
	private boolean flag; // 默认情况是没有数据，如果是true，说明有数据

	public synchronized void set(String name, int age) {
		
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		this.name = name;
		this.age = age;

		this.flag = true;
		this.notify();
	}

	public synchronized void get() {
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		System.out.println(this.name + "---" + this.age);

		this.flag = false;
		this.notify();
	}

}
