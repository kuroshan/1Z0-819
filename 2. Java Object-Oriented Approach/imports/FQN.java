//import default (hidden)
import java.lang.*;

import java.util.*; //el * solo incluye las clases que estan en el paquete java.util, no indica que sea recursivo


import java.util.Date;
//import java.sql.Date; a type with the same simple name is already defined by the single-type-import of Date

import java.util.*;
import java.sql.*;


public class FQN {

	Date d1;
	java.sql.Date d2; //FQN: Fully qualified name

	public static void main (String  ...args) {
 		Random r = new Random(); //pertenece al paquete java.util
 		int i = r.nextInt();

 		System.out.println("Bienvenidos a java");
 	}

}