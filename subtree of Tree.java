public static boolean isIdentical(Node node, Node subroot) {
            // if node and subnode both becomes null then return true bcz nthing to cmpare
            if (node == null && subroot == null) {
                return true;
            } else {
                // if node is null but subroot is not null or node.data not equals to
                // subnode.data then return false
                if (node == null || subroot == null || node.data != subroot.data) {
                    return false;
                }
            }

            // cheak if the left part is identical
            if (!isIdentical(node.left, subroot.left)) {
                return false;
            }
            // cheak if the right part is identical
            if (!isIdentical(node.right, subroot.right)) {
                return false;
            }

            return true;
        }

        public static boolean isSubtree(Node root, Node subroot) {
            // base case
            // if root becomes null then return false bcuz nthing left to compare to the
            // subroot
            if (root == null) {
                return false;
            }

            if (root.data == subroot.data) { // found node where the root data is same
                if (isIdentical(root, subroot)) { // cheak the whole subtree is identical to root or not
                    return true;
                }
            }

            // if any of the subtree having the root data equal to subtree data then return
            // true otherwise false
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

        }
