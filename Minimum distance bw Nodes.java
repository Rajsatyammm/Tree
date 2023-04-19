public static int minmDistbwnNodes(Node root, int n1, int n2) {
            Node curr = lca(root, n1, n2);

            int dist1 = calcHeight(curr, n1);
            int dist2 = calcHeight(curr, n2);

            return dist1 + dist2;
        }
