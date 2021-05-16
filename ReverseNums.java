
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UR
 */
public class ReverseNums {
    
public static void main (String[] args)
{
int num = 4;
ArrayList list = new ArrayList(num);
Scanner scanner = new Scanner(System.in);
System.out.println("please input 4 number for the array number list ? ");
list.add(scanner.nextInt()); 
StringBuilder builder = new StringBuilder ();
builder.append(list);
builder.reverse();
System.out.println("list reversed : " + builder);

}

}
