public class Main {
    public static void main(String[] args) {

//        Первое задание

        int[] bow = new int[8];// или new int[8]{-1,2,3};
        bow[0]=-1;
        bow[1]=2;
        bow[2]=3;
        bow[3]=6;
        bow[4]=7;
        bow[5]=12;
        bow[6]=11;
        bow[7]=23;

        double[] weight = {1.57,7.654,9.986};

        float[] cut=new float[7];
        cut[0]=5f;
        cut[1]=23f;
        cut[2]=11f; //индекс [3]-[6] равно 0

//        Задача 2

        for (int i = 0; i < bow.length-1; i++) {
            System.out.print(bow[i]+",");
        }
        System.out.println(bow[bow.length-1]);


        for (int i = 0; i < bow.length; i++) {
            if (i<bow.length-1){
                System.out.print(bow[i]+",");
            }else {
                System.out.print(bow[i]);
            }
        }
        System.out.println();




        for (int i = 0; i < weight.length-1; i++) {
            System.out.print(weight[i]+",");
        }
        System.out.println(weight[weight.length-1]);


        for (int i = 0; i < cut.length-1; i++) {
            System.out.print(cut[i]+",");
        }
        System.out.println(cut[cut.length-1]);



//           Третья задача

        for (int i = bow.length-1; i < bow.length&i>=0; i--) {
            if (i>0){
                System.out.print(bow[i]+",");
            }
        }
        System.out.println(bow[0]);


        for (int i = cut.length-1; i < cut.length&i>=0; i--) {
            if (i>0){
                System.out.print(cut[i]+",");
            }
        }
        System.out.println(cut[0]);


        for (int i = weight.length-1; i < weight.length&i>=0; i--) {
            if (i>0){
                System.out.print(weight[i]+",");
            }
        }
        System.out.println(weight[0]);

//        Задание 4

        for (int i=0;i< bow.length;i++){
            if (bow[i]%2!=0){
                System.out.print(bow[i]+1+",");
            }
        }
        System.out.println();


    }
}