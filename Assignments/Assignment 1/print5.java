import javax.swing.plaf.synth.SynthOptionPaneUI;

public class print5 {
    public static void main(String[] args) {
        int n =14;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1 || i+j <= n/2-1 || (i>=n/2 && i-n/2 >= j-1)   ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
