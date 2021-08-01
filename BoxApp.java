package Box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BoxApp {
    public static void main(String[] args) {
        Consignment newBox = new Consignment(200,300,600,5);

        BoxToSend boxToSend = new BoxToSend();

        List <Integer> listNewBox = new ArrayList<Integer>();
        listNewBox.add(newBox.getWidth());
        listNewBox.add(newBox.getHeight());
        listNewBox.add(newBox.getDeep());
        int heightC = 0;
        int height = 1;
        int width = 0;

        if (newBox.getWeight() > boxToSend.getWeight()){
            System.out.println("Nie można przesłać przedmiotu, zbyt duża waga " + newBox.getWeight() +"kg");
        }

        Collections.sort(listNewBox);
        Collections.reverse(listNewBox);
        for ( Integer i:listNewBox ){
            if ( i > boxToSend.getDeep() ) {
                System.out.println("Głębokość paczki przekracza 600mm " + i + "mm");
                System.exit (0);
            }
            if( i < boxToSend.getDeep() && i > boxToSend.getWidthC()){
                heightC = heightC + 1 ;
                if (heightC == 2) {

                    System.out.println("Wysokość paczki przekracza 410mm " + i + "mm");
                    System.exit (0);
                }
            }
            if ( heightC > 1 && i > boxToSend.getHeight()){
                height = height + 1 ;
                if (height == 2) {
                    System.out.println("Wysokość paczki przekracza 380mm " + i + "mm");
                    System.exit (0);
                }
            }
            if (i >boxToSend.getWidthA() && i <boxToSend.getHeight()){
                width = width +1;
                if (width ==3){
                    System.out.println("Szerokość paczki przekracza 80mm " + i + "mm");
                    System.exit (0);
                }
            }
        }

        Collections.sort(listNewBox);
        if (newBox.getWeight() > boxToSend.getWeight()) {
            System.exit (0);
        }
                else{
            if (listNewBox.get(0) <= boxToSend.getWidthA()) {
                System.out.println("Paczka typu A, koszt " + boxToSend.getPriceA() + "zł");
            }
            if ((listNewBox.get(0) > boxToSend.getWidthA()) && (listNewBox.get(0) <= boxToSend.getWidthB())) {
                System.out.println("Paczka typu B, koszt " + boxToSend.getPriceB() + "zł");
            }
            if (listNewBox.get(0) > boxToSend.getWidthB() && listNewBox.get(0) <= boxToSend.getHeight()) {
                System.out.println("Paczka typu C, koszt " + boxToSend.getPriceC() + "zł");
            }
        }
    }
}
