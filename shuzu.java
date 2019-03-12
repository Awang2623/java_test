package test;

import java.util.*;

public class shuzu {
	
	public static int max(int a[],int n) {
		int sum=0;
		int b=0;
		for(int i=0;i<n;i++)//由n个数组成的数组，若前m（m<n）个数的和为非正数，则从第m个数重新开始相加
		{    
			if(b<0) b=a[i];
			else b+=a[i];
			if(sum<b) sum=b;
			}
		return sum;
}
public static void main(String[] args) {
	int[] a=new int[10];
	int k=0;
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个由10个数组成的数组：");
	for(int i=0;i<10;i++) {//输入数组
		a[i]=input.nextInt();
	}
	System.out.print("最大子数组和为：");
	int t=a[0];
	for(int i=0;i<10;i++)
	{
		if(a[i]<0) {k++;}
	}
	if(k==10)//判断数组中的数字是否全为负数
	{
		for(int i=0;i<10;i++)
		{
			if(a[i]>t)
				{
				 t=a[i];
				}
		}
		System.out.println(t);
	}
	else System.out.println(max(a,10));
 }
}