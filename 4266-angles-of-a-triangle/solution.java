class Solution {

    boolean exists(int a,int b,int c){
        if((a+b>c) && (a+c>b) && (b+c>a)){
            return true;
        }

        return false;
    }

 

    public double[] internalAngles(int[] sides) {

        int a=sides[0];
        int b = sides[1];
        int c = sides[2];

        double angle[] = new double[3];

        if(!exists(a,b,c)) return new double[0];

        double A = ((b*b)+(c*c)-(a*a)) / (2.0*b*c);
        A = Math.toDegrees(Math.acos(A));

        double B = ((a*a)+(c*c)-(b*b))/ (2.0*a*c);

          B = Math.toDegrees(Math.acos(B));

        double C = ((a*a)+(b*b)-(c*c))/ (2.0*a*b);

          C = Math.toDegrees(Math.acos(C));


        angle[0] = A;
        angle[1] = B;
        angle[2] = C;

    Arrays.sort(angle);

    return angle;





        
    }
}
