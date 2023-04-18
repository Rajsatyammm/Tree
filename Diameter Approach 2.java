public static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root) {
            // base case
            if (root == null) {
                return new Info(0, 0);
            }

            Info left = diameter(root.left);
            Info right = diameter(root.right);
            int ht = Math.max(left.ht, right.ht) + 1;
            int Diam = Math.max(ht, Math.max(left.diam, right.diam));

            return new Info(Diam, ht);
        }
