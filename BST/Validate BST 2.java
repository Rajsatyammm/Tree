// Approach : 2
        public static boolean isValidBST(Node root, Node min, Node max) {
            // initially min && max == null
            if (root == null) {
                return true;
            }

            if (min != null && root.data <= min.data) {
                return false;
            } else if (max != null && root.data >= max.data) {
                return false;
            }

            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }
