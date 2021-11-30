package chipi;
import java.util.ArrayList;
public class noihaimang {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> list = new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("3");
			ArrayList<String> list1 = new ArrayList<String>();
			list1.add("4");
			list1.add("5");
			list1.add("6");
			list1.addAll(list);
			System.out.println(list1);
			
		}
	}


