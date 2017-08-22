import java.util.*;  //importing Scanner class to get the data from the user

public class TypeCastDemo {

	public static void main(String[] args) {

		byte num;	//initializing variable in byte data type
		short num1;	//initializing variable in short data type
		int num2;	//initializing variable in integer data type
		long num3;	//initializing variable in long data type
		float num4;	//initializing variable in float data type
		double num5, num6;	//initializing variable in double data type

		Scanner sc = new Scanner(System.in); //Creating Scanner class object

		System.out.println("Enter 1st number (byte range -128 to 127): ");      //taking input in byte data type
		num = sc.nextByte();
		System.out.println("Enter 2nd number (short range -32,768 to 32,767): ");  //taking input in short data type
		num1 = sc.nextShort();
		sc.close();     //close of scanner class
		num2 = num + num1;	//adding byte and short and storing it in int data type
		System.out.println("The sum of byte and short is (stored in int): "+num2); //display of the output
		num3 = num1 + num2;  //adding short and int and storing it in long data type
		System.out.println("The sum of short and int is (stored in long): "+num3); //display of the output
		num4 = num2 + num3;  //adding int and long and storing it in float data type
		System.out.println("The sum of int and long is (stored in float): "+num4);  //display of the output
		num5 = num3 + num4;  //adding long and float and storing it in double data type
		System.out.println("The sum of long and float is (stored in float): "+num5);  //display of the output
		num6 = num4 + num5;  //adding float and double and storing it in double data type
		System.out.println("The sum of float and double is (stored in double): "+num6);  //display of the output

	}

}
