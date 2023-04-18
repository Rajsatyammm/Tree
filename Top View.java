public static class Infoo {
            Node node;
            int hd; // horizontal distance

            public Infoo(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {

            Queue<Infoo> q = new LinkedList<>(); // for level order traversal
            Map<Integer, Node> map = new HashMap<>();
            int min = 0, max = 0;

            q.add(new Infoo(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Infoo curr = q.remove();
                if (curr == null) {
                    // System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {

                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }

                    if (curr.node.left != null) {
                        q.add(new Infoo(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);

                    }

                    if (curr.node.right != null) {
                        q.add(new Infoo(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }

        }
