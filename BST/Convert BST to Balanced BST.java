// minimum BST means BST having as less height as possible
public static ArrayList<Integer> l = new ArrayList<>();

        public static void inOrderr(Node root) {
            if (root == null) {
                return;
            }
            inOrderr(root.left);
            l.add(root.data);
            inOrderr(root.right);
        }

        public static Node balancedBST(Node root, int si, int ei) {
            if (si > ei) {
                return null;
            }
            int mid = (si + ei) / 2;
            root = new Node(l.get(mid));
            root.left = balancedBST(root, si, mid - 1);
            root.right = balancedBST(root, mid + 1, ei);
            return root;
        }
