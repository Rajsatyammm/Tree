public static int height(Node root) {

            if (root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);
            int maxHeight = Math.max(lh, rh) + 1;
            return maxHeight;
        }
