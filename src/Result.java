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
    
    
    
}
