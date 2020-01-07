class Solution {
    public int[][] merge(int[][] intervals) {
        List<Interval> list = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            list.add(new Interval(intervals[i][0], intervals[i][1]));
        }
        Collections.sort(list, (o1, o2)->{
            if(o1.first > o2.first){
                return 1;
            }else if(o1.first < o2.first){
                return -1;
            }else{
                return o1.second - o2.second;
            }
        });
        LinkedList<Interval> result = new LinkedList<>();
        for(Interval interval : list){
            if(result.isEmpty() || result.getLast().second < interval.first){
                result.add(interval);
            }else {
               result.getLast().second = Math.max(result.getLast().second, interval.second);            
            }
        }
        int[][] r = new int[result.size()][2];
        for(int i=0;i<result.size(); i++){
            r[i][0] = result.get(i).first;
            r[i][1] = result.get(i).second;
        }
        return r;
    }
}
class Interval{
    public int first;
    public int second;
    public Interval(int first, int second){
        this.first = first;
        this.second = second;
    }
}
