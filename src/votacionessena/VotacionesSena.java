/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votacionessena;

/**
 * Desarrolle algoritmo que permita simular las elecciones del SENA donde hay 5 candidatos
 * en la representación de los aprendices Y existen 7 sedes del sena
 * El algoritmo debe decir: 
 * cual es el candidato ganador y la cantidad de votos = 
 * Debe decir : que candidato saco la mayor cantidad de votos en una sede = DONE
 * Debe decir: que candidato saco la menor cantidad de votos En una sede = DONE 
 * Debe decir: Cuantos candidatos ESTÁN POR ENCIMA DEL PROMEDIO DE VOTOS y CUANTOS ESTÁN POR DEBAJO
 * PARA SIMULAR LOS VOTOS UTILICE EL MÉTODO RANDOM DONDE TENGA UN ESTIMADO DE MINIMO 10 Y MÁXIMO 1000 VOTOS X SEDE 
 * @author alejandro ceron delgado
 */
public class VotacionesSena {

    public static void main(String[] args) {
        
        int votos [][] = new int [5][7];
        //Filas
        int valores = 0;
        int valorMayor = 0;
        //Mostrar dato
        String candidatosArr[] = new String[5];
        String candidatos = "";
        String cantidadVotos = "";
        

        
        System.out.println(candidatos);
            
        for(int f=0;f<votos.length;f++){
            //Columnas
            for(int c=0;c<votos[0].length;c++){
                
                
                //Ciclo que permite guardar los números solo si son mayores a 10
                while(true){
                
                    valores = (int) (Math.random()*4);
                    if(valores > 1){
                        votos[f][c] = valores;
                        break;
                    }
                    
                }
                
            
            }
        }
        


        int valorCeroCero = votos[0][0];
        int valorMenor = votos[0][0];
        
        //Calcular mayor y menor
        for(int j=0;j<votos.length;j++){
            for(int k = 0;k<votos[0].length;k++){
                //Mayor votos
                if(votos[j][k] > valorCeroCero){
                    valorCeroCero = votos[j][k];
                }
                //Menor votos
                if(votos[j][k] < valorMenor){
                    valorMenor = votos[j][k];
                }
            }
        }
        

        //Promedio 
        int promedio[] = new int[7];
        int sumar = 0;
        //Filas
        for(int j = 0;j<promedio.length;j++){
            //Columnas
            sumar = 0;
            for(int k = 0;k<votos.length;k++){
                sumar+= votos[k][j];
                promedio[j] = sumar;
            }
            //System.out.println("valor de suma"+(j)+" "+sumar);
            //sumar = 0;
        }
        
        //Mostrar promedio
        for(int j = 0;j<promedio.length;j++){
            System.out.println("valor de suma"+(j)+" "+promedio[j]);
        
        }
        


        //Mostrar votos
        for(int f=0;f<votos.length;f++){
           //Columnas = coloco 0 para poder mostrar las columnas
           for(int c=0;c<votos[0].length;c++){
               
               System.out.print(" "+votos[f][c]);
               
            }
           System.out.println();
        }
        //System.out.println("\n"+"El valor mayor de la matriz es:"+valorCeroCero);
        //System.out.println("El valor menor de la matriz es:"+valorMenor+"\n");
    }
    
}