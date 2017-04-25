package my_list_lab;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/* TODO Complete the test of the MyList.java class you created, eventually use the assert functionality. */

public class Main {
	final static int LIST_SIZE = 8;

	public static void main(String[] args) {
		MyList list;
		List<Integer> listToCopy = new ArrayList<Integer>();
		int n;
		int[] minMax = new int[2];
		list = new MyList();

		Scanner in = null;
		for (int i=0;i<LIST_SIZE;i++)
		{
			in = new Scanner(System.in);
			n = in.nextInt();
			list.myInsert(n);	
		}
		in.close();

		MyList listCopied = new MyList(listToCopy);
		System.out.println(listCopied);
		
		// list.myEmpty();
		// System.out.println(list);
		
		System.out.println(list);
		minMax = list.minMax();
		System.out.println("The smallest element is: " + minMax[0] + ", the largest element is: " + minMax[1]);
		
		list.myMoveHeadToTail();
		System.out.println(list);
		
		list.myDeleteEOrO(false);
		System.out.println(list);
	}
}
