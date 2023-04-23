// return the no of nodes in Valid BST
public static class Info {
            boolean isValid;
            int size;
            int min;
            int max;

            public Info(boolean isValid, int size, int min, int max) {
                this.isValid = isValid;
                this.size = size;
                this.min = min;
                this.max = max;
            }
        }

        public static int maxBSTSize = 0;

        public static Info largestBST(Node root) {
            if (root == null) {
                return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            }

            Info leftInfo = largestBST(root.left);
            Info rightInfo = largestBST(root.right);

            int size = leftInfo.size + rightInfo.size + 1;
            int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
            int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

            if (root.data <= leftInfo.max && root.data >= rightInfo.min) {
                return new Info(false, size, min, max);
            }

            if (leftInfo.isValid && rightInfo.isValid) {
                maxBSTSize = Math.max(maxBSTSize, size);
                return new Info(true, size, min, max);
            }

            return new Info(false, size, min, max);
        }
