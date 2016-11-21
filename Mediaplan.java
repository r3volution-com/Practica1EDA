//DNI 77842527 GONZALEZ ALVARADO, MARIO
import java.util.ArrayList;
public class Mediaplan {

    //ToDo
    //matriz de enteros de tamaño casillas
    //es un array de destinos
    //En primera matriz, guardar distancia de cada posicion a los destinos
    //Array de casillas para meter casillas en orden (Quizas arraylist?)
    //Recorrer array y mostrar

    public static void main (String [] args) {
        if (args.length == 4){
            Plano tabla = new Plano (Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            tabla.leePlano(args[0]);

            Coordenadas dimension = tabla.getSize();

            ArrayList<Coordenadas> destinos = new ArrayList<Coordenadas>();
            Integer [][] matrix = new Integer[dimension.getFila()][dimension.getColumna()];

            for (int i = 0; i<dimension.getFila(); i++){
                for (int j = 0; j<dimension.getColumna();j++){
                    if(tabla.consultaCasilla(new Coordenadas(i, j)) == 'd') {
                        destinos.add(new Coordenadas(i, j));
                    }
                }
            }
            if (args[3].equals("a")){

            } else if (args[3].equals("b")){

            }
        }
    }
}
