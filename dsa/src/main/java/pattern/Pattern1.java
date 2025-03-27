package pattern;

public class Pattern1 {

    public static void main(String[] args) {

        Pattern1 p = new Pattern1();
        p.pattern1();
        p.pattern2();
        p.pattern3();
        p.pattern4();
        p.pattern5();
        p.pattern6();
        p.pattern7();
        p.pattern8();
        p.pattern9();
        p.pattern10();
        p.pattern11();
        p.pattern12();


    }

    // pattern1
    public void pattern1() {
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public void pattern2() {
        System.out.println("\n\n\n");

        for(int r = 0; r<5; r++) {
            for(int c = 0; c<5; c++) {
                if(c>=r)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern3() {
        System.out.println("\n\n\n");

        for(int r = 0; r<5; r++) {
            for(int c = 0; c<5; c++) {
                if(c<=r)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern4() {
        System.out.println("\n\n\n");

        for(int r = 0; r<5; r++) {
            for(int c = 0; c<5; c++) {
                if(c<=r)
                    System.out.print( c + " ");
            }
            System.out.println();
        }
    }

    public void pattern5() {
        System.out.println("\n\n\n");

        for(int r = 0; r<5; r++) {
            for(int c = 0; c<5; c++) {
                if(c<=r)
                    System.out.print( r + " ");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        System.out.println("\n\n\n");
        int n = 5;
        for(int r = 0; r<5; r++) {
            int j = n-r;
            for(int c = 0; c<5; c++) {
                    System.out.print( "* ");
                    j--;
                    if(j==0)  break;
            }
            System.out.println();
        }
    }


    public void pattern7() {
        System.out.println("\n\n\n");
        int n = 0;
        int pt = 4;

        for(int r = 0; r<5; r++) {
            for(int c = 0; c<9; c++) {
               if(r+c >= 4 && r+c<= pt) {
                   System.out.print("*");
               }
               else
                   System.out.print(" ");

            }
            pt+=2;
            System.out.println();
        }
    }


    public void pattern8() {
        System.out.println("\n\n\n");
        int n = 0;
        int pt = 0;

        for(int r = 0; r<5; r++) {
            for(int c = 0; c<9; c++) {
                if(r+c >= pt && r+c<= 8) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            pt+=2;
            System.out.println();
        }
    }

    public void pattern9() {
        System.out.println("\n\n\n");
        int n = 0;
        int pr = 4;
        int pc = 6;

        for(int r = 0; r<9; r++) {
            for(int c = 0; c<9; c++) {
                if(r+c >= 4  && r+c<= pr && r<=4) {
                    System.out.print("*");
                } else if(r > 4  && r+c >= pc && r+c<=12 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            if(r<=4) {
                pr+=2;
            } else {
                pc+=2;
            }
            System.out.println();
        }
    }

    public void pattern10() {
        System.out.println("\n\n\n");
        int n = 0;
        int pr = 4;
        int pc = 6;

        for(int r = 0; r<9; r++) {
            for(int c = 0; c<9; c++) {
                if(r+c >= 4  && r+c<= pr && r<=4) {
                    System.out.print(" ");
                } else if(r > 4  && r+c >= pc && r+c<=12 ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            if(r<=4) {
                pr+=2;
            } else {
                pc+=2;
            }
            System.out.println();
        }
    }

    public void pattern11() {
        System.out.println("\n\n\n");
        int n = 0;
        int pr = 0;
        int pc = 10;

        for(int r = 0; r<9; r++) {
            for(int c = 0; c<9; c++) {
                if(r+c >= pr  && r+c<= 8 && r<=4) {
                    System.out.print("*");
                } else if(r > 4  && r+c >= 8 && r+c<=pc ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            if(r<=4) {
                pr+=2;
            } else {
                pc+=2;
            }
            System.out.println();
        }
    }

    public void pattern12() {
        System.out.println("\n\n\n");
        int n = 0;
        int pr = 0;
        int pc = 10;

        for(int r = 0; r<9; r++) {
            for(int c = 0; c<9; c++) {
                if(r+c >= pr  && r+c<= 8 && r<=4) {
                    System.out.print(" ");
                } else if(r > 4  && r+c >= 8 && r+c<=pc ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            if(r<=4) {
                pr+=2;
            } else {
                pc+=2;
            }
            System.out.println();
        }
    }


}
