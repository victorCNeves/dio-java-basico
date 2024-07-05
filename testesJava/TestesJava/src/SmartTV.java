public class SmartTV {

    boolean ligada;
    int volume;
    int canal;

    public void ligarDesligar(boolean ligada){
        this.ligada= !this.ligada;
    }

    public void aumentarDiminuirVolume(boolean aumentar, int volume){
        this.volume = aumentar==true ? ++this.volume : --this.volume;
    }

    public void mudarCanal(int canal){
        canal++;
    }

}