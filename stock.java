package Leetcodeproblems;

import java.util.Scanner;

public class stock {
    public static int buysell(int price[])
        {
            int buyprice=Integer.MAX_VALUE;
            int maxprofit=0;
            for(int i=0; i<price.length; i++)
            {
                if(buyprice<price[i])
                {
                    int profit=price[i]-buyprice;
                    maxprofit=Math.max(maxprofit,profit);
                }else{
                    buyprice=price[i];
                }
            }
            return maxprofit;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the price in array");
            int price[]=new int[6];
            for(int i=0; i<price.length; i++)
            {
                price[i]=sc.nextInt();
            }
            System.out.println(buysell(price));

        }

}
