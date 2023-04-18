//diameter is the distance bween two nodes
public static int findDiameter(Node root) { // T(n) = O(n2)
            // base case
            if (root == null) {
                return 0;
            }
            // recursive step
            int lDia = findDiameter(root.left);
            int rDia = findDiameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int diaUsingRoot = lh + rh + 1;
            return Math.max(diaUsingRoot, Math.max(lDia, rDia));
        }
