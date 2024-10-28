import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int sum=0;
        double avg=0;
        int counter=0;
        int input = SafeInput.getRangedInt(in, "Enter a number ", 1, 100);

        int [] dataPoints=new int [100];

        int min=dataPoints[0];
        int max=dataPoints[0];

        for(int i=0;i<dataPoints.length;i++){
            dataPoints[i]=rand.nextInt(100);
        }

        for(int num:dataPoints){
            System.out.print(num+"|");
            sum = sum+num;
            avg = (double) sum/dataPoints.length;

            if (input==num){
                counter++;
            }


        }
        int input2 = SafeInput.getRangedInt(in, "Enter another number ", 1, 100);

        for(int i=0;i<dataPoints.length;i++){
            if(dataPoints[i]==input2){
                System.out.println("The value "+input2+" was found at index "+i);
                break;
            }else{
                System.out.println("The value "+input2+" was not found");
                break;
            }
        }

        System.out.println("The sum of the array is: "+sum);
        System.out.println("The average of the array is: "+avg);
        System.out.println("The number "+input+" shows up "+counter+" times");

        for(int i=0;i<dataPoints.length;i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if(dataPoints[i] > max){
                max = dataPoints[i];
            }
        }
        System.out.println("The maximum is: "+max+" | The minimum is: "+min);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));





    }
    public static double getAverage(int values[]){
        double sum = 0.0;
        for (double value : values) {
            sum = sum + value;
        }
        return sum / values.length;
    }
}