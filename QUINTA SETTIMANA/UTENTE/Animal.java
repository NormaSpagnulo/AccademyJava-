interface Ciao {

    public void animalSound();
    public void sleep();}

    class Pig implements Ciao{
        public void animalSound(){
            System.out.println("The pig says: wee");}

            public void sleep(){
                System.out.println("Zzz");

            }
        }

        class Animal{
            public static void main(String[] args){
                Pig myPig = new Pig();
                myPig.animalSound();
                myPig.sleep();
            }
        }
    
    