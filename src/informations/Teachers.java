package informations;

public class Teachers extends  Student {
	private int salary;
	public Teachers(String name, String last_name, int school_İD, String faculty, int salary) {
		super(name, last_name, school_İD, faculty);
		this.salary = salary;
	}
	
	
	//OVERRİDE KULLANMADAN YAPIMI
	/*	public void ShowInfos2 () {
			System.out.println("Salary: " + this.salary);
		}*/
		
	@Override
	public void ShowInfos() {
		//SUPER KULLANMADAN DİĞERLERİNİ EKLEMEK İSTESEYDİK
		/*System.out.println("Name: " +getName());
			System.out.println("Last name: " +getLastname();
			System.out.println("School_İD: " +getSchool_İD();
			System.out.println("Faculty: " +getFaculty();
		 */
		super.ShowInfos();
		System.out.println("Salary: "+this.salary);
	}
	}
