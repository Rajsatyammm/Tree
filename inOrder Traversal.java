public static void traverseInorder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            traverseInorder(root.left);
            System.out.print(root.data + " ");
            traverseInorder(root.right);
        }
