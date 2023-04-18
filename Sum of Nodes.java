public static int sumOfNodes(Node root) {
            // base case
            if (root == null) {
                return 0;
            }

            // recursive step
            int lNode = sumOfNodes(root.left);
            int rNode = sumOfNodes(root.right);
            return (lNode + rNode + root.data);
        }
