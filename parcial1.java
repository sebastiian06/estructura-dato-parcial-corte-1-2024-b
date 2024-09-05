import javax.swing.*;
import java.util.Scanner;

public class parcial1 {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        Double valorunitario;
        Double cantidadcompra;
        Double sindescuento;
        Double primerdescuento;
        Double segundodescuento;
        Double totalprimero;
        Double totalsegundo;
        Double valorbruto;
        String mensaje = "Error en la entrada de datos";
        String nombre1;
        String nombre2;

        System.out.print("Digite su nombre: ");
        nombre1 = scanner.next();

        System.out.print("Digite el nombre del producto: ");
        nombre2 = scanner.next();

        System.out.print("Digite el valor unitario: ");
        valorunitario = scanner.nextDouble();
        if (valorunitario>=0){
            System.out.print("Digite la cantidad de la compra: ");
            cantidadcompra = scanner.nextDouble();

            if (cantidadcompra>=0){
                
                if (cantidadcompra>=0 && cantidadcompra<20){

                    if (cantidadcompra>=10 && cantidadcompra<20){
                        valorbruto = (valorunitario*cantidadcompra);
                        primerdescuento = ((valorunitario*cantidadcompra)*0.05);
                        totalprimero = ((valorunitario*cantidadcompra)-primerdescuento);
                        System.out.println(nombre1+ " su compra de: "+ nombre2+ " con un valor unitario de: " +valorunitario+ " y una catidad de: "+ cantidadcompra+ " el valor bruto es: " +valorbruto+ " su descuento es de: " +primerdescuento+ " el valor neto es: "+ totalprimero);
                    }else{
                        valorbruto = (valorunitario*cantidadcompra);
                        sindescuento = (valorunitario*cantidadcompra)*0;
                        System.out.println(nombre1+ " su compra de: "+ nombre2+ " con un valor unitario de: "+ valorunitario+ " y una catidad de: "+ cantidadcompra+ " el valor bruto es: "+ valorbruto+ " su descuento es de: "+ sindescuento +" el valor neto es: " +valorbruto);
                    }
                }else{
                    valorbruto = (valorunitario*cantidadcompra);
                    segundodescuento = ((valorunitario*cantidadcompra)*0.07);
                    totalsegundo = ((valorunitario*cantidadcompra)-segundodescuento);
                    System.out.println(nombre1+ " su compra de: "+nombre2+ " con un valor unitario de: "+valorunitario+ " y una catidad de: "+ cantidadcompra+ " el valor bruto es: "+ valorbruto+ " su descuento es de: "+ segundodescuento+ " el valor neto es: " +totalsegundo);
                }
            }else{
                System.out.println(mensaje);
            }
        }else{
            System.out.println(mensaje);
        }
    }
}