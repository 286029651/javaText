package cs;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int a=123321;		//����һ������
		int x=a;				//��������������������a��������
		int y=0;				//�����ǽ�һ�Ӹ�������ת����
		while(x!=0)
		{
			int j=x%10;
			x/=10;
			y=y*10+j;
		}
		if(a==y)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
