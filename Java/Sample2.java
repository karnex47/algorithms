diameter(Node root) {
  int countLeft = 0;
  int countRight = 0;
  Node conductor;
  //calculate left
  conductor = root;
  while(condu
}

public static int getCount(Node root) {
  int count = 0;
  count = Math.max(getCount(root.left), getCount(root.right));
  
}