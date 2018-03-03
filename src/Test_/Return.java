package Test_;

public class Return {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;

        for ( i = 0; i < 10; i++) {
            for ( j = 0; j < 10; j++) {
                for (k = 0; k <10 ; k++) {
                    System.out.println("i, j, k: " + i +" " + j + " " + k );
                    if(i==2)
                        return;
                }
            }
        }
    }
}
