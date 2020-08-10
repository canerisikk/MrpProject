public class ITEM11495 extends ITEM13122 {

    static int[] c=new int[10];
    static int [] d=new int[10];
    static int [] jjj=new int[11];
    static int [] bbb=new int[12];
    static int [] ww=new int[11];
    static int [] kk=new int[11];
    static int [] qq=new int[11];

    public void Groos_Requirement2() {
        System.out.println(" ");
        System.out.println("FOR ITEM11495");
        System.out.println("  ");
        c=new int[]{ ööö[0],ööö[1],ööö[2],ööö[3],ööö[4],ööö[5],ööö[6],ööö[7],ööö[8],0 };
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
    public void on_Hand2(){
        jjj[0]=120;
        System.out.println("   ");
        for(int i=0;i<jjj.length-1;i++)      {
            Net_Requirement2();
            if(c[i]<=d[i]+jjj[i]){
                jjj[i+1]=jjj[i]+d[i]-c[i];
            }else{
                if(bbb[i]%50==0){
                    jjj[i+1]=0;
                }else{
                    jjj[i+1]=((((bbb[i]/50)+1)*50)-bbb[i]);
                }



            }

            System.out.printf(jjj[i]+  "\t");


        }
        System.out.println("  ");
        for(int i=0;i<bbb.length-2;i++)      {
            if(c[i]!=0){
                if (c[i]>=d[i]+jjj[i]){
                    bbb[i]=c[i]-d[i]-jjj[i];
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
            if(c[i]!=0){
                if (c[i]>=d[i]+jjj[i]){
                    bbb[i]=c[i]-d[i]-jjj[i];
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
        ww=new int[]{ bbb[1],bbb[2],bbb[3],bbb[4],bbb[5],bbb[6],bbb[7],bbb[8],bbb[9],0 };
        for(int i=0;i<10;i++){
            System.out.print(ww[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        kk=new int[]{ ww[0],ww[1],ww[2],ww[3],ww[4],ww[5],ww[6],ww[7],ww[8],0 };
        for(int i=0;i<10;i++){
            if (ww[i]!=0){
                if(bbb[i+1]%50==0){
                    kk[i]=bbb[i+1];
                }else{
                    kk[i]=(((bbb[i+1]/50)+1)*50);
                }
            }
            System.out.print(kk[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("  ");
        qq=new int[]{ 0,kk[0],kk[1],kk[2],kk[3],kk[4],kk[5],kk[6],kk[7],kk[8] };
        for(int i=0;i<10;i++){
            System.out.print(qq[i]+  "\t");
        }
    }
}
