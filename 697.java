class Solution {
    public int findShortestSubArray(int[] nums) {
        List<Node> list = new ArrayList<Node>();
			
			for(int i=0; i<nums.length; i++) {
				Node temp = new Node(nums[i], i);
				if(list.contains(temp)) {
					int index = list.indexOf(temp);
					list.get(index).count++;
					list.get(index).len = i-list.get(index).start+1;
				} else {
					list.add(temp);
				}
			}
	
			Collections.sort(list);
			
			int index = 0;
			for(int i=1; i<list.size(); i++) {
				if(list.get(i).count<list.get(index).count)
					break;
				if(list.get(i).len<list.get(index).len)
					index = i;
			}
        return list.get(index).len;
    }
}
class Node implements Comparable<Node>{
	public int no;
	public int start;
	public int len;
	public int count;
	public Node(int no, int start) {
		this.no = no;
		this.start = start;
		this.len = 1;
		this.count = 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(((Node)obj).no == this.no)
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.count<o.count)
			return 1;
		else if(this.count>o.count)
			return -1;
		return 0;
	}
	
}
