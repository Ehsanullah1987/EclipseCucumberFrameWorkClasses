package PracticeWIthJuniadKhan;

public class ChemisteryTeacher extends Teacher {
	
	 
	void cTeacher() {
		System.out.println("I am chemistry teacher.");
		name="My name is Professor Silani";
		System.out.println(name);
	}
public static void main(String[] args) {
		
		ChemisteryTeacher obj=new ChemisteryTeacher();
		obj.Cridential();
		obj.cTeacher();
		obj.name="My name is professor Silani";
		System.out.println(obj.name);
	}

}
