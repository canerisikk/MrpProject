import java.awt.font.FontRenderContext;
public class ITEM118 extends ITEM1605 {
    static int[] aaa=new int[10];
    static int [] bbb=new int[10];
    static int [] ccc=new int[11];
    static int [] ddd=new int[12];
    static int [] eee=new int[11];
    static int [] fff=new int[11];
    static int [] qqq=new int[11];

    public void Groos_Requirement2() {
        System.out.println(" ");
        System.out.println("FOR ITEM118");
        System.out.println("  ");
        aaa=new int[]{ kk[0],kk[1],kk[2],kk[3],kk[4],kk[5],kk[6],kk[7],kk[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(aaa[i]+  "\t");
        }

    }

    public void Schedule_Receipt(){
        System.out.println("   ");
        bbb[1]=50;
        for(int i=0;i<bbb.length-1;i++){
            System.out.print(bbb[i] +  "\t");
        }

    }

    public void on_Hand(){
        System.out.println("   ");
        for(int i=0;i<ccc.length-1;i++)      {
            if(aaa[i]==0){
                ccc[i+1]=bbb[i]+ ccc[i];
            }else if(aaa[i]<bbb[i]+ccc[i]) {
                ccc[i+1]=bbb[i]+ccc[i]-aaa[i];
            }
            else{
                if(aaa[i]!=ddd[i]){
                    ccc[i+1]=0;

                }else{
                    ccc[i+1]=aaa[i]-ddd[i];
                }
            }
            System.out.print(ccc[i]+  "\t");
        }

    }

    public void Net_Requirement(){
        System.out.println("  ");
        for(int i=0;i<ddd.length-2;i++)      {
            if(aaa[i]>(bbb[i]+ccc[i])){
                ddd[i]=aaa[i]-bbb[i]-ccc[i];
            }else {
                ddd[i]=0;
            }
            System.out.print(ddd[i]+  "\t");
        }
    }
    public void TimePhased (){
        System.out.println("  ");
        eee=new int[]{ ddd[2],ddd[3],ddd[4],ddd[5],ddd[6],ddd[7],ddd[8],ddd[9],0,0 };
        for(int i=0;i<10;i++){
            System.out.print(eee[i]+  "\t");
        }
    }
    public void PlannedOrder (){
        System.out.println("  ");
        fff=new int[]{ eee[0],eee[1],eee[2],eee[3],eee[4],eee[5],eee[6],eee[7],eee[8],0 };
        for(int i=0;i<10;i++){
            System.out.print(fff[i]+  "\t");
        }
    }
    public void Delivery (){
        System.out.println("  ");
        qqq=new int[]{ ddd[0],ddd[1],ddd[2],ddd[3],ddd[4],ddd[5],ddd[6],ddd[7],ddd[8],ddd[9] };
        for(int i=0;i<10;i++){
            System.out.print(qqq[i]+  "\t");
        }
    }

}