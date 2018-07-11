import java.util.*;
class ArrayListIteration
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        list.add("FOURTH");
 
        list.add("FIFTH");
 
        //1. Using for loop
 
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
 	System.out.println();

        //2. Using Iterator
 
        Iterator it = list.iterator();
 
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
 
            //Removing an element from list
           // it.remove();
        }
	System.out.println(1);


	ListIterator  listIt1 = list.listIterator(list.size());
 
        while (listIt1.hasPrevious())
        {
            System.out.print(listIt1.previous()+" ");
		
        }
		System.out.println(2); 
 
        //3. Using ListIterator
 
        ListIterator  listIt = list.listIterator();
 
        while (listIt.hasNext())
        {
            System.out.print(listIt.next()+" ");
		
        }
		System.out.println(); 
        //4. Using enhanced for loop
 
        for (String element : list)
        {
            System.out.print(element+" ");
        }
		System.out.println();
    }
}

