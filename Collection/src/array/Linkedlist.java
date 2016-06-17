package array;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Linkedlist {

	public static void main(String[] args)
	{
        List<String> b=new LinkedList<String>();

         b.add("Green");
         b.add("Yellow");
         b.add("Blue");
         b.add("Orange");
         System.out.println(b);
         
      //   Iterator iterator=b.iterator();
        // while(iterator.hasNext()){
        	// String Color=(String) iterator.next();
        	//System.out.println(Color); 
         //}

         
         System.out.println("size Of LinkedList ::"+b.size()); 

	}

}
