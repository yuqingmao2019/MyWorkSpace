package test;

import javax.print.attribute.standard.MediaName;

import org.junit.Test;

public class deadDemo {
	public static void main(String[] args) {
		  for(int i=0;i<4;i++){
					for(int j=0;j<i;j++){
						System.out.print("  ");
						
					}
					for(int k=7-2*i;k>=1;k--){
						System.out.print("* ");
						
					}
				System.out.println();
		  }
		  
		  for (int i=0;i <3;i++) {
			  for (int j = 2-i; j>0; j--) {	
					System.out.print("  ");
				}
				
				for (int j = 0; j<2*i+3; j++) {		
					System.out.print("* ");
				}
				System.out.println();
		  
	}

}
}
