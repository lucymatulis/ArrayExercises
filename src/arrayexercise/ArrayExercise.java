/**
 *Lucy Matulis
 * 10/10/2017
 * This program calculates how many people makes within a certain range for moneys made
 */

package arrayexercise;

/**
 *
 * @author lumat8093
 */
public class ArrayExercise {
    
    
    
    public static int totalPay (int sales){
        int totalMoneys = (int)(sales*1.09 + 200);
        return totalMoneys;
    }
    public static void main(String[] args) {
        int[] ranges = new int[9];
        int[] moneys = {321654,1231,1112};        
         
        for (int i = 0; i<moneys.length;i++){
            moneys[i]= totalPay(moneys[i]);
        }
        
        for(int counter = 0; counter<moneys.length; counter++){
            if(moneys[counter]<=299){
                ranges[0]++;
            } else if(moneys[counter]<=399){
                ranges[1]++;
            } else if(moneys[counter]<=499){
                ranges[2]++;
            } else if(moneys[counter]<=599){
                ranges[3]++;
            } else if(moneys[counter]<=699){
                ranges[4]++;
            } else if(moneys[counter]<=799){
                ranges[5]++;
            }else if(moneys[counter]<=899){
                ranges[6]++;
            }else if(moneys[counter]<=999){
                ranges[7]++;
            }else if(moneys[counter]>1000){
                ranges[8]++;
            }
        }
        
        for(int x =0; x<ranges.length;x++){
            System.out.println(ranges[x]);
        }
    }
}
            
        
    
    

