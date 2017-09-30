/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eugenia
 */
public class Result {
    int purDay;
    int saleDay;
    int profit;

    public Result(int purDay, int saleDay, int profit) {
        this.purDay = purDay;
        this.saleDay = saleDay;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Purchase- "+ purDay+ "; Sale Day- "+saleDay+"; Profit- "+ profit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Result other = (Result) o;
        if (profit != other.profit)
            return false;
        if (saleDay != other.saleDay)
            return false;
        if (purDay != other.purDay)
            return false;
        return true;
    }       
        

    
    
    
    
    
}
