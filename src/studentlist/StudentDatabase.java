package studentlist;

import java.util.*;

class StudentDatabase {
	public static void main(String[] args) {
		String yn = "y";
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student(20, "Vijay");
		Student s2 = new Student(50, "Ram");
		Student s3 = new Student(25, "Raju");
		Student s4 = new Student(47, "Rajesh");
		Student s5 = new Student(59, "Raj");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		while (yn != "n") {
			Scanner sc = new Scanner(System.in);
			Scanner s = new Scanner(System.in);

			System.out.println("Select  (+,Insert)");
			System.out.println("Select  (-,Remove)");
			System.out.println("Select  (*,Update)");
			String sym = sc.next();

			switch (sym) {
			case "+": {

				System.out.println("Enter rollNo for the student");
				int rollNo = s.nextInt();
				System.out.println("Enter name of student");
				String name = sc.next();
				list.add(new Student(rollNo, name));
				break;

			}
			case "-": {
				System.out.println("Enter rollNo of  student to remove");
				int rollNo = sc.nextInt();
				for (int i = 0; i < list.size(); i++)

				{

					if (rollNo == list.get(i).rollNo) {
						System.out.println("found=" + rollNo);
						list.remove(i);
						break;

					}
				}
				break;
			}

			case "*": {
				System.out.println("Enter rollNo for the student");
				int rollNo = s.nextInt();
				System.out.println("Enter name of student");
				String name = sc.next();
				for (int i = 0; i < list.size(); i++) {

					if (rollNo == list.get(i).rollNo) {
						System.out.println("found=" + rollNo);
						list.set(i, new Student(rollNo, name));
						break;

					}
				}
			}
			}
			System.out.println("To Continue (Press y for Yes and n for No)");
			yn = sc.next();

			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i).rollNo + list.get(i).name);

		}
	}

}

class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
}
