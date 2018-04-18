/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josueamaya;

import javax.swing.JOptionPane;

/**
 *nombre josueAmaya
 * version 1.0
 * fecha 18-04-18
 * Copyright at.josue
 * @author Laboratorio2
 */
public class JosueAmaya {

    
    public static void main(String[] args) {
        
        int nTrabajadores=0;
        // para las posiciones
        int a=0;
        
         JOptionPane.showMessageDialog(null,"Bienvenido al Sistema");
          
        String nombre;
        String nombres[]= new String[nTrabajadores];
        double salarioHora;
        double salariosHora[]= new double[nTrabajadores];
        int cantHora;
        int cantHoras[] = new int[nTrabajadores];
        
        int op1=0;
        int band=1;
        
       
       
        
        while(op1!=3){
            
            do {
            
                op1 =Integer.parseInt( JOptionPane.showInputDialog(" Seleccione una opcion:\n"
                    + " Agregar Empleado___1\n"
                    + " Calcular Planilla__2\n"
                    + " Salir______________3"));

                if(op1<1 || op1>3){
                    band=2;
                }

            } while (band==2);

                        switch(op1){

                            case 1:
                             nTrabajadores = Integer.parseInt( JOptionPane.showInputDialog("Ingresar cantidad de trabajadores:"));
                             
                                for (int i = 0; i < nTrabajadores; i++) {
                                    nombres[a]=JOptionPane.showInputDialog("Ingresar nombre del trabajador");
                                    salariosHora[a]=Double.parseDouble(JOptionPane.showInputDialog("Ingresar nombre del trabajador"));
                                    cantHoras[a]=Integer.parseInt( JOptionPane.showInputDialog(" Ingresar el numero de horas Trabajadas"));
                                a++;
                                }
                                for (int i = 0; i < a; i++) {
                                    JOptionPane.showMessageDialog(null,"el nombre 1 es"+nombres[a]);
                                }
                           
                                    
                                    break;
                            case 2:

                        }
       
        };
        
        
    }
    
}
