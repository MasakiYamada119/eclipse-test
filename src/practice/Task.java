package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
	private LocalDate date;
	private String task;
	
	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}
	public String gettask() {
		return this.task;
	}
	public LocalDate getdate() {
		return this.date;
	}
	public String toString() {
		return task;
	}
	@Override
	public int compareTo(Task t) {
		return date.compareTo(t.date);
	}
}
