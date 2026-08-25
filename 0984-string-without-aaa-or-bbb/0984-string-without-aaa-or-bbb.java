class Solution {
    public String strWithout3a3b(int a, int b) {
        String str = "";

        while(a>0 || b>0){
            if(a==b){
                
                str+='a';
                a--;
                str+='b';
                b--;

            }
            else if(a>b){
                for(int i=0;i<2;i++){
                    if(a>0){
                    str+='a';
                    a--;
                    }
                    else{
                        break;
                    }
                }
                if(b>0){
                str+='b';
                b--;
                }
            }
            else{

                for(int i=0;i<2;i++){
                    if(b>0){
                    str+='b';
                    b--;
                    }
                    else{
                        break;
                    }
                }
                if(a>0){
                str+='a';
                a--;
                }

            }
        }
        return str;
    }
}