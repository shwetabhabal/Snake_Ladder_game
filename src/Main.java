import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int position=0;
        int maxposition= 100;
        Random rand= new Random();

        while(position < maxposition){
            int dice= rand.nextInt(7);
            System.out.println("Number on dice: "+dice);
            int newPosition= position+ dice;

            if(newPosition >maxposition){
                System.out.println("you need "+(newPosition-maxposition)+" to win");
                continue;
            }
            System.out.println("Moving from "+position+" to "+newPosition);

            position= newPosition;
            switch (position){  // for ladder
                case 4:
                    position=13;
                    System.out.println("Climbing ladder " +position );
                    break;
                case 9:
                    position=36;
                    System.out.println("Climbing ladder " +position );
                    break;
                case 15:
                    position=25;
                    System.out.println("Climbing ladder " +position );
                    break;
                case 30:
                    position=40;
                    System.out.println("Climbing ladder " +position );
                    break;
                case 55:
                    position=65;
                    System.out.println("Climbing ladder " +position );
                    break;
                case 80:
                    position=92;
                    System.out.println("Climbing ladder " +position );
                    break;
            }
            switch (position){   //for snake
                case 20:
                    position=10;
                    System.out.println("Moving dowm " +position );
                    break;
                case 35:
                    position=25;
                    System.out.println("Moving dowm " +position );
                    break;
                case 56:
                    position=40;
                    System.out.println("Moving dowm " +position );
                    break;
                case 90:
                    position=70;
                    System.out.println("Moving dowm " +position );
                    break;
            }
            if(position== maxposition){
                System.out.println("You win");
                break;
            }
        }
    }
}