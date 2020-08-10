public class ITEM2142 extends ITEM314{
    static int[] ccc1 = new int[11]; //gross
    static int[] ccc2 = new int[10]; //schedule
    static int[] ccc3 = new int[11]; //on hand
    static int[] ccc4 = new int[11];//time phased
    static int[] ccc5 = new int[11];//planned order
    static int[] ccc6 = new int[11];//delivery
    static int[] ccc7 = new int[12];//net



    public void Groos_Requirement2() {
        System.out.println(" ");
        System.out.println("FOR ITEM2142");
        System.out.println("  ");
        ccc1=new int[]{ xxx6[0],xxx6[1],xxx6[2],xxx6[3],xxx6[4],xxx6[5],xxx6[6],xxx6[7],xxx6[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(ccc1[i]+  "\t");
        }

    }
    public void Schedule_Receipt2(){
        System.out.println(" ");
        for(int i=0;i<ccc2.length;i++){
            System.out.print(ccc2[i] +  "\t");
        }
    }
    public void on_Hand2(){
        ccc3[0]=80;
        System.out.println("   ");
        for(int i=0;i<ccc3.length-1;i++)      {
            Net_Requirement2();
            if(ccc7[i]==0){
                ccc3[i+1]=ccc3[i]+ccc2[i]-ccc1[i];
            }else{
                if(ccc7[i]%100==0){
                    ccc3[i+1]=0;
                }else{
                    ccc3[i+1]=((((ccc7[i]/100)+1)*100)-ccc7[i]);
                }



            }

            System.out.printf(ccc3[i]+  "\t");


        }
        System.out.println("  ");
        for(int i=0;i<ccc7.length-2;i++)      {
            if(ccc1[i]!=0){
                if (ccc1[i]>=ccc2[i]+ccc3[i]){
                    ccc7[i]=ccc1[i]-ccc2[i]-ccc3[i];
                }else {
                    ccc7[i]=0;
                }
            }else{
                ccc7[i]=0;
            }
            System.out.printf(ccc7[i]+  "\t");
        }

    }
    public void Net_Requirement2(){

        for(int i=0;i<ccc7.length-2;i++)      {
            if(ccc1[i]!=0){
                if (ccc1[i]>=ccc2[i]+ccc3[i]){
                    ccc7[i]=ccc1[i]-ccc2[i]-ccc3[i];
                }else {
                    ccc7[i]=0;
                }
            }else{
                ccc7[i]=0;
            }

        }

    }
    public void TimePhased (){
        System.out.println("  ");
        ccc4=new int[]{ccc7[2],ccc7[3],ccc7[4],ccc7[5],ccc7[6],ccc7[7],ccc7[8],ccc7[9],0,0 };
        for(int i=0;i<10;i++){
            System.out.print(ccc4[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        ccc5=new int[]{ ccc4[0],ccc4[1],ccc4[2],ccc4[3],ccc4[4],ccc4[5],ccc4[6],ccc4[7],ccc4[8],0 };
        for(int i=0;i<10;i++){
            if (ccc4[i]!=0){
                ccc5[i]=(((ccc5[i+1]/100)+1)*100);
            }
            System.out.print(ccc5[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("   ");
        ccc6=new int[]{ 0,0,ccc5[0],ccc5[1],ccc5[2],ccc5[3],ccc5[4],ccc5[5],ccc5[6],ccc5[7],ccc5[8] };
        for(int i=0;i<10;i++){
            System.out.print(ccc6[i]+  "\t");
        }
    }



}