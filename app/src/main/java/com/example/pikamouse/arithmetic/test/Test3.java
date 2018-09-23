package com.example.pikamouse.arithmetic.test;

/**
 * create by liting 2018/9/15
 */
public class Test3 {

public static void main(String[] args) {

    int n = 0;

    double[] x = { 1, 2, 3 };

    double[] y = { 3, 6, 9 };

    // 计算总和

    double sumx = 0.0, sumy = 0.0, sumx2 = 0.0;

    while (n < x.length) {

    sumx += x[n];

    sumx2 += x[n] * x[n];

    sumy += y[n];

    n++;

    }

    // 求平均数

    double xbar = sumx / n;

    double ybar = sumy / n;

    // 计算系数

    double xxbar = 0.0, yybar = 0.0, xybar = 0.0;

    for (int i = 0; i < n; i++) {

    xxbar += (x[i] - xbar) * (x[i] - xbar);

    yybar += (y[i] - ybar) * (y[i] - ybar);

    xybar += (x[i] - xbar) * (y[i] - ybar);

    }

    double beta1 = xybar / xxbar;

    double beta0 = ybar - beta1 * xbar;

    System.out.println("y = " + beta1 + " * x + " + beta0);
    System.out.println(xxbar + " " + yybar + " " + xybar);

    }

}
