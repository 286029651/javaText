package newtetxt;

import java.util.Scanner;

public class one {
	public static void main(String[] args)
	{		
		Scanner s=new Scanner(System.in);
		System.out.println("����1������");
		int x=s.nextInt();
		int j=0;//����һ������������������ս��
		while(x!=0)
		{
			int y=x%10;			//��������������һλȡ����
			x/=10;					//������ȡ��������λ��ȥ�ˣ�
			j=j*10+y;				//�Ƚ�ǰ�����*10���ٰ����������һλ�ӽ���
		}
		System.out.println(j);
	}
}

