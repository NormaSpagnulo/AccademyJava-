public class ArrayeCicli {

        public static void main(String[] args){

             String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
             int[] power ={200, 100, 30, 220};
             int f = 0;
            for(String i : cars){
             System.out.print(i);
             System.out.println(" Potenza: " + power[f]);
             f++;
            }
            
        }
    }