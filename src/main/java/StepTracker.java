import java.util.ArrayList;
public class StepTracker
{
 private int totalDays = 0;
 private int minSteps = 0;
 private int totalSteps = 0;
 private int validDays = 0;
 public StepTracker(int steps){
  minSteps = steps;
 }
 public void addDailySteps(int steps){
  totalDays++;
  totalSteps+=steps;
  if (steps>=minSteps)
    validDays++;
 }
 public int activeDays(){
  return validDays;
 }
 public double averageSteps(){
  if(totalDays == 0)
    return 0.0;
  return (double)totalSteps/totalDays;
 }
} 
