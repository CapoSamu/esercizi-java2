public class EsercizioBeta {

    public static void main(String[] args) {

         int indice = 0;
        int fine = 10;

        ciclo(indice, fine);

        diverso();
        if (3 < 2) {
            System.out.println("vero");
        } else if (3 > 2) {
            System.out.println("vero 2");
        } else {
            System.out.println("falso");
        }

        System.out.println("fine");
    
    
        if (3 < 2) {
        stampa("vero");
    } else if (3 > 2) {
        stampa("vero 2");
    } else {
        stampa("falso");
    }

    stampa("fine");

    }
    public static void stampa(String Prova1) {
        System.out.println(Prova1);
    }

    public static void diverso() {
        
    System.out.println(10 % 2);    
    //Resto 0
    System.out.println(11 % 2);    
    //Resto 1
    System.out.println(11 == 11);  
    //Ugualianza (true o false)
    System.out.println(11 != 10); 
    //diverso da 11
    System.out.println(!(true)); 
    //inverte

    }



    public static void ciclo(int indice, int fine) {
        if (indice == fine) {
            System.out.println("è finito il cilo");
        } else {
            System.out.println("sei al iterazione " + indice);
            indice++;
            ciclo(indice, fine);
        }
    }

    public static void ciclo2() {
        int numeroCasuale = (int) (Math.random() * 10);
        System.out.println("Numero casuale da 1 a 10:" + numeroCasuale); 
        //genera numeri casuali
        
    }




    



}