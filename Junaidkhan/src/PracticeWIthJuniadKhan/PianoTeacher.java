package PracticeWIthJuniadKhan;

public class PianoTeacher extends Teacher{
	void PTeacher() {
		System.out.println("I am a music teacher.");
		name="I am Ustad Gulzaman and Khawri Shadgul";
		System.out.println(name);
	}
	public static void main(String[] args) {
		PianoTeacher obj=new PianoTeacher();
		obj.Cridential();
		obj.PTeacher();
		
	obj.name="I am Ustad Gulzaman"; 
	System.out.println(obj.name);
	}

}
