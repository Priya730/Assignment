static ArrayList<Integer> bubble_sort(ArrayList<Integer> ar)
  {
    if (ar.size() <= 1)
      return ar;
 
    if (ar.size() == 2) {
      if (ar.get(0) < ar.get(1))
        return ar;
      else
        return new ArrayList<Integer>(
        Arrays.asList(ar.get(1), ar.get(0)));
    }
    int a = ar.get(0);
    int b = ar.get(1);
 
    ArrayList<Integer> bs = new ArrayList<>();
    for (int i = 2; i < ar.size(); i++)
      bs.add(ar.get(i));

    ArrayList<Integer> res = new ArrayList<>();

    if (a < b) {
      ArrayList<Integer> temp1 = new ArrayList<>();
      temp1.add(b);
      for (int i = 0; i < bs.size(); i++)
        temp1.add(bs.get(i));
 
      ArrayList<Integer> v = bubble_sort(temp1);
      v.add(0, a);
      res = v;
    }
    else {
      ArrayList<Integer> temp1 = new ArrayList<>();
      temp1.add(a);
      for (int i = 0; i < bs.size(); i++)
        temp1.add(bs.get(i));
 
      ArrayList<Integer> v = bubble_sort(temp1);
      v.add(0, b);
      res = v;
    }

    ArrayList<Integer> pass = new ArrayList<>();
    for (int i = 0; i < res.size() - 1; i++)
      pass.add(res.get(i));
 
    ArrayList<Integer> ans = bubble_sort(pass);
    ans.add(res.get(res.size() - 1));
    return ans;
  }
