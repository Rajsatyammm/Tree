public static void printInRange(Node root, int k1, int k2) {
            if (root == null) {
                return;
            }
            if (root.data >= k1 && root.data <= k2) {
                printInRange(root.left, k1, k2);
                System.out.print(root.data + " ");
                printInRange(root.right, k1, k2);
            } else if (root.data < k1) {
                printInRange(root.right, k1, k2);
            } else {
                printInRange(root.left, k1, k2);
            }
        }
