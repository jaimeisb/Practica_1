import java.util.Scanner;


public class practica1 {

	
		 public static void menu() {
			 	System.out.println("Ingrese el numero del programa a ejecutar");
		        System.out.println("\t1. Asteriscos");
		        System.out.println("\t2. Notas");
		        System.out.println("\t3. Convertir la Hora");
		        System.out.println("\t4. Hipotenusa");
		        System.out.println("\t5. Calculos Geometricos");
		        System.out.println("\t6. Calculadora Simple");
		        System.out.println("\t7. Rangos");
		        System.out.println("\t8. Arabigo a Romano");
		        System.out.println("\t9. Piramide de Números");
		        System.out.println("\t10. Lista de Romanos");
		        System.out.println("\t11. Cadena de Asteriscos");
		        System.out.println("\t12. Presione cualquier tecla para salir");
		    
		
}

public static void rombo(){
	int i=0,j=0,k=0;{
		for(i=0;i<=9;i++){
			if(i%2==1){
				for(k=10;k>=i;k--){
					if(k%2==1){
						System.out.print(" ");
					}
				}
				for(j=0;j<i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
//parte de abajo
for(i=9;i>1;i--){
	if((i%2)==1){
		for(k=i;k<=11;k++){
			if((k%2)==1){
				System.out.print(" ");
			}
		}
		for(j=i-2;j>0;j--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}}

public static void promedio(){
	int a,b,c,d,e,f,p;{
	System.out.println("Ingrese las 6 notas a promediar");
	Scanner s= new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	d=s.nextInt();
	e=s.nextInt();
	f=s.nextInt();
	p=(a+b+c+d+e+f)/6;
	if(p>0 && p<59)
		System.out.println("El promedio es E");
	else if(p>89 && p<101)
		System.out.println("El promedio es A");
	else if(p>59 && p<70)
		System.out.println("El promedio es D");
	else if(p>69 && p<80)
		System.out.println("El promedio es c");
	else if(p>79 && p<90)
		System.out.println("El promedio es B");
}

}
public static void eleccion(){
	menu();
	int num=0;
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
		switch(num){
		case 1: rombo();break;
		case 2: rombo();break;
		}
	
}
public static void main(String[] args) {
	eleccion();
}}