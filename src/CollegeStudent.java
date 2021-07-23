import javax.swing.JOptionPane;
import java.util.*;

public class CollegeStudent extends Student  implements Employee  {

	double Income=0;
	double taxAMT=0;
	double totalIncome=0;
	double totalTaxCalculated=0;
	public CollegeStudent(String name, String sID) {
		super(name, sID);
		// TODO Auto-generated constructor stub
	}

	double ScholarAmount=0;
	
	
	public double scholarship() {
		double result = 0;
		double avg=0;
		   for (double grade:gradesReceived) {
			     result += grade;
		   }
		avg = result/gradesReceived.length;
		if(avg>90) {
			ScholarAmount=4000;
		}
		else if(avg>80) {
			ScholarAmount=2000;
		}
		else {
			ScholarAmount=0;
		}
		//System.out.println("You received "+avg+" in scholarship");
		return ScholarAmount;
	}
	
	
	@Override
	public double callIncome() {
		// TODO Auto-generated method stub
		//System.out.println("Please enter your income");
		String Input = JOptionPane.showInputDialog(null, "Please enter your income");
		 Income = Integer.parseInt(Input)*1.00;
		
		return Income;
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		
		if(Income<47630) {
			taxAMT =TAXRATE[0];
		}
		else if(Income>47630 && Income<95259) {
			taxAMT =TAXRATE[1];
		}
		else if(Income>95259 && Income<147667) {
			taxAMT = TAXRATE[2];
		}
		else if(Income>147667 && Income<210371) {
			taxAMT = TAXRATE[3];
		}
		else{
			taxAMT = TAXRATE[4];
		}
		 totalTaxCalculated = taxAMT*Income;
		//System.out.println("Your tax amount is: "+(totalTaxCalculated));
		return totalTaxCalculated;
		
	}

	@Override
	public double calNetIncome() {
		// TODO Auto-generated method stub
		
		totalIncome = Income-totalTaxCalculated;
		return totalIncome;
	}

	@Override
	public String[] courseRegistration() {
		// TODO Auto-generated method stub
		for(int i=0; i<courseRegistered.length;i++) {
			courseRegistered[i] = JOptionPane.showInputDialog(null, "Please enter the "+(i+1)+"th course taken by "+Name);
		}
		return courseRegistered;
		
	}

	@Override
	public double[] setGrades() {
		// TODO Auto-generated method stub
		for(int i=0;i<gradesReceived.length;i++) {
			String Input = JOptionPane.showInputDialog(null, "Please enter the "+(i+1) +"th grade taken by "+Name);
			gradesReceived[i]= Integer.parseInt(Input)*1.00;
		}
		return gradesReceived;
	}
	
	@Override
	public String toString() {
		String returnString = Name+":"+studentID+"  took "+"Courses taken: "+ Arrays.toString(courseRegistration())+
								"\nGrades: "+ Arrays.toString(setGrades()) +
								"\nScholarship: "+ scholarship()+
								"\nTotal Income: "+ callIncome()+
								"\nTotal Tax: "+ calTax()+
								"\nNet Income: "+ calNetIncome();
		return returnString;
	}

}
