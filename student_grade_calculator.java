import java.util.Scanner;
public class student_grade_calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the name of the Student : ");
		String student_name = sc.nextLine();
		System.out.print("Enter the marks got by "+student_name+" in Mathematics : ");
		int math_marks = sc.nextInt();
		System.out.print("Enter the marks got by "+student_name+" in English : ");
		int eng_marks = sc.nextInt();
		System.out.print("Enter the marks got by "+student_name+" in Science : ");
		int sc_marks = sc.nextInt();
		System.out.print("Enter the marks got by "+student_name+" in Social Studies : ");
		int ss_marks = sc.nextInt();
		System.out.print("Enter the marks got by "+student_name+" in Computer : ");
		int comp_marks = sc.nextInt();
		System.out.println("The total marks obtained by "+student_name+" in all subjects is : "+(math_marks+eng_marks+sc_marks+ss_marks+comp_marks));
		double percentage = (math_marks+eng_marks+sc_marks+ss_marks+comp_marks)/5;
		System.out.println("The percentage obtained by "+student_name+" is : "+percentage+"%");
		if (percentage > 95)
			System.out.println("The Grade obtained by "+student_name+" is A+");
		else if (percentage > 90)
			System.out.println("The Grade obtained by "+student_name+" is A");
		else if (percentage > 80)
			System.out.println("The Grade obtained by "+student_name+" is B+");
		else if (percentage > 70)
			System.out.println("The Grade obtained by "+student_name+" is B");
		else if (percentage > 60)
			System.out.println("The Grade obtained by "+student_name+" is C");
		else if (percentage > 50)
			System.out.println("The Grade obtained by "+student_name+" is D");
		else if (percentage > 40)
			System.out.println("The Grade obtained by "+student_name+" is E");
		else
			System.out.println("The Grade obtained by "+student_name+" is F");
		
	}
}
