public class ITEM14127 extends ITEM314 {

    static int[] yyy1 = new int[11]; //gross
    static int[] yyy2 = new int[10]; //schedule
    static int[] yyy3 = new int[11]; //on hand
    static int[] yyy4 = new int[11];//time phased
    static int[] yyy5 = new int[11];//planned order
    static int[] yyy6 = new int[11];//delivery
    static int[] yyy7 = new int[12];//net

    public void Groos_Requirement2() {
        System.out.println(" ");
        System.out.println("FOR ITEM14127");
        System.out.println("  ");
        yyy1=new int[]{ (kk[0]*4)+6*xxx6[0],(kk[1]*4)+6*xxx6[1],(kk[2]*4)+6*xxx6[2],(kk[3]*4)+6*xxx6[3],(kk[4]*4)+6*xxx6[4],(kk[5]*4)+6*xxx6[5],(kk[6]*4)+6*xxx6[6],(kk[7]*4)+6*xxx6[7],(kk[8]*4)+6*xxx6[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(yyy1[i]+  "\t");
        }
    }
    public void Schedule_Receipt2(){
        System.out.println(" ");
        for(int i=0;i<yyy2.length;i++){
            System.out.print(yyy2[i] +  "\t");
        }
    }
    public void on_Hand2(){
        yyy3[0]=60;
        System.out.println("   ");
        for(int i=0;i<yyy3.length-1;i++)      {
            Net_Requirement2();
            if(yyy7[i]==0){
                yyy3[i+1]=yyy3[i]+yyy2[i]-yyy1[i];
            }else{
                if(yyy7[i]%100==0){
                    yyy3[i+1]=0;
                }else{
                    yyy3[i+1]=((((yyy7[i]/100)+1)*100)-yyy7[i]);
                }



            }

            System.out.printf(yyy3[i]+  "\t");


        }
        System.out.println("  ");
        for(int i=0;i<yyy7.length-2;i++)      {
            if(yyy1[i]!=0){
                if (yyy1[i]>=yyy2[i]+yyy3[i]){
                    yyy7[i]=yyy1[i]-yyy2[i]-yyy3[i];
                }else {
                    yyy7[i]=0;
                }
            }else{
                yyy7[i]=0;
            }
            System.out.printf(yyy7[i]+  "\t");
        }

    }
    public void Net_Requirement2(){

        for(int i=0;i<yyy7.length-2;i++)      {
            if(yyy1[i]!=0){
                if (yyy1[i]>=yyy2[i]+yyy3[i]){
                    yyy7[i]=yyy1[i]-yyy2[i]-yyy3[i];
                }else {
                    yyy7[i]=0;
                }
            }else{
                yyy7[i]=0;
            }

        }

    }
    public void TimePhased (){
        System.out.println("  ");
        yyy4=new int[]{ yyy7[1],yyy7[2],yyy7[3],yyy7[4],yyy7[5],yyy7[6],yyy7[7],yyy7[8],yyy7[9],0 };
        for(int i=0;i<10;i++){
            System.out.print(yyy4[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        yyy5=new int[]{ yyy4[0],yyy4[1],yyy4[2],yyy4[3],yyy4[4],yyy4[5],yyy4[6],yyy4[7],yyy4[8],0 };
        for(int i=0;i<10;i++){
            if (yyy4[i]!=0){
                yyy5[i]=(((yyy7[i+1]/100)+1)*100);
            }
            System.out.print(yyy5[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("   ");
        yyy6=new int[]{ 0,yyy5[0],yyy5[1],yyy5[2],yyy5[3],yyy5[4],yyy5[5],yyy5[6],yyy5[7],yyy5[8],yyy5[9] };
        for(int i=0;i<10;i++){
            System.out.print(yyy6[i]+  "\t");
        }
    }




}