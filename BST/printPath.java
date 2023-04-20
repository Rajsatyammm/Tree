static ArrayList<Node> path = new ArrayList<>();

        public static void printPath(Node root) {
            if (root == null) {
                for (int i = 0; i < path.size(); i++) {
                    // Node pth = path.get
                    System.out.print((path.get(i)).data + " ");
                }
                System.out.println();
                return;
            }

            path.add(root);
            if (root.left != null) {
                printPath(root.left);
            }
            path.remove(path.size() - 1);
            if (root.right != null) {
                printPath(root.right);
            }
        }
