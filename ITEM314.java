public class ITEM314 extends ITEM1605 {
    static int[] xxx1 = new int[11]; //gross
    static int[] xxx2 = new int[10]; //schedule
    static int[] xxx3 = new int[11]; //on hand
    static int[] xxx5 = new int[11];//time phased
    static int[] xxx6 = new int[11];//planned order
    static int[] xxx7 = new int[11];//delivery
    static int[] xxx8 = new int[12];//net


    public void Groos_Requirement2() {

        System.out.println(" ");
        System.out.println("FOR ITEM314");
        System.out.println("  ");
        xxx1 = new int[]{kk[0], kk[1], kk[2], kk[3], kk[4], kk[5], kk[6], kk[7], kk[8], 0};
        for (int i = 0; i < 10; i++) {
            System.out.print(xxx1[i] +  "\t");
        }

    }

    public void Schedule_Receipt2() {
        System.out.println(" ");
        for (int i = 0; i < xxx2.length; i++) {
            xxx2[4] = 50;
            System.out.print(xxx2[i] +  "\t");
        }
    }

    public void on_Hand2() {
        System.out.println("   ");
        for (int i = 0; i < xxx3.length - 1; i++) {
            Net_Requirement2();
            if (xxx8[i] == 0) {
                xxx3[i + 1] = xxx3[i] + xxx2[i] - xxx1[i];
            } else {
                if (xxx8[i] % 50 == 0) {
                    xxx3[i + 1] = 0;
                } else {
                    xxx3[i + 1] = ((((xxx8[i] / 50) + 1) * 50) - xxx8[i]);
                }


            }

            System.out.printf(xxx3[i] +  "\t");


        }
        System.out.println("  ");
        for (int i = 0; i < xxx8.length - 2; i++) {
            if (xxx1[i] != 0) {
                if (xxx1[i] >= xxx2[i] + xxx3[i]) {
                    xxx8[i] = xxx1[i] - xxx2[i] - xxx3[i];
                } else {
                    xxx8[i] = 0;
                }
            } else {
                xxx8[i] = 0;
            }
            System.out.printf(xxx8[i] +  "\t");
        }
    }

    public void Net_Requirement2() {

        for (int i = 0; i < xxx8.length - 2; i++) {
            if (xxx1[i] != 0) {
                if (xxx1[i] >= xxx2[i] + xxx3[i]) {
                    xxx8[i] = xxx1[i] - xxx2[i] - xxx3[i];
                } else {
                    xxx8[i] = 0;
                }
            } else {
                xxx8[i] = 0;
            }

        }

    }

    public void TimePhased() {
        System.out.println("  ");
        xxx5 = new int[]{xxx8[1], xxx8[2], xxx8[3], xxx8[4], xxx8[5], xxx8[6], xxx8[7], xxx8[8], xxx8[9], 0};
        for (int i = 0; i < 10; i++) {
            System.out.print(xxx5[i] +  "\t");
        }
    }

    public void PlannedOrder() {
        System.out.println("  ");
        xxx6 = new int[]{xxx5[0], xxx5[1], xxx5[2], xxx5[3], xxx5[4], xxx5[5], xxx5[6], xxx5[7], xxx5[8], 0};
        for (int i = 0; i < 10; i++) {
            if (xxx5[i] != 0) {
                xxx6[i] = (((xxx8[i + 1] / 50) + 1) * 50);
            }
            System.out.print(xxx6[i] +  "\t");
        }
    }

    public void Delivery() {
        System.out.println("   ");
        xxx7 = new int[]{0, xxx6[0], xxx6[1], xxx6[2], xxx6[3], xxx6[4], xxx6[5], xxx6[6], xxx6[7], xxx6[8], xxx6[9]};
        for (int i = 0; i < 10; i++) {
            System.out.print(xxx7[i] +  "\t");
        }
    }

}