
public class nestedforloopexamp {
   public static void main (String []args) {
	   
for(int a=0;a<5;a++) {//a=0,1
    for(int b=0;b<5;b++) {//b=0,1,2,3,4....b=0,1,2,3,4
    	for(int c=0;c<4;c++) {//c=0,1,2,3,4,....c=0,1,2,3,4,
    		System.out.println("Value of c is "+c);
    	}
   	 System.out.println("Value of b is "+b);
    }

    System.out.println("Value of a is "+a);
}
    }

}