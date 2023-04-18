public static void helper(Node node, int level, int k) {
            if (node == null) {
                return;
            }
            if (level == k) {
                System.out.print(node.data + " ");
                return;
            }
            helper(node.left, level + 1, k);
            helper(node.right, level + 1, k);

        }

        public static void kthLevel(Node root, int k) {
            if (k <= 0) {
                return;
            }
            helper(root, 1, k);
        }
