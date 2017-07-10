package conferenceListCreator;

import java.io.*;
import java.text.ParseException;
import java.util.*;



public class StartUp {

	public static void main(String[] args) throws IOException, ParseException {
		
		IOFileManager file = new IOFileManager();
        List<Person> people = file.readFile();
        ControlParameterValidator validator = new ControlParameterValidator(people);
        UIService.getUserInput(validator);
        
        for (Person p : people) {
        	System.out.println(p);
        }
//        System.out.println();
//        for (Person p : people) {
//        	System.out.printf("name: %20s\t surname: %20s date: %20s age:%20d\n", p.getName(),
//        			p.getLastName(), p.getBirthDate(), p.getAge());
//        }
        //Collections.sort(people);
        //CompareFirstName comp = new CompareFirstName();
//        CompareLastName comp = new CompareLastName();
//        Sorter s = new Sorter();
//        s.QuickSort(people, comp);
		List<Person> result = Filter.selectByLastName(people, 'B');
        for (Person p : result) {
        	System.out.println(p);
        }
        
       // file.writeFile(people, "conference_list.csv");
        
//              

	}

}
