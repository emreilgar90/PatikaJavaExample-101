package OBS;

public class Teacher {
	String name;
	String mpno;
	String branch;
	
	Teacher(String name,String mpno,String branch){
		this.name=name;
		this.mpno=mpno;
		this.branch=branch;
	}
    
	void print() {
		System.out.println("Adi: "+ this.name);
		System.out.println("Adi: "+ this.mpno);
		System.out.println("Adi: "+ this.branch);
		
	}
}
