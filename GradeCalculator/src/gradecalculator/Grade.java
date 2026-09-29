/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradecalculator;

/**
 *
 * @author bernard_07
 */
public class Grade 
{
    private double prelim;
    private double midterm;
    private double finals;
    
    public Grade(double prelim, double midterm, double finals) 
    {
        this.prelim = prelim;
        this.midterm = midterm;
        this.finals = finals;
    }
    
    public double computeAverage() 
    {
        double ave = (prelim * 0.30) + (midterm * 0.30) + (finals * 0.40);
        return ave;
    }
    
    public String getRemarks() 
    {
        double ave = computeAverage();
        
        if(ave >= 75)
            return "PASSED";
        else
            return "FAILED";
    }
}
