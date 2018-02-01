
package exemploarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos {
    
    public void engadir(ArrayList<Integer>lis){
        Integer n; //declarando un Integer n.
        n=Integer.parseInt(JOptionPane.showInputDialog("numero")); //Pasa a Integer.
        lis.add(n); //agrego valor
//        lis.add(Integer.parseInt(JOptionPane.showInputDialog("numero"))); //Esta línea es igual que las tres anteriores.
    }
    
    //Amosar mediante un iterator:
    public void amosarIterator(ArrayList<Integer>lis){
        Iterator it=lis.iterator();
        while(it.hasNext()) //mientras haya un elemento...
            System.out.println(it.next());
    }
    
    //Borra el valor del elemento por su posición.
    public void borrarElementoPosicion(ArrayList<Integer>lis){
        Integer posicion=Integer.parseInt(JOptionPane.showInputDialog("Inserta la posición del elemento a borrar:"));
        lis.remove(posicion); // (remove int index)
    }
    
    //Borra el valor del elemento por su valor. (pidiendo su valor actual).
    public void borrarElementoValor(ArrayList<Integer>lis){
        Integer valor=Integer.parseInt(JOptionPane.showInputDialog("Inserta el valor del elemento a borrar:"));
        lis.remove(new Integer(valor)); // Creo un obxeto para que se me borre o valor. E non o colla como unha posición. (remove Object o)
    }
    
    //Cambia el valor del elemento por su posición.
    public void modificarElementoPosicion(ArrayList<Integer>lis){
        Integer posicion=Integer.parseInt(JOptionPane.showInputDialog("Inserta la posición del elemento que quiero modificar:"));
        Integer newValor=Integer.parseInt(JOptionPane.showInputDialog("Inserta el valor nuevo:"));
        lis.set(posicion, newValor); //(posición, nuevo valor). (set (int index, Integer element).
    }
    
    //Cambia el valor del elemento por su valor. (pidiendo su valor actual).
    public void modificarElementoValor(ArrayList<Integer>lis){
        Integer valorAnt=Integer.parseInt(JOptionPane.showInputDialog("Inserta el valor del elemento que quiero modificar:"));
        Integer valorNovo=Integer.parseInt(JOptionPane.showInputDialog("Inserta el valor nuevo:"));
        int posicion=lis.indexOf(new Integer(valorAnt));
        lis.add(posicion, valorNovo);
    }
    
    //Muestra el número mayor y el menor.
    private static int numMayor=0;
    private static int numMenor=20;
    public void mostrarMaiorMenor(ArrayList<Integer>lis){
        for(int i=0;i<lis.size();i++){
            if(numMayor<lis.get(i)){
                numMayor=lis.get(i);
            }
            if(numMenor>lis.get(i)){
                numMenor=lis.get(i);
            }
        }
        System.out.println("Numero mas alto "+numMayor+", Numero mas bajo "+numMenor);
    }
    
    //Pasa los números pares al array listaPares. (Array creado en el main).
    public void pasarValoresPares(ArrayList<Integer>lis,ArrayList<Integer>listaPar){
        for(int i=0;i<lis.size();i++){
            if(lis.get(i)%2==0){
                listaPar.add(lis.get(i)); //Añado a listaPar los valores pares de lis. 
            }
        }
        Iterator it=listaPar.iterator(); //Visualiza listaPar.
        while(it.hasNext())
            System.out.println(it.next());
    }
    
}
