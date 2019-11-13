
import chn.util.*;
import java.util.*;


public class List 
{
	ArrayList<String> list = new ArrayList<String>();

	public ArrayList<String> add(String item)
	{
	
		/* Get user input with your input class and add it to list
		 * with ArrayList.add
		 * 
		 */
		list.add(item);
		
		return list;
	}
	
	public ArrayList<String> delete(String item)
	{
		int num = Integer.parseInt(item);
		//Delete inputted value on the list with
		//ArrayList.remove
		
		list.remove(num - 1);
		return list;
	}
	public ArrayList<String> clear()
	{
		//Use a for loop to delete elements in the array
		return list;
	}
	
	public ArrayList<String> print()
	{
		for(int x = 0; x < list.size(); x++)
		{
			System.out.println(list.get(x));
		}
		return list;
	}

}
