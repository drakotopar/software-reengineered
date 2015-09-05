package com.software_reengineered.blogPost.forInLoopStreamMapCollectAndForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Stream
{
	
	
    public static void main( String[] args )
    {
    	/**
    	 * Data sets
    	 */
    	Person john = new Person();
    	john.setFirstName("John");
    	john.setAddress(new Address("ubi 1", "398106"));
    	
    	Person paul = new Person();
    	paul.setFirstName("Paul");
    	paul.setAddress(new Address("ubi 2", "398106"));
    	
    	Person jack = new Person();
    	jack.setFirstName("Jack");
    	jack.setAddress(new Address("33 lorong 8", "123123"));
    	
    	List<Person> persons = Arrays.asList(john,paul,jack);
    	
    	
    	
    	/**
    	 *  Collect attributes of objects
    	 */
    	List<String> nameOfPersonsv1 = new ArrayList<String>();
    	
    	// build the list with For .. in loop
        for (Person person : persons) {
        	nameOfPersonsv1.add(person.getFirstName());
		}
        
        // built the list with stream
        List<String> nameOfPersonsv2 = persons.stream().map(Person::getFirstName).collect(Collectors.toList());
        
        System.out.println("List of names with for..in");
        nameOfPersonsv1.stream().forEach(System.out::println);
        
        System.out.println("List of names with stream");
        nameOfPersonsv2.stream().forEach(System.out::println);
        
        
        
        /**
    	 *  Collect attributes of nested objects
    	 */
        List<String> streetNameOfPersonsv1 = new ArrayList<String>();
        // build the list with For .. in loop
        for (Person person : persons) {
        	streetNameOfPersonsv1.add(person.getAddress().getStreet());
		}
        
        // built the list with stream
        List<String> streetNameOfPersonsv2 = persons.stream().map(person->{return person.getAddress().getStreet();}).collect(Collectors.toList());
        
        System.out.println("List of street names with for..in");
        streetNameOfPersonsv1.stream().forEach(System.out::println);
        
        System.out.println("List of street names with stream");
        streetNameOfPersonsv2.stream().forEach(System.out::println);
        
        
        /**
    	 *  Collect objects which passed a condition
    	 */
        List<Person> personWhichPostalCodeEqual398106v1 = new ArrayList<Person>();
        // build the list with For .. in loop
        for (Person person : persons) {
        	if(person.getAddress().getPostalCode()=="398106"){
        		personWhichPostalCodeEqual398106v1.add(person);
        	}
		}
        
        // built the list with stream
        List<Person> personWhichPostalCodeEqual398106v2 = persons.stream().filter(p->p.getAddress().getPostalCode()=="398106").collect(Collectors.toList());
        
        System.out.println("List of street names with for..in");
        personWhichPostalCodeEqual398106v1.stream().forEach(person->{System.out.println(person.getFirstName());});
        
        System.out.println("List of street names with stream");
        personWhichPostalCodeEqual398106v2.stream().forEach(person->{System.out.println(person.getFirstName());});
        
        
        
        /**
         * Find out if one of the object of a collection meet a condition. 
         * We illustrate here a nested object conditions
         */
        boolean isaPersonLiveAtTheStreetubi1v1 = false;
        // find out if a person live at ubi 1 with for in
        for (Person person : persons) {
        	if(person.getAddress().getStreet()=="ubi 1"){
        		isaPersonLiveAtTheStreetubi1v1 = true;
        	}
		}
        
        // find out if a person live at ubi 1 with stream
        boolean isaPersonLiveAtTheStreetubi1v2 = persons.stream().map(Person::getAddress).anyMatch(a->a.getStreet()=="ubi 1");
        
        System.out.println("Is a person live in ubi 1 with for..in");
        System.out.println(isaPersonLiveAtTheStreetubi1v1);
        
        System.out.println("Is a person live in ubi 1 with stream");
        System.out.println(isaPersonLiveAtTheStreetubi1v2);
        
        
        
        /**
         * Group the persons who live at the same postal code
         */
        Map<String,List<Person>> groupPersonByPostalCodev1 = new HashMap<String,List<Person>>();
       
        // build the list with For .. in loop
        for (Person person : persons) {
        	if(!groupPersonByPostalCodev1.containsKey((person.getAddress().getPostalCode()))){
        		groupPersonByPostalCodev1.put(person.getAddress().getPostalCode(), new ArrayList<Person>());
        	} 
        	groupPersonByPostalCodev1.get(person.getAddress().getPostalCode()).add(person);
        }
        
        // build the list with stream
        Map<String,List<Person>> groupPersonByPostalCodev2 = persons.stream().collect(Collectors.groupingBy(p-> {return p.getAddress().getPostalCode();}));
        
        groupPersonByPostalCodev1.forEach((postalCode, pers) -> System.out.format("postal code %s: %s\n", postalCode, pers));
        groupPersonByPostalCodev2.forEach((postalCode, pers) -> System.out.format("postal code %s: %s\n", postalCode, pers));
        
    }
}
