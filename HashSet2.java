import java.util.*;
public class HashSet2 {

	public static void main(String[] args) {
	HashSet<String>set= new HashSet<String>();
	set.add("Brian");
	set.add("Norbat");
	set.add("Alex");
	set.add("Walid");
	set.add("Berril");
	set.add("Ruth Jeptanui");
	
		System.out.println("Initial List: "+ set);
		set.remove("Norbat");
	System.out.println("updated list :"+ set);
	HashSet<String>set1= new HashSet<String>();
	set1.add("Alli");
	set1.add("Moses");
	set.add("Juma");
	set.addAll(set1);
	System.out.println("New List With The added Members :"+ set);
	set.removeIf(str->str.contains ("Juma"));
	set.removeIf(str->str.contains ("Moses"));
	System.out.println("List updated :"+ set);
	set.clear();
	System.out.println("after invokimg the clear command :"+ set);
		
	}
	

	}


