package test;

import java.util.*;

public class shuzu {
	
	public static int max(int a[],int n) {
		int sum=0;
		int b=0;
		for(int i=0;i<n;i++)//��n������ɵ����飬��ǰm��m<n�������ĺ�Ϊ����������ӵ�m�������¿�ʼ���
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
	System.out.println("������һ����10������ɵ����飺");
	for(int i=0;i<10;i++) {//��������
		a[i]=input.nextInt();
	}
	System.out.print("����������Ϊ��");
	int t=a[0];
	for(int i=0;i<10;i++)
	{
		if(a[i]<0) {k++;}
	}
	if(k==10)//�ж������е������Ƿ�ȫΪ����
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