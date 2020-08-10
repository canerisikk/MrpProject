import java.awt.font.FontRenderContext;

public class ITEM1605 {
    static int[] c=new int[10];
    static int [] d=new int[10];
    static int [] aa=new int[11];
    static int [] cc=new int[12];
    static int [] ww=new int[11];
    static int [] kk=new int[11];
    static int [] qq=new int[11];





    public void Groos_Requirement(int a,int b,int e,int x,int y,int z,int xx,int xxx,int uuu,int hhh) {
        String [] week = new String[]{"1","2","3","4","5","6","7","8","9","10"};
        c[0]=a;
        c[1]=b;
        c[2]=e;
        c[3]=x;
        c[4]=y;
        c[5]=z;
        c[6]=xx;
        c[7]=xxx;
        c[8]=uuu;
        c[9]=hhh;
        System.out.println(" ");
        System.out.println("FOR ITEM1605");
        System.out.println(" ");
        System.out.println("w1\t"+"w2\t"+"w3\t"+"w4\t"+"w5\t"+"w6\t"+"w7\t"+"w8\t"+"w9\t"+"week10\t"+"\nGroos Requirement"	);
        for(int i=0;i<week.length;i++){
            System.out.print(c[i] + "\t");
        }

    }

    public void Schedule_Receipt(){
        System.out.println(" "+"\nSchedule Receipt");
        for(int i=0;i<d.length;i++){
            System.out.print(d[i] + "\t");
        }
    }
    public void on_Hand(){
        aa[0]=30;
        System.out.println(" "+"\nOn Hand From Prior Period");
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
            System.out.print(aa[i]+ "\t");
        }

    }

    public void Net_Requirement(){
        System.out.println(" "+"\nNet Requirement");
        for(int i=0;i<cc.length-2;i++)      {
            if  (c[i]>(d[i]+aa[i])) {
                cc[i]=c[i]-d[i]-aa[i];
            }  else  {
                cc[i]=0;
            }
            System.out.print(cc[i]+ "\t");
        }





    }
    public void TimePhased (){
        System.out.println(" "+"\nTime Phased Net Requirement");
        ww=new int[]{ cc[1],cc[2],cc[3],cc[4],cc[5],cc[6],cc[7],cc[8],cc[9],0 };
        for(int i=0;i<10;i++){
            System.out.print(ww[i]+ "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println(" "+"\nPlaned Order Releases");
        kk=new int[]{ ww[0],ww[1],ww[2],ww[3],ww[4],ww[5],ww[6],ww[7],ww[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(kk[i]+ "\t");
        }
    }
    public void Delivery (){
        System.out.println(" "+"\nPlaned Order Delivery");
        qq=new int[]{ cc[0],cc[1],cc[2],cc[3],cc[4],cc[5],cc[6],cc[7],cc[8],cc[9] };
        for(int i=0;i<10;i++){
            System.out.print(qq[i]+ "\t");
        }
    }

}