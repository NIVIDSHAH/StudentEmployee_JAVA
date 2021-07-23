
public abstract class Student {
	String Name, studentID;
	public Student(String name, String sID) {
		Name=name;
		studentID=sID;
	}
	String[] courseRegistered = new String[5];
	double[] gradesReceived= new double[5];
    
    public abstract String[] courseRegistration();
    public abstract double[] setGrades();
}
