package udemypractice;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class javaStreams {
	public static void main(String[] args) {
		
	}

@Test
public void streamfilter() {
	ArrayList<String> names= new ArrayList<String>();
	names.add("shivani");
	names.add("om");
	names.add("ajay");
	names.add("akshay");
	
	Long c=names.stream().filter(s->s.startsWith("s")).count();
	System.out.println(c);
	
	Stream .of("shiv","vicky","ajay","akshay").filter(s->s.endsWith("v")).forEach(s->System.out.println(s));
	names.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.print(s));
	
	
}

@Test
public void streammap() {
	Stream.of("shiv","vicky","ajay","akshay").filter(s->s.endsWith("v")).map(s->s.toUpperCase()).forEach(s->System.out.print(s));	
}

//merging 2 differt list
public void concate(){
	List<String> name1=Arrays.asList("Abhijt","vicky","om","jay");
	name1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.print(s));
Stream<String> newStream=Stream.concat(name1.stream(), name1.stream());	

}







}
