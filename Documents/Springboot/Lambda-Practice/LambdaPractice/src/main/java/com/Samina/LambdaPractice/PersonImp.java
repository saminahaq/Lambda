package com.Samina.LambdaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.Samina.LambdaPractice.Person.Sex;

public class PersonImp {
	
	//whatever logic is inside the 'test(Person p)' method its work
	//for inforced that only one abstract method put @FunctionalInterface
	
	@FunctionalInterface 
	interface CheckPerson {
        boolean test(Person p); //For Lambda only one abstract method
    }
	
	public static void main(String... args) {
		
		

		List<Person> pers = Person.generateDefaultList();
		
		//Approach # 01
		//printPersonOlderThan(pers,20);
		
		//Approach # 02
		//printPersonWithinAgeRange(pers,20,21);
		
		
		//Approach # 03
		printPeople(pers, new CheckPersonEligibleForSelectiveSearch()); //use class here

		
		
		//anonymous class 
		
		printPeople(pers, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return
                        p.getAge() >= 18 &&
                        p.getAge() <=25;
            }
        });
		
		
		/*
		 *  Lambda function -> but careful it create only one abstract method in interface 
		 *  if there is two abstract method Lambda techniques does not works.
		 *  Lambda funtion is working because of funtional interface having one abstract method 
		 *  witout "functional Interface" that not possible make lambda
		 */
		
		//with Funtional Interfacce
		printPeople(pers,  
				(p) ->  // (p) These are var, for only one value () that will be removed but more than one value () needed, e.g (a,b)
				{ return //when there is only one implementation like in this case , we removed the 'return' key word with '{}' e.g printPeople(people,  (p) -> p.getAge() >= 18 && p.getAge() <=25);
						p.getAge() >= 18 
						&& p.getAge() <=25;
				});

		
		//*********Important*********
		//with predicate [without Functional Interface] : if don't want to create interface so used this 
        printPeopleWithPredicate(pers,  
        							(p) -> 
        									p.getAge() >= 18 
        									&& p.getAge() <=25);
	
  
	} 

	//Approach # 01
	public static void printPersonOlderThan(List<Person> people, int age) {
		
		for(Person per:people) {
			if(per.getAge()>= 20) {
				per.printPerson();
			}
		}
	}
	
	//Approach # 02
	
	public static void printPersonWithinAgeRange(List<Person> people, int low, int high) {
		
		for(Person per: people) {
			if(low <= per.getAge() && high >= per.getAge()) {
				per.printPerson();
			}
		}
	}

	//Approach # 03
	
	/*
	 * create interface -> because we don't need to create the diff method every time so create interface
	 * and used it in implement and create generic printPeople method
	 */
	
	
	static class CheckPersonEligibleForSelectiveSearch  implements CheckPerson {

        @Override
        public boolean test(Person p) {
            return 
                    p.getAge() >= 18 &&
                    p.getAge() <=25;
        }
    }
	
		//with Funtional Interface ---> lambda  
		public static void printPeople(List<Person> people,
				CheckPerson tester) {
			for(Person p: people) {
				if(tester.test(p)) {
					p.printPerson();
				}
			}
		}
	
		//with predicate *********Important********* don't need to create interface  no abstract method
		public static void printPeopleWithPredicate(List<Person> people,
				Predicate<Person> tester) {
			for(Person p: people) {
				if(tester.test(p)) {
					p.printPerson();
				}
			}
		}
	
		
		
	
	
	
	
	
}
