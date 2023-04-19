public static int KAncistor(Node root, int n, int k) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int lft = KAncistor(root.left, n, k);
            int rght = KAncistor(root.right, n, k);

            if (lft == -1 && rght == -1) {
                return -1;
            }
            int max = Math.max(lft, rght);
            if (max + 1 == k) {
                return root.data;
            }
            return max + 1;
        }
