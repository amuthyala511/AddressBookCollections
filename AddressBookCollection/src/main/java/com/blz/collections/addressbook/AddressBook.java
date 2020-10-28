package com.blz.collections.addressbook;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class AddressBook
{
	static Scanner sc = new Scanner(System.in);
	static List<Person> list = new LinkedList<Person>();

	public static void addContact()
	{
		System.out.println("Enter your firstName : ");
			String firstName = sc.nextLine();
		System.out.println("Enter your lastName : ");
			String lastName = sc.nextLine();
		System.out.println("Enter your address : ");
			String address = sc.nextLine();
		System.out.println("Enter your city : ");
			String city = sc.nextLine();
		System.out.println("Enter your state : ");
			String state = sc.nextLine();
		System.out.println("Enter your zipCode : ");
			String zip = sc.nextLine();
		System.out.println("Enter your phoneNo : ");
			String phoneNo = sc.nextLine();
		System.out.println("Enter your emailId : ");
			String email = sc.nextLine();
			Person obj = new Person(firstName, lastName, address, city, state, zip, phoneNo, email);
		list.add(obj);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program..");
		addContact();
		System.out.println(list);
	}

}
