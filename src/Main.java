/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eugenia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int price[]={16,15,1,2};
          Finder f=new Finder(price);
          System.out.println(finding(f.n, price));    
          System.out.println("________________________");
          int price2[]={10,11,7,10,6};
          Finder f2=new Finder(price2);
          System.out.println(finding(f2.n,price2));
          System.out.println("________________________");
          int price3[]={36,11,13,21};
          Finder f3=new Finder(price3);
          System.out.println(finding(f3.n, price3));    
          System.out.println("________________________");
         
    }
    
    
       public static Days finding(int n, int a[]){ 
        if (n==0) throw new IllegalArgumentException("Введите, как минимум, еще одно значение");
  
        Days days= new Days();
        if (n==1){
            int l;                  //индекс мин
            int r;                  //индекс макс
            if (a[1]>a[0]){
                l=0;
                r=1;
                
            } 
            else {
                   l=1;
                   r=0; 
                    } 

            
            days.indMin=l;            
            days.min=a[l];
            days.purDay=l;
            days.saleDay=r;            
            days.purPrice=a[0];
            days.salePrice=a[1];
            days.profit= a[1]-a[0];
            return days;    
        }
        Days tmp= finding(n-1,a);
        int l2;   
        int imax;                    
        int l3;                 
        int min;
        int max;
        if (tmp.min>a[n]) 
             l2= n ;
                   else  l2=tmp.indMin;
        
        if((a[n]-tmp.min>tmp.profit)&&(tmp.min>a[n]))
            l3=n;
                    else l3= tmp.indMin ;

        
        if (a[n]-tmp.min>tmp.profit)
            min=tmp.min; 
                    else min=tmp.purPrice;
        if (a[n]-tmp.min>tmp.profit)
            max=a[n]; 
                    else max=tmp.salePrice;
        if (a[n]-tmp.min>tmp.profit)
            imax=n; 
                    else imax=tmp.saleDay;
        days.indMin = l2;
        days.min = a[l2];        
        days.max=a[n];
        days.saleDay= imax;
        days.purDay= l3;
        days.purPrice = min;
        days.salePrice = max;
        days.profit = max - min;  
       
//         if (days.profit<0) throw  new IllegalArgumentException ("Невозможно получить прибыль в данных условиях");
//            else
         return days; 
    }
    
}
