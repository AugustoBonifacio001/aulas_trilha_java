public class Cliente{
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
       

        smartTv.ligar();

        System.out.println("A tv está ligada ? " +smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("O volume da tv foi aumentado para:" +smartTv.volume);
        
        


    }
}