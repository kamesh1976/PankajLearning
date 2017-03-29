package com.jlcindia.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class Test3 {

	public static void main(String[] args) {
		Student st1=new Student(11,"pankaj");
		Student st2=new Student(13,"Kumar");
		Student st3=new Student(15,"pandey");
		Student st4=new Student(12,"Kamesh");
		Student st5=new Student(14,"Java");
		
		 List list=new ArrayList();
		      list.add(st1);
		      list.add(st2);
		      list.add(st3);
		      list.add(st4);
		      list.add(st5);
		      System.out.println(list);
		     
		    System.out.println("Sorting By SID");
		      Collections.sort(list, new sidcomp());
		        System.out.println("Sorted list SID: ");
		       for(Object a :list){
		    	   System.out.println(a);  
		    }
		       Collections.sort(list, new snamecomp());
		        System.out.println("Sorted list SNAME: ");
		       for(Object b :list){
		    	   System.out.println(b);  
		    }
		}
}


class sidcomp implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student && ob2 instanceof Student){
			Student s1=(Student) ob1;
			Student s2=(Student) ob2;
			return s1.sid-s2.sid;
		}
		return 0;		
   }
	}
class snamecomp implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student && ob2 instanceof Student){
			Student s1=(Student) ob1;
			Student s2=(Student) ob2;
			return s1.sname.compareTo(s2.sname);
		}
		return 0;
	}	
}
class Student{
    int sid;
	String sname;
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		
		 return "Sid: "+this.sid+"-- Sname: "+this.sname; 
	}
	
}	

