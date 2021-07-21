package com.ashwini;
import java.util.*; 
import java.io.*;
public class IntersectionString {
	
	public static String FindIntersection(String[] string) {
	    // code goes here  
	    //ArrayList<Integer> list= new ArrayList<Integer>();
	    String[] str1=string[0].split(", ");
	    String[] str2=string[1].split(", ");
	  StringBuilder str=new StringBuilder();
	  for(int i=0;i<str1.length;i++)
	    {
	      for(int j=0;j<str2.length;j++)
	      {
	        if(Integer.parseInt(str1[i])==(Integer.parseInt(str2[j])))
	        {
	         str.append(str1[i]+",");
	          break;
	          //System.out.println(str1[i]);
	        }
	      }
	    }
	int len=str.toString().length();
	  if(len==0)
	  {
	    string[0]="false";
	  }
	  else
	  {
	    string[0]=str.substring(0,len-1);
	  }
	    return string[0];
	  }

	
	public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    System.out.print(FindIntersection(s.nextLine())); 
		  }
 }