package com.Samina.LambdaPractice;

import java.util.ArrayList;
import java.util.List;

import com.Samina.LambdaPractice.Person.Sex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	public enum Sex {
        MALE, FEMALE
    } 
	
	private String name;
	private int age;
	private Sex gender;
	private String emailAddress;

	public void printPerson() {
        System.out.println(this.toString());
    }

	public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Shabbir", 20, Sex.MALE, "shabbir@gmail.com"));
        people.add(new Person("Nikhil", 21, Sex.MALE, "nikhil@gmail.com"));
        people.add(new Person("Shivam", 19, Sex.MALE, "shivam@gmail.com"));
        return  people;
    }
	
    
    
}
