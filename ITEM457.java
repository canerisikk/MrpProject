public class ITEM457 extends ITEM13122{

    static int[] c=new int[10];
    static int [] d=new int[10];
    static int [] aa=new int[11];
    static int [] cc=new int[12];
    static int [] ww=new int[11];
    static int [] kk=new int[11];
    static int [] qq=new int[11];

    public void Groos_Requirement2() {
        System.out.println(" ");
        System.out.println("FOR ITEM457");
        System.out.println("  ");
        c=new int[]{ ööö[0],ööö[1],ööö[2],ööö[3],ööö[4],ööö[5],ööö[6],ööö[7],ööö[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(c[i]+  "\t");
        }

    }


    public void Schedule_Receipt(){
        System.out.println(" ");
        for(int i=0;i<d.length;i++){
            d[1]=20;
            System.out.print(d[i] +  "\t");
        }
    }
    public void on_Hand(){
        System.out.println("   ");
        for(int i=0;i<aa.length-1;i++)      {
            if(c[i]==0){
                aa[i+1]=d[i]+ aa[i];
            }else{
                if(c[i]!=cc[i]){
                    aa[i+1]=0;

                }else{
                    aa[i+1]=c[i]-cc[i];
                }
            }
            System.out.print(aa[i]+  "\t");
        }

    }

    public void Net_Requirement(){
        System.out.println("  ");
        for(int i=0;i<cc.length-2;i++)      {
            if  (c[i]>(d[i]+aa[i])) {
                cc[i]=c[i]-d[i]-aa[i];
            }  else  {
                cc[i]=0;
            }
            System.out.print(cc[i]+  "\t");
        }





    }
    public void TimePhased (){
        System.out.println("  ");
        ww=new int[]{ cc[2],cc[3],cc[4],cc[5],cc[6],cc[7],cc[8],cc[9],0,0 };
        for(int i=0;i<10;i++){
            System.out.print(ww[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        kk=new int[]{ ww[0],ww[1],ww[2],ww[3],ww[4],ww[5],ww[6],ww[7],ww[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(kk[i]+  "\t");
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
