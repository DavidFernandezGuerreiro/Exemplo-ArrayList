
package exemploarraylist;

import java.util.*; //importamos toda la clase.
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList dunha lista xeral. (de todos os tipos)
//        ArrayList lista=new ArrayList();
//        lista.add(1);
//        lista.add("aaaa");
//        lista.add(1.6);
//        lista.add('d');
//        for(int i=0;i<lista.size();i++){
//            System.out.println(lista.get(i));
//        }
       
        //ArrayList de tipo Integer.
        ArrayList<Integer>listaNum=new ArrayList<Integer>();
//        listaNum.add(2);
//        listaNum.add(new Integer(3));//<-con esto, recalcó que son obxetos
        
        Scanner sc=new Scanner(System.in);
        Metodos obx=new Metodos();
        //int opc=Integer.parseInt(JOptionPane.showInputDialog("1 o 2"));
        ArrayList<Integer>listaPares=new ArrayList<Integer>();
        boolean opc=true;
        while(opc==true){
            int op=Integer.parseInt(JOptionPane.showInputDialog("******MENU******\n0.-SALIR DE LA APLICACIÓN."
                    + "\n1.-ENGADIR."
                    + "\n2.-AMOSAR."
                    + "\n3.-BORRAR POR POSICIÓN."
                    + "\n4.-BORRAR POR VALOR."
                    + "\n5.-MODIFICAR EL VALOR DEL ELEMENT0 POR SU POSICIÓN."
                    + "\n6.-MODIFICAR EL VALOR DEL ELEMENTO POR SU VALOR."
                    + "\n7.-MOSTRAR NÚMERO MAYOR Y MENOR."
                    + "\n8.-PASAR LOS VALORES PARES DE UN ARRAY A OTRO ARRAY."));
            switch(op){
                case 0:
                    opc=false;
                    break;
                case 1:
                    obx.engadir(listaNum);
                    break;
                case 2:
                    obx.amosarIterator(listaNum);
                    break;
                case 3:
                    obx.borrarElementoPosicion(listaNum);
                    break;
                case 4:
                    obx.borrarElementoValor(listaNum);
                    break;
                case 5:
                    obx.modificarElementoPosicion(listaNum);
                    break;
                case 6:
                    obx.modificarElementoValor(listaNum);
                    break;
                case 7:
                    obx.mostrarMaiorMenor(listaNum);
                    break;
                case 8:
                    obx.pasarValoresPares(listaNum,listaPares);
                    break;
                default: 
                    System.out.println("***ERROR***");
            }
        }
        
    }
    
}
