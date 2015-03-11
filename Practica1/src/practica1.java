import java.util.Scanner;


public class practica1 {

	
		 public static void menu() {
			 	System.out.println("Ingrese el numero del programa a ejecutar");
		        System.out.println("\t1. Rombo");
		        System.out.println("\t2. Promedio de notas");
		        System.out.println("\t3. Convertir la Hora");
		        System.out.println("\t4. Hacer medidas de circulo triangulo o cuadrado");
		        System.out.println("\t5. Diferencia entre fechas");
		        System.out.println("\t6. Mini calculadora");
		        System.out.println("\t7. Tablas de multiplicar");
		        System.out.println("\t8. Rangos");
		        System.out.println("\t9. Conversión de numeros de arabigos a romanos");
		        System.out.println("\t10. Piramide de numeros");
		        System.out.println("\t11. Numero mayo o menor de la lista");
		        System.out.println("\t12. Cadena de asteriscos");
		        System.out.println("\t13. Encontrar la letra del abecedario");
		        System.out.println("\t14. Cuadrado de asteriscos");
		        System.out.println("\t15. Total de numeros primos en un rango");
		
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

public static void hora(){

	/*String c;
	int a=0,b=0;
	System.out.println("Ingrese hora");
	Scanner s=new Scanner(System.in);
	c=s.nextLine();
	a=Integer.parseInt( 
			c.substring(0, c.indexOf(":"))); 
			b=Integer.parseInt( 
			c.substring 
			(c.indexOf(":")+1,c.length() ));
	int a,b;
	System.out.println("Ingrese hora");
	Scanner s=new Scanner(System.in);*/
}

public static void figuras(){
	int a;
	char letra; 
	System.out.println("Ingrese el tamano del lado del trianulo o cuadrado o del radio del circulo");
	Scanner s=new Scanner(System.in);
		a=s.nextInt();
	System.out.println("Ingrese C para un circulo, U para un cuadrado ó T para un triangulo");
	letra=s.next().charAt(0);
			if (letra=='c')
				System.out.println("El radio es:"+(a)+" el area es:"+(a*a*Math.PI)+" El perimetro es:"+(2*Math.PI*a));
			
			else if(letra=='t')
				System.out.println("El tamano del lado es:"+(a)+" el area es:"+((a/2)*(0.866*a/2))+" El perimetro es:"+(3*a));
			
			else if (letra=='u')
				System.out.println("El tamano del lado es:"+(a)+" el area es:"+(a*a)+" El perimetro es:"+(4*a));
					
			
}
public static void calculadora(){
	int a,b;
	char letra; 
	System.out.println("ingrese 2 numeros");
	Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	System.out.println("Ingrese s para sumar, r para restar,m para multiplicar o d para dividir");
	letra=s.next().charAt(0);
	if (letra=='s')
		System.out.println("La suma es:"+(a+b));
	
	else if(letra=='r')
		System.out.println("La resta es:"+(a-b));
	
	else if (letra=='m')
		System.out.println("La multiplicacion es:"+(a*b));
	else if (letra=='d')
		System.out.println("La divicion es:"+(a/b));
}

public static void tabla(){
	int a,numero,resultado;
	System.out.println("Ingrese un numero para mostrar su tabla de multiplicar");
	Scanner s=new Scanner (System.in);
	numero=s.nextInt();
		for(a=10;a>0;a--){
			resultado=a*numero;
			System.out.println(numero+"x"+a+"="+resultado);
		}
		System.out.println();
}
public static void main(String[] args) {
	menu();
	int num=0;
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
		switch(num){
		case 1: rombo();break;
		case 2: promedio();break;
		case 3: hora();break;
		case 4: figuras();break;
		case 6: calculadora();break;
		case 7: tabla();break;
		}
}}