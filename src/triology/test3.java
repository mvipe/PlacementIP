package triology;

public class test3 {
    public static void main(String[] args) {
        System.out.println(solve("11001100110"));
        String s="10";

    }

    static int solve(String s){
        if(s.length()==0) return 0;

        int res=0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = i+1; j < s.length(); j++) {
                long ith=Integer.parseInt(s.charAt(i)+"");
                long jth=Integer.parseInt(s.charAt(j)+"");

                if((ith+jth==(ith^jth)) &&  (ith+jth==Integer.parseInt(s))){
                    res=res+1;
                }

                if((1-ith)+jth==((1-ith)^jth) &&  (1-ith+jth==Integer.parseInt(s))){
                    res=res+1;
                }

                if((1-jth)+ith==((1-jth)^ith) && (ith+1-jth==Integer.parseInt(s))){
                    res=res+1;
                }




            }
        }

        return res;


    }

//    static int solve(String s){
//        if(s.length()==0) return 0;
//
//        int res=0;
//        for (int i = 0; i < s.length(); i++) {
//
//            for (int j = i+1; j < s.length(); j++) {
//
//                    int ith=Integer.parseInt(s.substring(i,k));
//                    int jth= Integer.parseInt(s.substring(i,k));
//
//                    if(ith+jth==(ith^jth)){
//                        res=res+1;
//                    }
//
//                    if((1-ith)+jth==((1-ith)^jth)){
//                        res=res+1;
//                    }
//
//                    if((1-jth)+ith==((1-jth)^ith)){
//                        res=res+1;
//                    }
//                }
//
//
//
//
//
//            }
//        }
//
//        return res;
//
//
//    }


}
