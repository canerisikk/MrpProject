public class ITEM062 extends ITEM13122{
    static int[] aaa=new int[10];
    static int [] d=new int[10];
    static int [] aa=new int[11];
    static int [] cc=new int[12];
    static int [] nnn=new int[11];
    static int [] mmm=new int[11];

    public void Groos_Requirement3() {

        System.out.println(" ");
        System.out.println("FOR ITEM062");
        System.out.println("  ");
        aaa=new int[]{ (kk[0]*4)+2*ööö[0],(kk[1]*4)+2*ööö[1],(kk[2]*4)+(2*ööö[2]),(kk[3]*4)+2*ööö[3],(kk[4]*4)+2*ööö[4],(kk[5]*4)+2*ööö[5],(kk[6]*4)+2*ööö[6],(kk[7]*4)+2*ööö[7],(kk[8]*4)+2*ööö[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(aaa[i]+  "\t");
        }
    }
    public void Schedule_Receipt3(){
        System.out.println(" ");
        for(int i=0;i<zzz.length;i++){
            d[5]=100;
            System.out.print(d[i] +  "\t");
        }
    }
    public void on_Hand3(){
        aa[0]=50;
        System.out.println("   ");
        for(int i=0;i<aa.length-1;i++)      {
            if(aaa[i]==0){
                aa[i+1]=d[i]+ aa[i];
            }else{
                if(aaa[i]!=cc[i]){
                    aa[i+1]=0;

                }else{
                    aa[i+1]=aaa[i]-cc[i];
                }
            }
            System.out.print(aa[i]+  "\t");
        }

    }

    public void Net_Requirement3(){
        System.out.println("  ");
        for(int i=0;i<cc.length-2;i++){
            if  (aaa[i]>(d[i]+aa[i])) {
                cc[i]=aaa[i]-d[i]-aa[i];
            }  else  {
                cc[i]=0;
            }
            System.out.print(cc[i]+  "\t");
        }





    }
    public void TimePhased (){
        System.out.println("  ");
        nnn=new int[]{ cc[2],cc[3],cc[4],cc[5],cc[6],cc[7],cc[8],cc[9],0,0 };
        for(int i=0;i<10;i++){
            System.out.print(nnn[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        mmm=new int[]{ nnn[0],nnn[1],nnn[2],nnn[3],nnn[4],nnn[5],nnn[6],nnn[7],0,0 };
        for(int i=0;i<10;i++){
            System.out.print(mmm[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("  ");
        qq=new int[]{ cc[0],cc[1],cc[2],cc[3],cc[4],cc[5],cc[6],cc[7],cc[8],cc[9] };
        for(int i=0;i<10;i++){
            System.out.print(qq[i]+  "\t");
        }
    }
}