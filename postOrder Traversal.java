public static void traversePostorder(Node root) {
            if (root == null) {
                return;
            }

            traversePostorder(root.left);
            traversePostorder(root.right);
            System.out.print(root.data + " ");

        }
