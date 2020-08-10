public class ITEM1118 extends ITEM11495{

    static int[] c=new int[10];
    static int [] d=new int[10];
    static int [] aa=new int[11];
    static int [] cc=new int[12];
    static int [] ww=new int[11];
    static int [] lll=new int[11];
    static int [] qq=new int[11];





    public void Groos_Requirement2() {
        System.out.println(" ");
        System.out.println("FOR ITEM1118");
        System.out.println("  ");
        c=new int[]{ kk[0],kk[1],kk[2],kk[3],kk[4],kk[5],kk[6],kk[7],kk[8],kk[9]};
        for(int i=0;i<10;i++){
            System.out.print(c[i]+  "\t");
        }

    }

    public void Schedule_Receipt(){
        System.out.println(" ");
        for(int i=0;i<d.length;i++){
            System.out.print(d[i] +  "\t");
        }
    }
    public void on_Hand(){
        aa[0]=30;
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
        ww=new int[]{ cc[3],cc[4],cc[5],cc[6],cc[7],cc[8],cc[9],0,0,0 };
        for(int i=0;i<10;i++){
            System.out.print(ww[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        lll=new int[]{ ww[0],ww[1],ww[2],ww[3],ww[4],ww[5],ww[6],ww[7],ww[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(lll[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("  ");
        qq=new int[]{ 0,0,0,lll[0],lll[1],lll[2],lll[3],lll[4],lll[5],lll[6] };
        for(int i=0;i<10;i++){
            System.out.print(qq[i]+  "\t");
        }
    }

}
