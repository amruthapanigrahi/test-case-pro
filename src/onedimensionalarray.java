

public class onedimensionalarray {

    public static void main(String[] args) {

//Arrays - to store more than 1 value and need to specific max number of values can be stored
//int a=10;

int i[]=new int[5];
i[0]=001;
i[1]=100;
i[2]=200;
i[3]=300;
i[4]=400;

System.out.println(i[3]);

for(int a=0;a<5;a++) {
    System.out.println(i[a]);
}

//char - one dimensional array

char c[]=new char[4];
c[0]='!';
c[1]='@';
c[2]='#';
c[3]='&';

for(int b=0;b<4;b++) {
    System.out.println("Value is "+c[b]);
}   	 
    }

}

