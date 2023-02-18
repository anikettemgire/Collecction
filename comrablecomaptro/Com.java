package comrablecomaptro;
import java.util.*;

public class Com {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp(14,"aniket",101));
		al.add(new Emp(12,"sam",145));
		al.add(new Emp(13,"ajink",10));
		Collections.sort(al);
		System.out.println(al);

	}

}
