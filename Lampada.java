public class Lampada{

    private boolean situacaoLampada;

    public boolean isSituacaoLampada() {
        return situacaoLampada;
    }

    public void setSituacaoLampada(boolean situacaoLampada) {
        this.situacaoLampada = situacaoLampada;
    }

   public boolean ligar(){
       return situacaoLampada = true;
   }
   public boolean desligar(){
       return situacaoLampada = false;
   }
   

}