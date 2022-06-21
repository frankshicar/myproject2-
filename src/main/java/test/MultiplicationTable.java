package test;


public class MultiplicationTable {
    public static void main(String[] args) {
        int  i, k;
        for( i= 1; i<= 9; i++){
            for( k= 2; k<= 5; k++){
                System.out.printf( " %d x %d = %02d ", k, i, k*i);
            }
            System.out.printf("\n");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for( i= 1; i<= 9; i++){
            for( k= 6; k<= 9; k++){
                System.out.printf( " %d x %d = %02d ", k, i, k*i);
            }
            System.out.println();
        }

    }
}
