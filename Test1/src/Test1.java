
import java.util.*;
public class Test1 {

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Q1.");
		System.out.print("Enter the number of items: ");
		int num = in.nextInt();
		System.out.print("Enter price of first item: RM");
		int num1 = in.nextInt();
		System.out.print("Enter quantity of first item: ");
		int quan1 = in.nextInt();
		System.out.println("");
		System.out.print("Enter price of second items: RM");
		int num2 = in.nextInt();
		System.out.print("Enter quantity of second item: ");
		int quan2 = in.nextInt();
		System.out.println("");
		System.out.print("Enter price of third items: RM");
		int num3 = in.nextInt();
		System.out.print("Enter quantity of third item: ");
		int quan3 = in.nextInt();
		System.out.println("");
		double sum, dis, paid;
		sum = (num1*quan1) + (num2*quan2) + (num3*quan3);
		System.out.println("Total price: RM"+sum);
		if (sum >= 100) {
			paid = sum * 80/100;
			dis = sum - paid;
			System.out.println("Discount received: RM"+dis);
			System.out.println("Price to be paid: RM"+paid);
		}else if (sum < 100) {
			paid = sum * 90/100;
			dis = sum - paid;
			System.out.println("Discount received: RM"+dis);
			System.out.println("Price to be paid: RM"+paid);
		}
		
		
		
		
		
		System.out.println("");
		
		System.out.println("Q2.");
		System.out.print("Enter sales: RM");
		double sale = in.nextInt();
		System.out.print("Enter hours worked:");
		int hour = in.nextInt();
		double commission, daily;
		
		if(sale >= 150.00 && sale <= 300.00) {
			commission = (sale * 0.05);
			daily = commission + (hour*5);
			System.out.println("Commision: RM" +commission);
			System.out.println("Daily wages: RM" + daily);		
		} else if (sale >= 301.00 && sale <= 500.00) {
			commission = (sale * 0.10);
			daily = commission + (hour*5);
			System.out.println("Commission: RM" +commission);
			System.out.println("Daily wages: RM" + daily);
		} else if (sale >= 501.00) {
			commission = (sale * 0.15);
			daily = commission + (hour*5);
			System.out.println("Commission: RM" +commission);
			System.out.println("Daily wages: RM" + daily);
		}
	}
}
