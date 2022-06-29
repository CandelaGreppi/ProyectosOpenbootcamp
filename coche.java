public class coche {

    public static void main(String[] args) {
        Puerta miCoche = new Puerta();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puerta);

    }
}

 class Puerta {
        public int puerta = 0;

        public void SumarPuerta(){
            this.puerta++;
        }
    }




