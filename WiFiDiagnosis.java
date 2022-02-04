/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Build an application that will step through some possible problems to restore internet connectivity.  Assume that your computer uses wi-fi to connect to a router which connects to an Internet Service Provider (ISP) which connects to the Internet.)
 * Due: 9/12/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Yvan Darwish Libom
*/

import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in) ;
		
		System.out.println("Reboot the computer and try to connect");
		System.out.println("Did that fix the problem?");
		System.out.print("Type yes or no: ");
		
			String responds = str.nextLine(); 
			
				if(responds.contains("yes")) 
							{
								System.out.println("done");
							
							}  
					
					
								else if(responds.contains("no")) 
							{
								System.out.println("Reboot the router and try to connect");
								System.out.println("Did that fix the problem?");
								System.out.print("Type yes or no: ");
								responds = str.nextLine(); 
								
										if(responds.contains("yes")) 
											{
												System.out.println("done");
											
											}
											else if(responds.contains("no"))  
											{
												System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
												System.out.println("Did that fix the problem?");
												System.out.print("Type Yes or No: ");
												responds = str.nextLine(); 
															if(responds.contains("yes")) 
															{
																System.out.println("done");
															
															}
															else if(responds.contains("no")) 
															{
																System.out.println("Move the computer closer to the router and try to connect");
																System.out.println("Did that fix the problem?");
																System.out.print("Type yes or no: ");
																responds = str.nextLine(); 
																if(responds.contains("yes")) 
																{
																	System.out.println("done");
																
																}
																else if(responds.contains("no")) 
																{
																	
																	System.out.print("Contact vour ISP");
																	
																	
																}
																
															}
											}
							}
				
			
			str.close();
			

		// TODO Auto-generated method stub

	}

}
