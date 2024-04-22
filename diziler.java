package javaKodlarim;

public class diziler {

	public static void main(String[] args) {

		/* 7 elemanlı bir dizinin tersini başka bir dizi olarak oluşturan ve görüntüleyen programı kodlayın
		
		int[] array = {1, 3, -4, -8, 5, 9, 7};
		int[] revOfArray = new int[7];
		
		for(int i=0; i<7; i++)
			revOfArray[6-i] = array[i];
		
		for(int i=0;i<7; i++)
			System.out.println(revOfArray[i]); */
		
		-----------------------------------------------------------------------
		
		
		/* Bir dizinin en yüksek elemanı ile en düşük elemanı arasındaki farkı bulan ve görüntüleyen prohramı kodlayın
		
		int[] array = {1, 2, 4, 5, -9, 7, -11, 20};
		int max = array[0];
		int min = array[0];
		
		for(int i=1; i<8; i++)
			if(max<array[i])
				max=array[i];
			else if(min>array[i])
			    min=array[i];
		System.out.printf("The difference is %d", max-min);   */
		
		----------------------------------------------------------------------------
		
		
		/* Tek boyutlu bir dizinin çift ve tek sayıları için iki farklı dizi oluşturan programı kodlayın
		
		int[] array = {1, 2, 3, 4, 5, 9, 8, 7, 6};
		int even=0, odd=0, evenCounter=0, oddCounter=0;
		
		for(int i=0; i<9; i++)
			if(array[i]%2==0)
				even++;
			else
				odd++;
		
		int evenArray[] = new int[even], oddArray[] = new int[odd];
		
		for(int i=0; i<9; i++)
			if(array[i]%2==0)
				evenArray[evenCounter++]=array[i];
			else
				oddArray[oddCounter++]=array[i];
		
		System.out.printf("Array with even numbers :");
		for(int i=0; i<even; i++)
			System.out.println(evenArray[i]);
		
		System.out.printf("Array with odd numbers :");
		for(int i=0; i<odd; i++)
			System.out.println(oddArray[i]);  */
		
		-------------------------------------------------------------------------
		
		
		/* 1-100 arasında 99 farklı pozitif numaradan oluşan dizideki eksik numarayı bulan ve görüntüleyen programı kodla
		
		int[] array = {...};
		int temp;
		
		for(int i=0; i<98; i++)
			for(int j=i; j<50; j++)
				if(array[i]>array[j]) {
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp; }
		
		for(int i =0; i<98; i++)
			if(array[i+1]-array[i]>1)
				System.out.printf("Missing number is %d", i+2);  */
		
		-----------------------------------------------------------------------------
		
		
		/* ch rastgele harflerden oluşan bir char dizisidir. Büyük karakterleri küçüğe, küçük karakterleri büyüğe çeviren ve görüntüleyen programı kodla
		
		char[] ch = {...};
		
		for(int i=0; i<10; i++)
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]+='a'-'A';
			else if(ch[i]>='a' && ch[i]<='z')
				ch[i]-='a'-'A';
		
		for(int i=0; i<10; i++)
			System.out.printf("%c\n", ch[i]);  */
		
		------------------------------------------------------------------------------
		
		
		/*Bir dizinin ikiz asal sayılarını bulan ve görüntüleyen programı kodlayın.
		 ikiz asal sayı: başka bir asal sayıdan 2 fazla veya eksik olansayıdır 
		
		int[] array = {...};
		int control;
		
		System.out.printf("Prime numbers of array: ");
		
		for(int i=0; i<array.length; i++)
			control=0;
		for(int j=2; j<=array[i]/2; j++)
			if(array[i]%j==0) {
				control=1;
				break;
			}
		if(control==0)
			for(int j=0; j<array.length; j++)
				if((array[j]-array[i])==2) {
					control=0;
				}
		for(int k=2; k<=array[j]/2; k++) 
			if(array[j]%k==0) { 
				control=1;
				break;
			}
		if(control==0)
			System.out.printf("%d\t%d\n", array[i], array[j]);  */
		            
		
		
						
				
		
		
      	
			 
		
	}

}
