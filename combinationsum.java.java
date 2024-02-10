class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
         ArrayList<Integer> list = new ArrayList<>();
          //Arrays.sort(candidates);
           print(candidates,target,list,ans);
         
         
          return ans;

    }
    public static void print(int a[],int target,List<Integer> list,List<List<Integer>> ans)
    {   

        if(target==0)
        {   
            List<Integer> list_2=new ArrayList<>(list);
            Collections.sort(list_2);
            if(!ans.contains(list_2))
              {
                 ans.add(new ArrayList<>(list_2));
              }
            
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=0;i<a.length;i++)
        {   

            list.add(a[i]);
            print(a,target-a[i],list,ans);
            list.remove(list.size()-1);
        }
    }
}