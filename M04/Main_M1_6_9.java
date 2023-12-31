// CONVERSIONS BETWEEN FEET AND METERS
// AUTHOR: <|Cody Dalton|>
//M1_6_9
// Date: 10.23.2023
// Purpose: <|To convert feet to meters and meters to feet|>


public class Main_M1_6_9 {
  public static void main(String[] args) {
    System.out.println("Feet \t Meters    | \t Meters   Feet");
        System.out.println(
                "---------------------------------------------");
             /* loop to iterate of foot and meter then increment +1 and +5 until length > 10 */ 
        for (int footLength = 1, meterLength = 20; footLength <= 10; footLength++, meterLength += 5) {
            double feet = footLength;
            double meters = meterLength;
            /* format priting and calling methods */
            System.out.printf("%-2.1f \t %.3f", feet, meterToFoot(feet));
            System.out.print("\t   |\t");
            System.out.printf(" %2.1f \t  %.3f\n", meters, footToMeter(meters));
          }
  }

  /* Convert from meters to feet */
  public static double meterToFoot(double foot){
    return foot * 0.305;
  }
  /* Convert from feet to meters */
  public static double footToMeter(double meter){
    return meter * 3.279;
  }

}