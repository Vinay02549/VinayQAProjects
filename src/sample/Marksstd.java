package sample;

public class Marksstd {
	public static void main(String[] args) {

		int marks = 34;

		if (marks < 35) {
			System.out.println("student grade F");
		} else if (marks >= 35 && marks <= 45) {
			System.out.println("student grade d");
		}

		else if (marks >= 45 && marks <= 60) {
			System.out.println("Student grade C");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("student grade B");
		} else if (marks >= 70 && marks < 85) {
			System.out.println("student grade A");
		} else if (marks >= 85 && marks <= 100) {
			System.out.println("student grade O");
		} else {
			System.out.println("student details is INVALID");
		}

	}
}
