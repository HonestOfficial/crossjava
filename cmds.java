// Copyright 2020 Tmike
// This file is not for editing, unless you know what you are doing
// and making a fork of the project. :)
import java.util.Random;
public class cmds {
  static void pray(String str) {
    System.out.print(str);
  }
  
  static void combine(int num1, int num2) {
    System.out.print(num1 + num2);
  }
  
  static void crossvariable(String storevar) {
	String crossvar = storevar;
  }
  
    static void crossvariable_np(String storevar) {
	String crossvar = storevar;
    System.out.print(crossvar);
  }
  
  
  
    static void praycrossvar(String varname) {
		String varfinalname = varname;
		System.out.print(varfinalname);
	}
	
   static void fun_randomsentence_set() {
	String[] strArr = { "God", "wants", "you", "to","pray", "not", "love", "yes", "hate", "China", "virus", "Linux", "Windows", "TempleOS", "CrossJava", "president", "United States", "of", "coronavirus", "COVID-19", "Minecraft", "Country"};
    Random rand = new Random();
    int res = rand.nextInt(strArr.length);
    System.out.print(strArr[res]);
	System.out.print(" ");
   }
   
   static void fun_randomsentence() {
	   fun_randomsentence_set();
   }
  

  public static void main(String[] args) {
	String str = "undefined";
	int num1 = 0;
	int num2 = 0;
	String storevar = "undefined";
  }
}