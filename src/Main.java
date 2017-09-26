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
            int price[] = {16, 15, 1, 2};
            System.out.println(foo(price));
            System.out.println("________________________");
            int price2[] = {10, 11, 7, 10, 6};           
            System.out.println(foo(price2));
            System.out.println("________________________");
            int price3[] = {36, 11, 13, 21};            
            System.out.println(foo(price3));
            System.out.println("________________________");
            int price4[] = {36, 11, 2, 9};            
            System.out.println(foo(price4));
            System.out.println("________________________");
            int price5[] = {6, 10, 96};            
            System.out.println(foo(price5));
            System.out.println("________________________");
            int price6[] = {6, 10};            
            System.out.println(foo(price6));
            System.out.println("________________________");
            int price7[] = {6, 10,1,3,1,17};            
            System.out.println(foo(price7));
            System.out.println("________________________");


        }

        private static Days finding(int n, int a[]) {
            if (n == 0) throw new IllegalArgumentException("Введите, как минимум, еще одно значение");

            Days days = new Days();
            if (n == 1) {
                int l;                  //индекс мин
                int r;                  //индекс макс
                if (a[1] > a[0]) {
                    l = 0;
                    r = 1;
                }
                else {
                    l = 1;
                    r = 0;
                }
                days.indMin = l;
                days.min = a[l];
                days.purDay = l;
                days.saleDay = r;
                days.purPrice = a[0];
                days.salePrice = a[1];
                days.profit = a[1] - a[0];
                return days;
            }
            Days tmp = finding(n - 1, a);
            int l2;
            int imax;
            int l3;
            int min;
            int max;
            if (tmp.min > a[n])
                l2 = n;
            else l2 = tmp.indMin;
            if ((a[n] - tmp.min > tmp.profit) && (tmp.min > a[n]))
                l3 = n;
            else l3 = tmp.indMin;
            if (a[n] - tmp.min > tmp.profit)
                min = tmp.min;
            else min = tmp.purPrice;
            if (a[n] - tmp.min > tmp.profit)
                max = a[n];
            else max = tmp.salePrice;
            if (a[n] - tmp.min > tmp.profit)
                imax = n;
            else imax = tmp.saleDay;
            days.indMin = l2;
            days.min = a[l2];
            days.max = a[n];
            days.saleDay = imax;
            days.purDay = l3;
            days.purPrice = min;
            days.salePrice = max;
            days.profit = max - min;

            return days;
        }
    
        
     public static Result foo(int a[]) {
      int n=a.length-1;
      Days d = finding(n, a);
      if (d.profit<0) throw  new IllegalArgumentException ("Невозможно получить прибыль в данных условиях");
      else
      return new Result(d.purDay, d.saleDay, d.profit);
         
     }
    
        
        
        
    }

