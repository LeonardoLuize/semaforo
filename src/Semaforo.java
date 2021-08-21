public class Semaforo {

    private int color;

    public Semaforo(int color){
        this.color = color;
    }

    public void nextColor(){
        if(color < 2){
            color++;
        }else{
            color = 0;
        }
    }

    public int getColor() {
        return color;
    }

    public String getColorString(){
        if(color == 2){
            return "Red";
        }

        if(color == 0){
            return "Green";
        }

        if(color == 1){
            return "Yellow";
        }

        return "nothing";
    }

    public void setColor(int color){
        this.color = color;
    }
}
