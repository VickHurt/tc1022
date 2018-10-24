import java.util.Scanner;
/* Victor Huerta
23/10/18
 Bisiesto */
public class Bisiesto {//Incio de clase
	public static void main (String[] args){//Inicio de main
	//variables
	int ano=0 ;
	boolean res = false;
	Scanner kb=new Scanner(System.in);

	//codigo
	System.out.println("Cual es el año");
	ano = kb.nextInt();

if (ano % 4 == 0 ){//principio de if
	if (ano % 100 ==0){//principio de if
		if (ano % 400 ==0)
		res = true;
		else
		res  = false;

}//fin de if
else
res  = true;

}//fin de if


else
res = false;


if(res)
System.out.println("El año es bisiesto");


else
System.out.println("El año no es bisiseto");
}//Fin de main
}//Fin de classe