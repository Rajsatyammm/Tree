//Approach 1 : 

public static ArrayList<Integer> list = new ArrayList<>();
        public static void storeInorder(Node root) {
            if (root == null) {
                return;
            }
            storeInorder(root.left);
            list.add(root.data);
            storeInorder(root.right);
        }

        public static boolean cheakBST() {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
            }
            return true;
        }
