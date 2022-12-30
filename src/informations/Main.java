package informations;

public class Main {

	public static void main(String[] args) {
		 Student  Student  = new  Student ("Rose", "Light", 213, "computer engineering");
		 Student .ShowInfos();
			
	
	     Teachers teachers = new Teachers ("Rose", "Light", 321, "computer engineering" , 10000);
	     teachers.ShowInfos ();
	    //EĞER OVERRİDE ETMESEYDİK KULLANMAK ZOUNDA KALIRDIK
	     //teachers.ShowInfos2 ();
	}
}