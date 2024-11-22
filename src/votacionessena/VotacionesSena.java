/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votacionessena;

/**
 * Desarrolle algoritmo que permita simular las elecciones del SENA donde hay 5 candidatos
 * en la representación de los aprendices Y existen 7 sedes del sena
 * El algoritmo debe decir: 
 * cual es el candidato ganador y la cantidad de votos = DONE
 * Debe decir : que candidato saco la mayor cantidad de votos en una sede = DONE
 * Debe decir: que candidato saco la menor cantidad de votos En una sede = DONE 
 * Debe decir: Cuantos candidatos ESTÁN POR ENCIMA DEL PROMEDIO DE VOTOS y CUANTOS ESTÁN POR DEBAJO = DONE
 * PARA SIMULAR LOS VOTOS UTILICE EL MÉTODO RANDOM DONDE TENGA UN ESTIMADO DE MINIMO 10 Y MÁXIMO 1000 VOTOS X SEDE = DONE
 * @author alejandro ceron delgado
 */
public class VotacionesSena {

    public static void main(String[] args) {
        
        int votos [][] = new int [5][7];
        //Filas
        int valores = 0;
        //Mostrar dato
        int sumar = 0;
        int promedios = 0;
        int filas = votos.length;
        int columnas = votos[0].length;
        int promedio[] = new int[filas];
        int totalPromedio = 0;
        int contadorPromedio = 0;
        int valorMayor = votos[0][0];
        int valorMenor = 10000;
        int promedioMenor = 0;
        int promedioMayor = 0;
        int candidatoGanador = promedio[0];
        int posicionCandidatoGanador = 0;
        
        //Insertar datos aleatorios en la matriz
        for(int f=0;f<votos.length;f++){
            //Columnas
            for(int c=0;c<votos[0].length;c++){
                
                //Ciclo que permite guardar los números solo si son mayores a 10
                while(true){
                
                    valores = (int) (Math.random()*1000);
                    if(valores > 10){
                        votos[f][c] = valores;
                        
                        break;
                    } 
                }
            
            }
        }
        
        
        //Mostrar votos
        System.out.println("Cantidad de votos:"+"\n");
        for(int f=0;f<votos.length;f++){
           //Columnas = coloco 0 para poder mostrar las columnas
           System.out.print("Candidato: #"+(f+1)+"- ");
           for(int c=0;c<votos[0].length;c++){
               
               System.out.print(votos[f][c]+" ");
               
            }
           System.out.println(""+"\n");
        }
        
        
        //Calcular mayor y menor
        for(int f=0;f<votos.length;f++){
            for(int c = 0;c<votos.length;c++){
                //Mayor votos
                if(votos[f][c] > valorMayor){
                    valorMayor = votos[f][c];
                }
                if(votos[f][c] < valorMenor){
                    valorMenor = votos[f][c];
                }
            }
        }
        
        
        System.out.println("\n"+"""
                           Mayor cantidad de votos totales: """+valorMayor+"\n"+
                            """
                           Menor cantidad de votos totales: """+valorMenor+"\n");

        
        
        //Calcular promedio Filas
        for(int j = 0;j<filas;j++){
            //Columnas
            for(int k = 0;k<columnas;k++){
                sumar+= votos[j][k];
                promedio[j] = (sumar/7);
                
            }
            sumar = 0;
        }
        
        //Mostrar promedio
        System.out.println("*************************"+"\n");
        System.out.println("VALOR DEL PROMEDIO");
        System.out.println("Se suma los centros y se divide sobre el número de centros");
        System.out.println("Se extrae el promedio de los votantes para determinar ");
        System.out.println("la cantidad de votos mayores y menores al promedio"+"\n");
        
        System.out.println("*************************"+"\n");
        
        for(int j = 0;j<promedio.length;j++){
            System.out.println("Promedio del candidato #"+(j+1)+" "+promedio[j]);
        
        }
        
        System.out.println("\n"+"*************************");
        
        //Calcular mayor Promedio y candidato ganador
        for(int j = 0;j<promedio.length;j++){
            promedios += promedio[j];
            if(promedio[j] > candidatoGanador){
                candidatoGanador = promedio[j];
                posicionCandidatoGanador = j;
            }
            
        }
        System.out.println("Candidato ganador #"+(posicionCandidatoGanador+1)+" "+"Cantidad de votos por promedio:"+candidatoGanador);
        
        System.out.println("*************************");
        
        
        totalPromedio = promedios / 5;
        
        //Calcular ganador
        while(contadorPromedio < promedio.length){
                
            if(totalPromedio < promedio[contadorPromedio]){
                promedioMayor++;

            }else{
                promedioMenor++;
            }

            contadorPromedio++; 
        }

        System.out.println("Cantidad de valores menores al promedio"+promedioMenor);
        System.out.println("Cantidad de valores mayores al promedio"+promedioMayor);
        System.out.println("*************************");

    }
    
}
