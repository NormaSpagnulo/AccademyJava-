public class EsercizioCar {

    public void fullThrottle(){
        System.out.println("La macchina sta già andando alla massima velocità! \n");}

    public void speed(int maxSpeed){
        System.out.println("La velocità massima vale: " + maxSpeed + "\n");
    }

    public static void main(String[] args) {
        EsercizioCar macchina = new EsercizioCar();
        macchina.fullThrottle();
        macchina.speed(200);
        macchina.speed(350);
        macchina.fullThrottle();
    }
}