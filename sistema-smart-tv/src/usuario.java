public class usuario {

    public static void main(String[] args) throws Exception {
        
       smartTv smartTv = new smartTv();

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       
       System.out.println("Canal Atual? " + smartTv.canal);

       smartTv.mudarCanal(13);

       System.out.println("Canal Atual? " + smartTv.canal);

       System.out.println("TV ligada? " + smartTv.ligada);
       
       System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

    }
    
}
