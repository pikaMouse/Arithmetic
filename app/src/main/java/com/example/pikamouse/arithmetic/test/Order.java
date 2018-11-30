package com.example.pikamouse.arithmetic.test;

/**
 * create by liting 2018/9/25
 */
public class Order {
    public int arr[] = {1,2,0,0,2,1,2,1,1,0};
    public int iLength;
    public int iZero, iOne, iTwo;

    void swap(int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    void sort()
    {
        while(arr[iOne] == 0)//1
        {
            iZero++;
            iOne++;
        }
        while(arr[iTwo] == 2)
        {
            iTwo--;
        }
        while(iOne <= iTwo)//2
        {
            if (arr[iOne]==2)
            {
                swap(iOne,iTwo);//3
                iTwo--;
                while(arr[iTwo]==2)
                {
                    iTwo--;
                }
            }
            while(arr[iOne]==1)
            {
                iOne++;
            }
            if (arr[iOne] == 0)//4
            {
                swap(iOne, iZero);
                iZero++;
                iOne++;
            }
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.iLength = order.arr.length;//5
        order.iZero=0;
        order.iOne=0;
        order.iTwo=order.iLength-1;

        System.out.println("Before...");
        for (int i=0;i<order.iLength;i++)
        {
            System.out.print(order.arr[i]+" ");
        }
        order.sort();
        System.out.println("\nAfter...");
        for (int i=0;i<order.iLength;i++)
        {
            System.out.print(order.arr[i]+" ");
        }
    }
}
