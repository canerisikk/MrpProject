public class ITEM019 extends ITEM314{
    static int[] zzz1 = new int[11]; //gross
    static int[] zzz2 = new int[10]; //schedule
    static int[] zzz3 = new int[11]; //on hand
    static int[] zzz4 = new int[11];//time phased
    static int[] zzz5 = new int[11];//planned order
    static int[] zzz6 = new int[11];//delivery
    static int[] zzz7 = new int[12];//net



    public void Groos_Requirement2() {
        String [] week = new String[]{"1","2","3","4","5","6","7","8","9","10"};
        System.out.println(" ");
        System.out.println("FOR ITEM019");
        System.out.println("  ");
        zzz1=new int[]{ xxx6[0],xxx6[1],xxx6[2],xxx6[3],xxx6[4],xxx6[5],xxx6[6],xxx6[7],xxx6[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(zzz1[i]+  "\t");
        }

    }
    public void Schedule_Receipt2(){
        System.out.println(" ");
        for(int i=0;i<zzz2.length;i++){
            zzz2[3]=40;
            System.out.print(zzz2[i] +  "\t");
        }
    }
    public void on_Hand2(){
        zzz3[0]=50;
        System.out.println("   ");
        for(int i=0;i<zzz3.length-1;i++)      {
            Net_Requirement2();
            if(zzz7[i]==0){
                zzz3[i+1]=zzz3[i]+zzz2[i]-zzz1[i];
            }else{
                if(zzz7[i]%50==0){
                    zzz3[i+1]=0;
                }else{
                    zzz3[i+1]=((((zzz7[i]/50)+1)*50)-zzz7[i]);
                }



            }

            System.out.printf(zzz3[i]+  "\t");


        }
        System.out.println("  ");
        for(int i=0;i<zzz7.length-2;i++)      {
            if(zzz1[i]!=0){
                if (zzz1[i]>=zzz2[i]+zzz3[i]){
                    zzz7[i]=zzz1[i]-zzz2[i]-zzz3[i];
                }else {
                    zzz7[i]=0;
                }
            }else{
                zzz7[i]=0;
            }
            System.out.printf(zzz7[i]+  "\t");
        }

    }
    public void Net_Requirement2(){

        for(int i=0;i<zzz7.length-2;i++)      {
            if(zzz1[i]!=0){
                if (zzz1[i]>=zzz2[i]+zzz3[i]){
                    zzz7[i]=zzz1[i]-zzz2[i]-zzz3[i];
                }else {
                    zzz7[i]=0;
                }
            }else{
                zzz7[i]=0;
            }

        }

    }
    public void TimePhased (){
        System.out.println("  ");
        zzz4=new int[]{zzz7[2],zzz7[3],zzz7[4],zzz7[5],zzz7[6],zzz7[7],zzz7[8],zzz7[9],0,0 };
        for(int i=0;i<10;i++){
            System.out.print(zzz4[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        zzz5=new int[]{ zzz4[0],zzz4[1],zzz4[2],zzz4[3],zzz4[4],zzz4[5],zzz4[6],zzz4[7],zzz4[8],0 };
        for(int i=0;i<10;i++){
            if (zzz4[i]!=0){
                if (zzz4[i]%50==0){
                    zzz5[i]=(((zzz7[i+2]/50))*50);
                }else{
                    zzz5[i]=(((zzz7[i+2]/50)+1)*50);
                }
            }
            System.out.print(zzz5[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("   ");
        zzz6=new int[]{ 0,0,zzz5[0],zzz5[1],zzz5[2],zzz5[3],zzz5[4],zzz5[5],zzz5[6],zzz5[7],zzz5[8] };
        for(int i=0;i<10;i++){
            System.out.print(zzz6[i]+  "\t");
        }
    }



}