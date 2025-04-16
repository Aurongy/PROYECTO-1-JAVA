
package com.mycompany.proyecto1_7690_23_3711;

import java.util.Scanner;
public class PROYECTO1_7690_23_3711 {  
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int salida = 0;
        while (salida != 1){
            menu();
            try {
                opcion = entrada.nextInt();
            } catch (Exception e){
                System.out.println("Error de E/S: " + e);
            }
            switch (opcion) {
                case 1:
                    problema1();
                    break;
                case 2:
                    problema2();
                    break;
                case 3:
                    problema3();
                    break;
                case 4:
                    problema4();
                    break;
                case 5:
                    problema5();
                    break;
                case 6:
                    problema6();
                    break;
                case 7:
                    problema7();
                    break;
                case 8:
                    problema8();
                    break;
                case 9:
                    problema9();
                    break;
                case 10:
                    problema10();
                    break;
                case 11:
                    salida = 1;
                    break;    
            }
        }
    }
    public static void problema1(){
        char decision;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Este es el problema 1");     

            int i;
            int factorial = 1;
        
            System.out.println("Ingrese un numero para calcular en numero factorial");
            int n = entrada.nextInt();
        
            for(i = 1; i <= n; i ++){
                factorial = factorial * i;
            }        
            System.out.println("El factorial de: " + n + ", es: " + factorial);
        
        
            System.out.println("Desea realizar otra ejecucion Problema 1? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');      
    }
    public static void problema2(){
        char decision;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Este es el problema 2");

            Scanner numero = new Scanner(System.in);

            System.out.println("Cuantos numeros deese ingresar?");
            int num = numero.nextInt();
            int A;
            int neG = 0;
            int poS = 0;
            int ceRo = 0;
            int i;
            int par = 0;
            int imPar = 0;
            for (i = 1; i <= num; i++){        
                System.out.println("Ingrese el numero " + i);
                A = numero.nextInt();
                if(A > 0){
                    poS++;
                }if(A< 0){
                    neG++; 
                }if (A ==0){
                    ceRo++;
                }
                if(A % 2 ==0){
                    par++;
                }else{
                    imPar++;
                }
            }
            System.out.println("numeros negativos: " + neG);
            System.out.println("numeros positivos: " + poS);
            System.out.println("Cantidad de cero: " + ceRo);
            System.out.println("numero par: " + par);
            System.out.println("numero impar: " + imPar);
        
        
            System.out.println("Desea realizar otra ejecucion Problema 2? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');        
    }
    public static void problema3(){
        char decision;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Este es el problema 3");
            int opc;

            System.out.println("|      Sector         | Costo de la entrada |");
            System.out.println("|_____________________|_____________________|");
            System.out.println("|1. Sol Candente      | Q. 35               |");
            System.out.println("|2. Sol Luminoso      | Q. 55               |");
            System.out.println("|3. Sombrita          | Q. 80               |");
            System.out.println("|4. Tribunita         | Q. 150              |");
            System.out.println("|5. Silla Plastica    | Q. 200              |");
            System.out.println("|6. Salir             |");
            System.out.println("Seleccione una opcion: ");
            opc = entrada.nextInt();

            switch(opc){
                case 1:
                    int entra1;
                    int totOp1;
                    double pagTarj1;
                    double total1;
                    System.out.println("|1. Sol Candente      |   Q. 35             |");
                    System.out.println("Cuantas entradas necesita?");
                    entra1 = entrada.nextInt();

                    totOp1 = entra1 * 35;

                    System.out.println("TOTAL A PAGAR:" + " Q. "+totOp1 );
                    System.out.println(" ");
                    System.out.println("FORMAS DE PAGO: ");
                    System.out.println("1. PAGO EN EFECTIVO ");
                    System.out.println("2. PAGO CON TARJETA (TIENE UN RECARGO DE 5%)");
                    int pago1 = entrada.nextInt();

                    switch(pago1){
                        case 1:
                            System.out.println("1. PAGO EN EFECTIVO");
                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. "+ totOp1);
                            break;
                        case 2:
                            System.out.println("2. PAGO CON TARJETA CON REGARGO DE 5%");
                            System.out.println(" ");
                            pagTarj1 = totOp1 * 0.05;
                            total1 = totOp1 + pagTarj1;

                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. " + total1);
                            break;
                    }

                    break;
                case 2:
                    int totOp2;
                    int entra2;
                    double total2;
                    double pagTarj2;

                    System.out.println("|2. Sol Luminoso      |   Q. 55             |");
                    System.out.println("Cuantas entradas necesita?");
                    entra2 = entrada.nextInt();

                    totOp2 = entra2 * 55;

                    System.out.println("TOTAL A PAGAR:" + " Q. "+totOp2 );
                    System.out.println(" ");
                    System.out.println("FORMAS DE PAGO: ");
                    System.out.println("1. PAGO EN EFECTIVO ");
                    System.out.println("2. PAGO CON TARJETA (TIENE UN RECARGO DE 5%)");
                    int pago2 = entrada.nextInt();

                    switch(pago2){
                        case 1:
                            System.out.println("1. PAGO EN EFECTIVO");
                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. "+ totOp2);
                            break;
                        case 2:
                            System.out.println("2. PAGO CON TARJETA CON REGARGO DE 5%");
                            System.out.println(" ");
                            pagTarj2 = totOp2 * 0.05;
                            total2 = totOp2 + pagTarj2;

                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. " + total2);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("|3. Sombrita          |   Q. 80             |");
                    int totOp3;
                    int entra3;
                    double total3;
                    double pagTarj3;

                    System.out.println("Cuantas entradas necesita?");
                    entra3 = entrada.nextInt();

                    totOp3 = entra3 * 80;

                    System.out.println("TOTAL A PAGAR:" + " Q. "+totOp3 );
                    System.out.println(" ");
                    System.out.println("FORMAS DE PAGO: ");
                    System.out.println("1. PAGO EN EFECTIVO ");
                    System.out.println("2. PAGO CON TARJETA (TIENE UN RECARGO DE 5%)");
                    int pago3 = entrada.nextInt();

                    switch(pago3){
                        case 1:
                            System.out.println("1. PAGO EN EFECTIVO");
                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. "+ totOp3);
                            break;
                        case 2:
                            System.out.println("2. PAGO CON TARJETA CON REGARGO DE 5%");
                            System.out.println(" ");
                            pagTarj3 = totOp3 * 0.05;
                            total3 = totOp3 + pagTarj3;

                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. " + total3);
                            break;
                    }                
                    break;
                case 4:
                    System.out.println("|4. Tribunita         |   Q. 150            |");
                    int totOp4;
                    int entra4;
                    double total4;
                    double pagTarj4;

                    System.out.println("Cuantas entradas necesita?");
                    entra4 = entrada.nextInt();

                    totOp4 = entra4 * 150;

                    System.out.println("TOTAL A PAGAR:" + " Q. "+totOp4 );
                    System.out.println(" ");
                    System.out.println("FORMAS DE PAGO: ");
                    System.out.println("1. PAGO EN EFECTIVO ");
                    System.out.println("2. PAGO CON TARJETA (TIENE UN RECARGO DE 5%)");
                    int pago4 = entrada.nextInt();

                    switch(pago4){
                        case 1:
                            System.out.println("1. PAGO EN EFECTIVO");
                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. "+ totOp4);
                            break;
                        case 2:
                            System.out.println("2. PAGO CON TARJETA CON REGARGO DE 5%");
                            System.out.println(" ");
                            pagTarj4 = totOp4 * 0.05;
                            total4 = totOp4 + pagTarj4;

                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. " + total4);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("|5. Silla Plastica    |   Q. 200            |");
                    int totOp5;
                    int entra5;
                    double total5;
                    double pagTarj5;

                    System.out.println("Cuantas entradas necesita?");
                    entra5 = entrada.nextInt();

                    totOp5 = entra5 * 200;

                    System.out.println("TOTAL A PAGAR:" + " Q. "+totOp5 );
                    System.out.println(" ");
                    System.out.println("FORMAS DE PAGO: ");
                    System.out.println("1. PAGO EN EFECTIVO ");
                    System.out.println("2. PAGO CON TARJETA (TIENE UN RECARGO DE 5%)");
                    int pago5 = entrada.nextInt();

                    switch(pago5){
                        case 1:
                            System.out.println("1. PAGO EN EFECTIVO");
                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. "+ totOp5);
                            break;
                        case 2:
                            System.out.println("2. PAGO CON TARJETA CON REGARGO DE 5%");
                            System.out.println(" ");
                            pagTarj5 = totOp5 * 0.05;
                            total5 = totOp5 + pagTarj5;

                            System.out.println("PAGO REALIZADO CON EXITO " +" Q. " + total5);
                            break;
                    }
                    break;

                case 6:
                    break;     
            }
        
            System.out.println("Desea realizar otra ejecucion Problema 3? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');        
    }
    public static void problema4(){
        char decision;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Este es el problema 4");

            int i;
            for(i = 1; i <= 100; i ++){

                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("Programacion I");

                }else if (i % 3 == 0){
                    System.out.println("Progra");
                }else if (i % 5 == 0){

                    System.out.println("macion");

                }else{
                    System.out.println(i);
                }
            }
            System.out.println("Desea realizar otra ejecucion Problema 4? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');        
    }
    public static void problema5(){
        char decision;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Este es el problema 5");

            double SalarioBase;
            double RedondearSalarioBase;
            double TarifaIncrementada;
            double PagHoraExt;
            double RedondearHorasExt;
            double RedondeoIGSS;
            double RedondeoISR;

            System.out.println("Ingrese las horas laboradas en total: ");
            int HorasTraba = entrada.nextInt();

            System.out.println("Ingrese la Tarifa por hora (en Quetzales): ");
            double Tarifa = entrada.nextDouble();

            System.out.println("Ingrese la cantidad de horas extras laboradas: ");
            int HorasExt = entrada.nextInt();

            double BonificacionIncentivo = 250;
            double DescuentoIgss;
            double DescuentoIsr;

            if (HorasTraba >= 40){
                TarifaIncrementada = Tarifa * 1.5;
                PagHoraExt = TarifaIncrementada * HorasExt;
            }else{
                PagHoraExt = HorasExt * Tarifa;
            }
                SalarioBase = HorasTraba * Tarifa;
                RedondearSalarioBase = Math.round(SalarioBase * 100.0)/100.0;
                RedondearHorasExt = Math.round(PagHoraExt * 100.0)/100.0;
                DescuentoIgss = RedondearSalarioBase * 0.0483;
                RedondeoIGSS = Math.round(DescuentoIgss * 100.0)/100.0;
                DescuentoIsr = RedondearSalarioBase * 0.05;
                RedondeoISR = Math.round(DescuentoIsr * 100.0)/100.0;

                System.out.println("__________________________________________________________");
                System.out.println(" ");
                System.out.println("                       ASIGNACIONES                       ");
                System.out.println("|Sueldo Base                               |" + "  Q. " + RedondearSalarioBase);
                System.out.println("|Bonificacion de Incentivo (Decreto 78-89) |" + "  Q. " + BonificacionIncentivo);
                System.out.println("|TOTAL DE ASIGNACIONES.....................|" + "  Q. " + (RedondearSalarioBase + BonificacionIncentivo));
                System.out.println("                        DESCUENTOS                        ");
                System.out.println("|Descuento de IGGS (4.83%)                 |" + "  Q. " + RedondeoIGSS);
                System.out.println("|Descuento de ISR (5%)                     |" + "  Q. " + RedondeoISR);
                System.out.println("|TOTAL DE DESCUENTOS.......................|" + "  Q. " + (RedondeoIGSS + RedondeoISR));         
                System.out.println(" ");
                System.out.println("|SUELDO TOTAL..............................|" + "  Q. " + ((RedondearSalarioBase + BonificacionIncentivo)-(RedondeoIGSS + RedondeoISR)));
                System.out.println("__________________________________________________________");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("__________________________________________________________");
                System.out.println("");
                System.out.println("|TOTAL DE HORAS EXTRAS.....................|" + "  Q. " + RedondearHorasExt);
                System.out.println("__________________________________________________________");
        
            System.out.println("Desea realizar otra ejecucion Problema 5? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');        
    }
    public static void problema6(){
        char decision;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Este es el problema 6");

            double Peso;
            int i, edad;
            double SumaPeso = 0, SumaPeso1 = 0, SumaPeso2 = 0, SumaPeso3 = 0;
            int Contador = 0, Contador1 = 0, Contador2 = 0, Contador3 = 0;

            System.out.println("Cuantas personas encuestadas? ");
            int CantPers = entrada.nextInt();

            for (i = 1; i <= CantPers; i ++){

                System.out.println("________________________________________");
                System.out.println("Ingrese la edad de la persona No. " + i);
                edad = entrada.nextInt();

                System.out.println("El peso de la persona (EN LIBRAS): ");
                Peso = entrada.nextDouble();

                if(edad >= 0 && edad <= 12){
                    SumaPeso += Peso;
                    Contador ++;

                }else if(edad >= 13 && edad <= 29){
                    SumaPeso1 += Peso;
                    Contador1 ++;

                }else if(edad >= 30 && edad <= 59){
                    SumaPeso2 += Peso;
                    Contador2 ++;

                }else if(edad >= 60 && edad <= 100){
                    SumaPeso3 += Peso;
                    Contador3 ++;
                } else {
                    System.out.println("Edad fuera de rango permitido (0-100)");
                }
            }   
            System.out.println("I. Promedio peso niños de 0 a 12 años es de:                " + (Contador > 0 ? (SumaPeso/Contador): "No se registraron niños"));
            System.out.println("II. Promedio peso jovenes de 13 a 29 años es de:            " + (Contador1 > 0 ? (SumaPeso1/Contador1): "No se registraron jovenes"));
            System.out.println("III. Promedio peso adultos de 30 a 59 años es de:           " + (Contador2 > 0 ? (SumaPeso2/Contador2): "No se registraron adultos"));
            System.out.println("IV. Promedio peso adultos mayores de 60 a 100 años es de:   " + (Contador3 > 0 ? (SumaPeso3/Contador3): "No se registraron aultos mayores"));

            System.out.println("Desea realizar otra ejecucion Problema 6? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');        
    }
    public static void problema7(){
            char decision;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Este es el problema 7");
            
        do{
            System.out.println("Ingrese el Numero de Filas: ");
            int filas = entrada.nextInt();
            System.out.println("Ingrese el Numero de Columnas: ");
            int columnas = entrada.nextInt();
            
            Problema7 m1 = new Problema7(filas, columnas);
            m1.leer();
            
            Problema7 m2 = new Problema7(m1);
            
            System.out.println("Matriz m1: ");
            m1.imprimir();
            
            System.out.println("Matriz m2");
            m2.imprimir();
            
            Problema7 m3 = m1.sumar(m2);
            System.out.println("Matriz m3 (m1 + m2):");
            m3.imprimir();
            
            double max = m3.encontrar();
            System.out.printf("Valor máximo en m3: %.2f\n", max);
            
            System.out.println("Desea realizar otra ejecucion Problema 7? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');
          
    }
    public static void problema8(){
        char decision;
        Scanner entrada = new Scanner(System.in);
        do{
            
            System.out.println("Este es el problema 8");

            int menu;
            System.out.println(" ");
            System.out.println("|------------------------|");
            System.out.println("|    MENU DE OPCIONES    |");
            System.out.println("|------------------------|");
            System.out.println("| 1. Multiplicacion      |");
            System.out.println("| 2. Division            |");
            System.out.println("| 3. Salir               |");
            System.out.println("|------------------------|");
            System.out.println(" ");
            System.out.println("Seleccione una opcion: ");
            menu = entrada.nextInt();

            int a;
            int b;

            switch(menu){
                case 1:

                    int suma = 0;

                    System.out.println("Ingrese dos numeros naturales: ");
                    a = entrada.nextInt();
                    b = entrada.nextInt();

                    if (a <= b){

                        for(int i = 0; i < b; i++){
                            suma = suma + a;
                            }

                    }else if (b <= a){

                            for(int i = 0; i < a; i++){
                                suma = suma + b;
                            }
                    }
                    System.out.println("El multiplo de " + a +" por " + b + " es: " + suma);

                    break;
                case 2:

                    System.out.println("Ingrese dos numeros naturales: ");
                    a = entrada.nextInt();
                    b = entrada.nextInt();

                    int contador = 0;

                    if (b == 0) {
                    System.out.println("No se puede dividir entre cero.");
                    return;
                    }else if(a >= b){

                        int valor = a;
                        int valor1 = b;

                        while( a >= b){
                            a = a -b;
                            contador++;
                        }
                        System.out.println("Dividendo: " + valor);
                        System.out.println("Divisor: " + valor1);
                        System.out.println("Cociente: " + contador);
                        System.out.println("Residuo: " + a);

                    }else if(b >= a){
                        int valor = b;
                        int valor1 = a;                    

                        while( b >= a){
                            b = b - a;
                            contador++;
                            }
                        System.out.println("Dividendo: " + valor);
                        System.out.println("Divisor: " + valor1);
                        System.out.println("Cociente: " + contador);
                        System.out.println("Residuo: " + b); 
                    }
                case 3:
                    break;
            }

            System.out.println("Desea realizar otra ejecucion Problema 8? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');        
    }
    public static void problema9(){
        char decision;
         Scanner entrada = new Scanner(System.in);
         
        do{
            System.out.println("Este es el problema 9");
            int primeParcial;
            int segunParcial;
            int zonaAcumula;
            int examenFinal;
            int notaFinal;
            
            System.out.println("Seleccione ENTER para continuar");
            String continuar = entrada.nextLine();
            
            System.out.println("Numero Carnet del Alumno: ");
            String carne = entrada.nextLine();
            
            System.out.println("Nombre del Alumno: ");
            String nomAlumno = entrada.nextLine();
          
            System.out.println("Ingrese la nota del Primer Parcial (VALOR 10 PUNTOS): ");
            primeParcial = entrada.nextInt();
            
            do{
                if(primeParcial < 0){
                    System.out.println("La nota no puede ser negativo. Intente de nuevo!");
                    primeParcial = entrada.nextInt();
                }else if(primeParcial > 10){
                    System.out.println("La nota no puede ser mayor que 10. Intente de nuevo!");
                    primeParcial = entrada.nextInt();
                }else if (primeParcial <=10){
                    break;
                }
            }while(primeParcial < 0 ||primeParcial > 10);

            System.out.println("Ingrese la nota del Segundo Parcial (VALOR 20 PUNTOS): ");
            segunParcial = entrada.nextInt();
            
            do{
                if(segunParcial < 0){
                    System.out.println("La nota no puede ser negativo. Intente de nuevo!");
                    segunParcial = entrada.nextInt();
                }else if(segunParcial > 20){
                    System.out.println("La nota no puede ser mayor que 20. Intente de nuevo!");
                    segunParcial = entrada.nextInt();
                }else if (segunParcial <=20){
                    break;
                }
            }while(segunParcial < 0 ||segunParcial > 20);            
            
            System.out.println("Ingrese la Zona Acumulado (VALOR 20 PUNTOS)");
            zonaAcumula = entrada.nextInt();
            
            do{
                if(zonaAcumula < 0){
                    System.out.println("La zona no puede ser negativo. Intente de nuevo!");
                    zonaAcumula = entrada.nextInt();
                }else if(zonaAcumula > 20){
                    System.out.println("La zona no puede ser mayor que 20. Intente de nuevo!");
                    zonaAcumula = entrada.nextInt();
                }else if (zonaAcumula <=20){
                    break;
                }
            }while(zonaAcumula < 0 ||zonaAcumula > 20);            
           
            System.out.println("Ingrese la nota del Examen Final (VALOR 50 PUNTOS): ");
            examenFinal = entrada.nextInt();
            
            do{
                if(examenFinal < 0){
                    System.out.println("La nota no puede ser negativo. Intente de nuevo!");
                    examenFinal = entrada.nextInt();
                }else if(examenFinal > 50){
                    System.out.println("La nota no puede ser mayor que 50. Intente de nuevo!");
                    examenFinal = entrada.nextInt();
                }else if (examenFinal <=50){
                    break;
                }
            }while(examenFinal < 0 ||examenFinal > 50);

            notaFinal = (primeParcial + segunParcial + zonaAcumula + examenFinal);
            System.out.println(" ");
            System.out.println("---------------------DATOS DEL ALUMNO---------------------");
            System.out.println("- Numero Carnet del Alumno    |  " + carne);
            System.out.println("- Nombre del Alumno           |  " + nomAlumno);
            System.out.println("- Nota Primer Parcial         |  " + primeParcial);
            System.out.println("- Nota Segundo Parcial        |  " + segunParcial);
            System.out.println("- Zona Aculado                |  " + zonaAcumula);
            System.out.println("- Examen Final                |  " + examenFinal);
            System.out.println("- NOTA FINAL                  |  " + notaFinal);
            System.out.println(" ");
            System.out.println("-----------RESUMEN-----------");
            
            if(notaFinal >= 61){
                System.out.println("   APROBADO: " + notaFinal +" PUNTOS");
            }else if(notaFinal <= 60 ){
                System.out.println("  REPROBADO: " + notaFinal +" PUNTOS");
            }
            if(notaFinal <= 49){
                System.out.println("  CATEGORIA: MALO ");
            }else if(notaFinal >= 50 && notaFinal <= 69){
                System.out.println("  CATEGORIA: REGULAR ");
            }else if(notaFinal >= 70 && notaFinal <= 89){
                System.out.println("  CATEGORIA: BUENO ");
            }else if(notaFinal >= 90 && notaFinal <= 100){
                System.out.println("  CATEGORIA: EXCELENTE ");
            }
            System.out.println("Desea realizar otra ejecucion Problema 9? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');   

    }
    public static void problema10(){
        char decision;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Este es el problema 10");
            System.out.println(" ");
        
            String Nit;
            String Nombre;
            String Direccion;
            
            System.out.println("Ingrese su numero de NIT:");
            Nit = entrada.nextLine();
        
            System.out.println("Ingrese su Nombre: ");
            Nombre = entrada.nextLine();
        
            System.out.println("Ingrese su Direccion Particular: ");
            Direccion = entrada.nextLine();
            
            System.out.println(" ");
            System.out.println("                MENU DE PIZZA            ");
            System.out.println("|------------------------|----------------|");
            System.out.println("|     DESCRIPCION        |     PRECIO     |");
            System.out.println("|------------------------|----------------|");
            System.out.println("| 1. PIZZA PEQUENIA      |  Q. 35.00      |");
            System.out.println("| 2. PIZZA MEDIANA       |  Q. 63.50      |");
            System.out.println("| 3. PIZZA GRANDE        |  Q. 95.30      |");
            System.out.println("|------------------------|----------------|");
            System.out.println(" ");
            System.out.println("Cuantas Pizzas desea comprar ?");
            int cantPizza = entrada.nextInt();
            
            double pizza;
            double subTotal = 0;
            double redondeoSubtotal = 0;
            
            for(int i = 1; i <= cantPizza; i ++){
                System.out.println("Seleccione el tipo de Pizza No. " + i);
                pizza = entrada.nextInt();
                if(pizza==1){
                    pizza = 35.00;
                }else if(pizza==2){
                    pizza = 63.50;                   
                }else if(pizza ==3){
                    pizza = 95.30;

                }else if(pizza <0 && pizza >3){
                    System.out.println("Dato incorrecto!");
                    break;
                }
                subTotal += pizza;
                redondeoSubtotal = Math.round(subTotal * 100.0)/100.0;
               System.out.println("Subtotal de: " + redondeoSubtotal);
            }
            System.out.println(" ");
            System.out.println("               MENU DE BEBIDAS              ");
            System.out.println("|------------------------|----------------|");
            System.out.println("|     DESCRIPCION        |     PRECIO     |");
            System.out.println("|------------------------|----------------|");
            System.out.println("| 1. BEBIDA PEQUENIA     |  Q. 12.40      |");
            System.out.println("| 2. BEBIDA GRANDE       |  Q. 14.20      |");
            System.out.println("|------------------------|----------------|");
            System.out.println(" ");
            
            System.out.println("Cuantas Bebidas desea aniadir?");
            int cantBebid = entrada.nextInt();
            double bebidas;
            
            for(int i = 1; i <= cantBebid; i ++){
                System.out.println("Seleccione el tipo de Bebida No. " + i);
                bebidas = entrada.nextInt();
                if(bebidas==1){
                    bebidas = 12.40;
                }else if(bebidas==2){
                    bebidas = 14.20;                   
                }else if(bebidas <0 && bebidas >3){
                    System.out.println("Dato incorrecto!");
                    break;
                }
                subTotal += bebidas;
                redondeoSubtotal = Math.round(subTotal * 100.0)/100.0;
               System.out.println("Subtotal de: " + redondeoSubtotal);
            }
            System.out.println(" ");
            System.out.println("                MENU DE POSTRE          ");
            System.out.println("|------------------------|----------------|");
            System.out.println("|     DESCRIPCION        |     PRECIO     |");
            System.out.println("|------------------------|----------------|");
            System.out.println("| 1. POSTRE 1            |  Q. 15.00      |");
            System.out.println("| 2. POSTRE 2            |  Q. 16.30      |");
            System.out.println("|------------------------|----------------|");
            System.out.println(" ");
            
            System.out.println("Cuantas Postres desea aniadir?");
            int cantPostre = entrada.nextInt();            
            double postre;
            
            for(int i = 1; i <= cantPostre; i ++){
                System.out.println("Seleccione el tipo de Postre No. " + i);
                postre = entrada.nextInt();
                if(postre == 1){
                    postre = 15.00;
                }else if(postre == 2){
                    postre = 16.30;                   
                }else if(postre <0 && postre > 3){
                    System.out.println("Dato incorrecto!");
                    break;
                }
                subTotal += postre;
                redondeoSubtotal = Math.round(subTotal * 100.0)/100.0;
               System.out.println("Subtotal de: " + redondeoSubtotal);
            }
            double total;
            double descuento = 0;
            double redondeoDesc = 0;
            
            System.out.println("                   DESTALLES DE LA COMPRA           ");
            System.out.println(" ");
            System.out.println("|                         NIT:  " + Nit);
            System.out.println("|                      Nombre:  " + Nombre);
            System.out.println("|        Direccion Particular:  " + Direccion);            

            if(subTotal>=200){
                descuento = subTotal * 0.05;
                redondeoDesc = Math.round(descuento* 100.0)/100.0;
                total = subTotal - descuento;
                double redondeoTotal = Math.round(total * 100.0)/100.0;
                System.out.println("|                    Subtotal:  " + subTotal);
                System.out.println("|     Subtotal Descuento (5%):  " + redondeoTotal);
            }else{
                total = subTotal;
                System.out.println("|                    Subtotal:  " + subTotal);
            }
            
            double redondeoTotal = Math.round(total * 100.0)/100.0;
            double desIVA = redondeoTotal * 0.12;
            double redondeoIVA = Math.round(desIVA * 100.0)/100.0;
            double totalFinal = redondeoTotal + redondeoIVA;
            double Redondeototal = Math.round(totalFinal * 100.0)/100.0;

            System.out.println("|                    Descuento:  " + redondeoDesc);
            System.out.println("|      Descuento de IVA (12%):  " + redondeoIVA);
            System.out.println("|               TOTAL A PAGAR:  " + Redondeototal);
            System.out.println(" ");
            
            System.out.println("Desea realizar otra ejecucion Problema 10? Seleccione (Y)");
            decision = entrada.next().toUpperCase().charAt(0);
        }while (decision == 'Y');        
    }
    public static void problema11(){
    }
    
    public static void menu(){
        System.out.println("Menu proyecto 1 individual 2025");
        System.out.println("1. Problema 1");
        System.out.println("2. Problema 2");
        System.out.println("3. Problema 3");
        System.out.println("4. Problema 4");
        System.out.println("5. Problema 5");
        System.out.println("6. Problema 6");
        System.out.println("7. Problema 7");
        System.out.println("8. Problema 8");
        System.out.println("9. Problema 9");
        System.out.println("10. Problema 10");
        System.out.println("11. Salir");
        System.out.println("Ingresar opcion: ");
    }
}