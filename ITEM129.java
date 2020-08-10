public class ITEM129 extends ITEM11495{
    static int [] ppp=new int[11];
    static int [] zzz=new int[10];
    static int [] bbb=new int[12];
    static int [] jjj=new int[11];
    static int [] hhh=new int[11];
    static int [] ööö=new int[11];
    static int [] sss=new int[11];

    public void Groos_Requirement2() {
        System.out.println(" ");
        System.out.println("FOR ITEM129");
        System.out.println("  ");
        ppp=new int[]{ kk[0],kk[1],kk[2],kk[3],kk[4],kk[5],kk[6],kk[7],kk[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(ppp[i]+  "\t");
        }

    }
    public void Schedule_Receipt2(){
        System.out.println(" ");
        for(int i=0;i<zzz.length;i++){
            zzz[7]=100;
            System.out.print(zzz[i] +  "\t");
        }
    }
    public void on_Hand2(){
        System.out.println("   ");
        for(int i=0;i<jjj.length-1;i++)      {
            Net_Requirement2();
            if(bbb[i]==0){
                jjj[i+1]=jjj[i]+zzz[i]-ppp[i];
            }else{
                if(bbb[i]%40==0){
                    jjj[i+1]=0;
                }else{
                    jjj[i+1]=((((bbb[i]/40)+1)*40)-bbb[i]);
                }



            }

            System.out.printf(jjj[i]+  "\t");


        }
        System.out.println("  ");
        for(int i=0;i<bbb.length-2;i++)      {
            if(ppp[i]!=0){
                if (ppp[i]>=zzz[i]+jjj[i]){
                    bbb[i]=ppp[i]-zzz[i]-jjj[i];
                }else {
                    bbb[i]=0;
                }
            }else{
                bbb[i]=0;
            }
            System.out.printf(bbb[i]+  "\t");
        }

    }
    public void Net_Requirement2(){

        for(int i=0;i<bbb.length-2;i++)      {
            if(ppp[i]!=0){
                if (ppp[i]>=zzz[i]+jjj[i]){
                    bbb[i]=ppp[i]-zzz[i]-jjj[i];
                }else {
                    bbb[i]=0;
                }
            }else{
                bbb[i]=0;
            }

        }

    }
    public void TimePhased (){
        System.out.println("  ");
        hhh=new int[]{ bbb[4],bbb[5],bbb[6],bbb[7],bbb[8],bbb[9],0,0,0,0 };
        for(int i=0;i<10;i++){
            System.out.print(hhh[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        ööö=new int[]{ hhh[0],hhh[1],hhh[2],hhh[3],hhh[4],hhh[5],hhh[6],hhh[7],hhh[8],hhh[9] };
        for(int i=0;i<10;i++){
            if (hhh[i]!=0){
                if(bbb[i+4]%40==0){
                    ööö[i]=bbb[i+4];
                }else{
                    ööö[i]=(((bbb[i+4]/40)+1)*40);
                }
            }
            System.out.print(ööö[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("   ");
        sss=new int[]{ 0,0,0,0,ööö[0],ööö[1],ööö[2],ööö[3],ööö[4],ööö[5],ööö[6] };
        for(int i=0;i<10;i++){
            System.out.print(sss[i]+  "\t");
        }
    }
}
