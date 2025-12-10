public class ShipDay {
    

    public static int   shipWithinDays(int[] weights, int D) {
        int minCap=0;
        int maxCap=0;
        for(int w8:weights)
        {
            minCap=Math.max(minCap,w8);
            maxCap+=w8;
        }

        //apply binary
        while(minCap<maxCap)
        {
            int mid = minCap + (maxCap-minCap)/2;

            //try to ship with mid cap
            int day=1;
            int sum=0;
            for(int weight:weights)
            {
                if(sum+weight>mid)
                {
                    day++;
                    sum=0;
                }
                sum+=weight;
            }

            //if mor daYS REQUIREWD
            if(day>D)
            {
                minCap=mid+1;
            }
            else
            {
                maxCap=mid;
            }

        }
        return minCap;
    }

    public static void main(String[] args) {
        int[] weight={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(weight, days));
    }
}