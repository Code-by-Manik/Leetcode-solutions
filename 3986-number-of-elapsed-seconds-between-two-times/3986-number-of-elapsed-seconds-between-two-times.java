class Solution {

    static int tosec(String Time){
        
        int h = Integer.parseInt(Time.substring(0,2)) * 3600;
        int m = Integer.parseInt(Time.substring(3,5)) * 60;
        int s = Integer.parseInt(Time.substring(6,8));

    return (h+m+s);

    }


    public int secondsBetweenTimes(String startTime, String endTime) {

        int ST = tosec(startTime);
        int ET = tosec(endTime);

        return ET - ST;

        
    }
}