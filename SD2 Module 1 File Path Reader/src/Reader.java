/*Author- Jarett Wright
 * Date- 01/17/2020
 * Class- Software Development 2 
 * Description- This program reads the file system beneath the folder and outputs the results.
 * 
 * 
 */

import java.io.File;

public class Reader {

	public static void main(String[] args) {
		
		String filePath = "C:Users\\Bundr\\Desktop\\Mod1Test\\Tier1"; // File location
		File dirPath = new File(filePath);  // Insert Location
		
		if(dirPath.exists() && dirPath.isDirectory())  // If the file exist and it is a directory output results
		{
			File array[] = dirPath.listFiles();
			System.out.println("===================================");
			System.out.println("Directory Files are: "+ dirPath);
			System.out.println("===================================");
			RecursivePrint(array, 0 , 0);  // Function call
			
		}
		

	}



static void RecursivePrint(File[] array, int pointer, int tier) {
	
	if(pointer==array.length)  // If index is 0 array is empty
	{
		return;
	}
	for(int i = 0; i < tier; i++) // For loop to run through array
	{
		System.out.println("\t");
		if(array[i].isFile())  // If index has a file print file name
		{
			System.out.println(array[i].getName());
		}else if(array[i].isDirectory())  //If index has directory print directory name
			{
			System.out.println("[" + array[i].getName() + "]");
			RecursivePrint(array[i].listFiles(), 0, tier + 1);
			}
		
	}
	RecursivePrint(array, ++pointer, tier); // use recursion to call method inside itself
	
	
}}
