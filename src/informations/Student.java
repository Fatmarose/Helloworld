package informations;

public class Student {

	// public static void main(String[] args) {
		private String name;
		private String last_name;
		private int school_İD;
		private String faculty;
	

		public Student (String name, String last_name, int school_İD, String faculty ) {
		this.name = name;
		this.last_name = last_name;
		this.school_İD = school_İD;
		this.faculty = faculty;
		
		
		}
		public void ShowInfos () {
			System.out.println("Name: " +this.name);
			System.out.println("Last name: " +this.last_name);
			System.out.println("School_İD: " +this.school_İD);
			System.out.println("Faculty: " +this.faculty);
		
	}

}
