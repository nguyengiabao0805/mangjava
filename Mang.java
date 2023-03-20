package Mang;

import java.util.Scanner;

public class Mang {
	int[] a;

	void taomang() {
		Scanner sc = new Scanner(System.in);
		int n ;
	
		System.out.println("nhap so phan tu mang");
		n = sc.nextInt()
		a=new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("phan tu thu " + (i + 1));
			int d=sc.nextInt();
			a[i] = d
		}

	}

	void inmang() {
		System.out.println("in mang");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	void sapxep() {
		System.out.println("mang sau khi duoc sap xep");
		for(int i=0;i<a.length;i++) {
			int min =i;
			for(int j=0;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=a[min];
			
		}
		
		
	}
	
	void chenmang(int x,int k) {
		int []b=new int[a.length];
		
		for(int i=0;i<x;i++) {
			b[i]=a[i];
			
		}
		for(int j=x+1;j<a.length;j++) {
			b[j]=a[j-1];
		}
		b[x]=k
		a=b;
	}
	void xoamang(int x) {
		int b=new int[a.length+1];
		
		for(int i=0;i<x;i++) {
			b[i]=a[i];
			
		}
		for(int j=x+1;j<a.length;j++) {
			b[j]=a[j-1];
		}
		
		a=b;
	}
	
	public static void main(String[] args) {
		Mang c=new Mang();
		c.taomang();
		c.sapxep();
		c.chenmang(3, 1);
		c.xoamang(2);
		c.inmang();
	}

}
