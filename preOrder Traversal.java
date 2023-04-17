public static void traversePreorder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            traversePreorder(root.left);
            traversePreorder(root.right);
        }
