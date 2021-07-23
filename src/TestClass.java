import javax.swing.JOptionPane;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Created an array but do not have enough time to do anything else
		CollegeStudent[] newStudents = new CollegeStudent[5];
		
		
		//Sample
		newStudents[0] =new CollegeStudent("Nivid", "123");
		newStudents[1] =new CollegeStudent("Shah", "1234");
		newStudents[2] =new CollegeStudent("vidvid", "12345");
		newStudents[3] =new CollegeStudent("RandomGuy", "123456");
		newStudents[4] =new CollegeStudent("NividShah", "1234567");
		
		for(int i=0; i<newStudents.length;i++) {
			//JOptionPane.showMessageDialog(null, newStudents[i].toString());
			System.out.println(newStudents[i].toString());
		}
		
	}

}
