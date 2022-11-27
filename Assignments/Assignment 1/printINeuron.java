public class printINeuron {
    public static void main(String[] args) {
        int n = 10;

        // Outer loop for rows
        for(int i=0;i<n;i++){ 

            // Loop for printing I
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //Loop for printing N
            System.out.print("  ");
            for(int j=0;j<n;j++){
                
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //Loop for printing E
            System.out.print("  ");
            for(int j=0;j<n;j++){
                
                if(i==0 || i==(n-1) || (i==(n-1)/2) || j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //Loop for printing U
            System.out.print("  ");
            for(int j=0;j<n;j++){
                
                if((j==0 && i!=n-1) || (j==n-1 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //Loop for printing R
            System.out.print("  ");
            for(int j=0;j<n;j++){
                
                if(j==0 || (i>(n-1)/2 && i==j) || (i==0 && j<(3*n)/4-1) || (i<(n-1)/2 && j==(3*n)/4-1 && i!=0) || (i==(n-1)/2 && j<(3*n)/4-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //Loop for printing O
            System.out.print("  ");
            for(int j=0;j<n;j++){
                
                if((i==0 && j!=0 && j!=(n-1)) || (j==0 && i!=n-1 && i!=0) || (i==n-1 && j!=0 && j!=n-1) || (j==n-1 && i!=n-1 && i!=0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //Loop for printing N
            System.out.print("  ");
            for(int j=0;j<n;j++){
                
                if(j==0 || j==n-1 || i==j){
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