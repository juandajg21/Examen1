/*
 Examen 1.
 */
package examen1;

import java.util.Scanner;

public class Examen1 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String nom, ape, nac, dir, are=null, buscar = null, buscar2 = null;
        int ced, tel, opc, opc2, auxbuscar = -1;
        Usuario u[] = new Usuario[0];
        u = null;
        Usuario u2[];

        do {

            System.out.println("Por favor escriba una opción:\n1. Ingresar Usuario.\n2. Actualizar Usuario.\n3. Eliminar Usuario.\n4. Buscar Usuario.\n5. Salir.");
            opc = lector.nextInt();

            switch (opc) {

                case 1: {

                    if (u == null) {

                        lector.nextLine();
                        System.out.println("Ingrese el Nombre: ");
                        nom = lector.nextLine();

                        System.out.println("Ingrese los apellidos: ");
                        ape = lector.nextLine();

                        System.out.println("Ingrese la cédula: ");
                        ced = lector.nextInt();
                        lector.nextLine();

                        System.out.println("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
                        nac = lector.nextLine();

                        System.out.println("Ingrese la dirección: ");
                        dir = lector.nextLine();

                        System.out.println("Ingrese el Teléfono: ");
                        tel = lector.nextInt();

                        System.out.println("Ingrese el área de interés:\n1. Química.\n2. Física.\n3. Tecnología.\n4. Cálculo.\n5. Programación.");
                        opc2=lector.nextInt();
                        
                        switch (opc2){
                        
                            case 1: {
                                are = "Quimica";
                            }
                            break;
                                
                            case 2: {
                                are = "Fisica";
                            }
                            break;
                                
                            case 3: {
                                are = "Tecnologia";
                            }
                            break;
                                
                            case 4: {
                                are = "Calculo";
                            }
                            break;
                                
                            case 5: {
                                are = "Programacion";
                            }
                            break;
                        
                        }                                
                        u = new Usuario[1];
                        u[0] = new Usuario(nom, ape, ced, nac, dir, tel, are);
                        
                    } else {

                        u2 = new Usuario[u.length];

                        for (int i = 0; i < u.length; i++) {
                            nom = u[i].getNombre();
                            ape = u[i].getApellido();
                            ced = u[i].getCedula();
                            nac = u[i].getNacimiento();
                            dir = u[i].getDireccion();
                            tel = u[i].getTelefono();
                            are = u[i].getArea();
                            u2[i] = new Usuario(nom, ape, ced, nac, dir, tel, are);
                        }

                        u = null;

                        u = new Usuario[u2.length + 1];

                        for (int i = 0; i < u.length; i++) {

                            if (i < u2.length) {
                                nom = u2[i].getNombre();
                                ape = u2[i].getApellido();
                                ced = u2[i].getCedula();
                                nac = u2[i].getNacimiento();
                                dir = u2[i].getDireccion();
                                tel = u2[i].getTelefono();
                                are = u2[i].getArea();
                                u[i] = new Usuario(nom, ape, ced, nac, dir, tel, are);

                            } else {
                                lector.nextLine();
                                System.out.println("Ingrese el Nombre: ");
                                nom = lector.nextLine();

                                System.out.println("Ingrese los apellidos: ");
                                ape = lector.nextLine();

                                System.out.println("Ingrese la cédula: ");
                                ced = lector.nextInt();
                                lector.nextLine();

                                System.out.println("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
                                nac = lector.nextLine();

                                System.out.println("Ingrese la dirección: ");
                                dir = lector.nextLine();

                                System.out.println("Ingrese el Teléfono: ");
                                tel = lector.nextInt();

                               System.out.println("Ingrese el área de interés:\n1. Química.\n2. Física.\n3. Tecnología.\n4. Cálculo.\n5. Programación.");
                        opc2=lector.nextInt();
                        
                        switch (opc2){
                        
                            case 1: {
                                are = "Quimica";
                            }
                            break;
                                
                            case 2: {
                                are = "Fisica";
                            }
                            break;
                                
                            case 3: {
                                are = "Tecnologia";
                            }
                            break;
                                
                            case 4: {
                                are = "Calculo";
                            }
                            break;
                                
                            case 5: {
                                are = "Programacion";
                            }
                            break;
                        
                        }                 

                                u[i] = new Usuario(nom, ape, ced, nac, dir, tel, are);
                            }

                        }

                    }

                    System.out.println("En el momento tiene " + u.length + " registro(s): ");
                    for (int j = 0; j < u.length; j++) {
                        System.out.println(u[j].getNombre() + " " + u[j].getApellido() + " " + u[j].getCedula() + " " + u[j].getNacimiento() + " " + u[j].getDireccion() + " " + u[j].getTelefono() + " " + u[j].getArea());
                    }
                }
                break;

                case 2: {
                    lector.nextLine();
                    System.out.println("Ingrese el nombre de quien desea actualizar: ");
                    buscar = lector.nextLine();
                    for (int i = 0; i < u.length; i++) {
                        buscar2 = u[i].getNombre();
                        if (buscar2.equals(buscar)) {
                            auxbuscar = i;
                        }
                    }
                    if (auxbuscar == -1) {
                        System.out.println(buscar + " no existe en la base de datos. Verifique: ");
                        System.out.println("En el momento tiene " + u.length + " registro(s): ");
                        for (int j = 0; j < u.length; j++) {
                            System.out.println(u[j].getNombre() + " " + u[j].getApellido() + " " + u[j].getCedula() + " " + u[j].getNacimiento() + " " + u[j].getDireccion() + " " + u[j].getTelefono() + " " + u[j].getArea());
                        }
                    } else {

                        System.out.println("Ingrese el Nombre: ");
                        nom = lector.nextLine();

                        System.out.println("Ingrese los apellidos: ");
                        ape = lector.nextLine();

                        System.out.println("Ingrese la cédula: ");
                        ced = lector.nextInt();
                        lector.nextLine();

                        System.out.println("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
                        nac = lector.nextLine();

                        System.out.println("Ingrese la dirección: ");
                        dir = lector.nextLine();

                        System.out.println("Ingrese el Teléfono: ");
                        tel = lector.nextInt();

                               System.out.println("Ingrese el área de interés:\n1. Química.\n2. Física.\n3. Tecnología.\n4. Cálculo.\n5. Programación.");
                        opc2=lector.nextInt();
                        
                        switch (opc2){
                        
                            case 1: {
                                are = "Quimica";
                            }
                            break;
                                
                            case 2: {
                                are = "Fisica";
                            }
                            break;
                                
                            case 3: {
                                are = "Tecnologia";
                            }
                            break;
                                
                            case 4: {
                                are = "Calculo";
                            }
                            break;
                                
                            case 5: {
                                are = "Programacion";
                            }
                            break;
                        
                        }  

                        u[auxbuscar] = new Usuario(nom, ape, ced, nac, dir, tel, are);
                        System.out.println("¡Actualizado!");
                        System.out.println(u[auxbuscar].getNombre() + " " + u[auxbuscar].getApellido() + " " + u[auxbuscar].getCedula() + " " + u[auxbuscar].getNacimiento() + " " + u[auxbuscar].getDireccion() + " " + u[auxbuscar].getTelefono() + " " + u[auxbuscar].getArea());
                    }
                }
                break;

                case 3: {
                    lector.nextLine();
                    System.out.println("Ingrese el nombre de quien desea eliminar: ");
                    buscar = lector.nextLine();
                    for (int i = 0; i < u.length; i++) {
                        buscar2 = u[i].getNombre();
                        if (buscar2.equals(buscar)) {
                            auxbuscar = i;
                        }
                    }
                    if (auxbuscar == -1) {
                        System.out.println(buscar + " no existe en la base de datos. Verifique: ");
                        System.out.println("En el momento tiene " + u.length + " registro(s): ");
                        for (int j = 0; j < u.length; j++) {
                            System.out.println(u[j].getNombre() + " " + u[j].getApellido() + " " + u[j].getCedula() + " " + u[j].getNacimiento() + " " + u[j].getDireccion() + " " + u[j].getTelefono() + " " + u[j].getArea());
                        }
                    } else {

                        u2 = new Usuario[u.length - 1];

                        if (auxbuscar > 0) {
                            for (int i = 0; i < auxbuscar; i++) {

                                nom = u[i].getNombre();
                                ape = u[i].getApellido();
                                ced = u[i].getCedula();
                                nac = u[i].getNacimiento();
                                dir = u[i].getDireccion();
                                tel = u[i].getTelefono();
                                are = u[i].getArea();
                                u2[i] = new Usuario(nom, ape, ced, nac, dir, tel, are);
                            }
                            for (int i = auxbuscar + 1; i < u2.length; i++) {
                                nom = u[i].getNombre();
                                ape = u[i].getApellido();
                                ced = u[i].getCedula();
                                nac = u[i].getNacimiento();
                                dir = u[i].getDireccion();
                                tel = u[i].getTelefono();
                                are = u[i].getArea();
                                u2[i - 1] = new Usuario(nom, ape, ced, nac, dir, tel, are);

                            }
                        }

                        u = null;

                        u = new Usuario[u2.length];

                        for (int i = 0; i < u.length; i++) {

                            
                                nom = u2[i].getNombre();
                                ape = u2[i].getApellido();
                                ced = u2[i].getCedula();
                                nac = u2[i].getNacimiento();
                                dir = u2[i].getDireccion();
                                tel = u2[i].getTelefono();
                                are = u2[i].getArea();
                                u[i] = new Usuario(nom, ape, ced, nac, dir, tel, are);

                            

                        }

                        System.out.println("En el momento tiene " + u.length + " registro(s): ");
                        for (int j = 0; j < u.length; j++) {
                            System.out.println(u[j].getNombre() + " " + u[j].getApellido() + " " + u[j].getCedula() + " " + u[j].getNacimiento() + " " + u[j].getDireccion() + " " + u[j].getTelefono() + " " + u[j].getArea());
                        }
                    }
                    break;
            }
                 case 4: {
                    lector.nextLine();
                    System.out.println("Ingrese el nombre de quien desea buscar: ");
                    buscar = lector.nextLine();
                    for (int i=0;i<u.length;i++){
                        buscar2=u[i].getNombre();
                        if (buscar2.equals(buscar)) {
                                auxbuscar=i;    
                                }
                    }
                    if (auxbuscar==-1){
                    System.out.println(buscar + " no existe en la base de datos. Verifique: ");
                    System.out.println("En el momento tiene "+ u.length+ " registro(s): ");
                    for (int j=0;j<u.length;j++) {
                        System.out.println(u[j].getNombre()+" "+u[j].getApellido()+" "+u[j].getCedula()+" "+u[j].getNacimiento()+" "+u[j].getDireccion()+" "+u[j].getTelefono()+" "+u[j].getArea());
                        }
                    }
                    else {
                      System.out.println(u[auxbuscar].getNombre()+" "+u[auxbuscar].getApellido()+" "+u[auxbuscar].getCedula()+" "+u[auxbuscar].getNacimiento()+" "+u[auxbuscar].getDireccion()+" "+u[auxbuscar].getTelefono()+" "+u[auxbuscar].getArea());
                    }
                }
                break;
        } 
     } while (opc != 5);
        
       System.out.println("Te esperamos de vuelta!!!");
}
}
