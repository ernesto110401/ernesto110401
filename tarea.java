import java.util.Arrays;
public class tarea
{
 public static void main( String [] args )
 {
  int asignaturas = 8, sum = 0, c2 = 0, c3 = 0, c4 = 0 , c5 = 0, may2 = 0, may3 = 0, may4 = 0;
  int nota = 0;
  int [] Notas;  //referencia
  Notas = new int [asignaturas];     //Longitud del arreglo y su creación  

  
  // Introducir las notas 
  for(int i = 0 ; i < asignaturas ; i++)
  {
   System.out.println("INTRODUZCA LA NOTA ");
    nota = Integer.parseInt(System.console().readLine());
    // Determinar si las notas están entre 2 y 5
    while (nota < 2 || nota >5) 
        {   System.out.println("INTRODUZCA UNA NOTA ENTRE 2 Y 5 ");
            nota = Integer.parseInt(System.console().readLine());
        }
   //Guardar las notas en el arreglo
   Notas[i] = nota;
   //Inicializar los contadores de notas , suma total (sum), y notas mayores
   
    switch (nota)
        { case 2: sum = sum + 2 ; c2 = c2 +1; break; 
          case 3: sum = sum + 3 ; c3 = c3 +1 ; may2 = may2 + 1; break;  
          case 4: sum = sum + 4 ; c4 = c4 +1 ; may2 = may2 + 1; may3 = may3 +1; break; 
          case 5: sum = sum + 5 ; c5 = c5 +1 ; may2 = may2 + 1; may3 = may3 +1; may4 = may4 +1; break; 	
        }
   }
  Arrays.sort(Notas);
 //Porciento de asignaturas aprobadas
 float aprob =c3 + c4 + c5 ;
 float p_aprob= (aprob * 100)/ asignaturas;
 System.out.println("El porciento de asignaturas aprobadas es " + p_aprob);
 //Promedio del alumno
 float prom = sum /asignaturas;
 System.out.println("El promedio del estudiante es de " + prom);
 // Valores mayores al promdedio
 if (prom >= 2 & prom < 3)
    { if (may2 == 1)
         {System.out.println("Hay 1 nota mayor que el promedio");
         }   
     else {System.out.println("Hay " + may2 +" notas mayores que el promedio");
          }
    }
 if (prom >= 3 & prom < 4)
    { if (may3 == 1)
         {System.out.println("Hay 1 nota mayor que el promedio");
         }   
     else {System.out.println("Hay " + may3 +" notas mayores que el promedio");
          }
    }
 if (prom >= 4 & prom < 5)
    { if (may4 == 1)
         {System.out.println("Hay 1 nota mayor que el promedio");
         }   
     else {System.out.println("Hay " + may4 +" notas mayores que el promedio");
          }
    } 
  if (prom == 5)
    { System.out.println("No hay notas mayores que el promedio");
    }       

  // La nota que más se repite
  if (c2 == 2 & c3 == 2 & c4 == 2 & c5 == 2)
     { System.out.println("Las notas que más se repiten son: 2;3;4;5");}
  else {
        int cont1=0, cont2=0, moda1 = 0, moda2 = 0;
  	     for (int j = 0 ; j < 8 ; j++){
             for (int k = 0; k < 8; k++){
	              if (Notas[j] == Notas[k] && j != k)
                   {cont1++;
                   }
                 }
             if (cont1>cont2){
                cont2 = cont1;
	             moda1 = Notas[j];
	             cont1 = 0;
                }
             if (cont1 == cont2){
                moda2 = Notas[j];
	             cont1 = 0;
	             }
             if (moda1 == moda2){
                moda2 = 0;
	             }
             cont1 = 0;
           }   
         if (moda2 == 0){
            System.out.println("La nota que más se repite es " + moda1);
            }    
         else{System.out.println("Las notas que más se repiten son " + moda1 + " y "+ moda2 );}
       }
  }
}