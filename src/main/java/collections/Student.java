package collections;

import java.util.Objects;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

public class Student implements Comparable<Student>{
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, gpa);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gpa=" + gpa +
				'}';
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(o.getGpa(), this.getGpa());
	}
}
