package MissionDSA;

public class StarPrintingQuestions {

    public static void main(String[] args) {
        //outer loop for line.
        for (int line=1; line<=4; line++){
            //inner loop for star printing.
            for (int star = 1; star<=line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //INVERTED STAR PATTERN
            int n=4;
            for(int line=1; line<=4;line++){
                for (int star=1; star<= n-line+1; star++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        //HALF PYRAMID NUMBER PATTERN

        int n2 = 4;
        for (int line = 1; line <= n2; line++){

            for(int star = 1; star <= line; star++){
                System.out.print(star);
            }
            System.out.println();
        }

                //CHARACTER HALF PYRAMID
        char c = 'A';
        for(int line=1; line<=n; line++){
            for(int ch = 1; ch<=line; ch++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    //INVERTED HALF PYRAMID
        for(int i=1; i<=n; i++){

            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //INVERTED HALF NUMBER PYRAMID
        int x=5;
        for(int i=1; i<=x; i++) {

            for (int j = 1; j <= x - i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //FLOYD'S triangle

        int counter=1;

        for(int i=1; i<=x; i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

        //0-1 triangle

        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
