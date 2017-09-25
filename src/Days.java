/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eugenia
 */
public class Days {
    int purDay;        //день покупки
    int saleDay;       // день продажи 
    int profit;        // доход
    int purPrice;      //цена покупки
    int salePrice ;    //цена продажи
    int indMin;        //индекс минимального эл-та 
    int indMax;
    int min;           // значение минимального
    int max;


    

   
    @Override
    public String toString() {
        return "День покупки- "+ purDay+ "; День продажи- "+saleDay+"; Прибыль- "+ profit;
    }
    
    
}
