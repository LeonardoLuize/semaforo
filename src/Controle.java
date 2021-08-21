public class Controle {
    public static void main(String[] args) {


        Semaforo semaforoDaRua = new Semaforo(2);

        System.out.printf("%d %n",semaforoDaRua.getColor());

        for(int i = 0; i < 10; i++){
            semaforoDaRua.nextColor();
            System.out.printf("Cor do semaforo: %s número: %d %n", semaforoDaRua.getColorString(), semaforoDaRua.getColor());
        }

        semaforoDaRua.setColor(1);
        System.out.printf("Cor do semaforo: %s número: %d %n", semaforoDaRua.getColorString(), semaforoDaRua.getColor());


    }


}
