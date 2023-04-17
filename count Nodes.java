public static int countNodes(Node root) {
            // base case
            if (root == null) {
                return 0;
            }

            // recursive step
            int lNode = countNodes(root.left);
            int rNode = countNodes(root.right);
            return (lNode + rNode + 1);
        }
