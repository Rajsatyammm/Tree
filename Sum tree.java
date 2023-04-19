public static int sumTree(Node root) {
            if(root == null) {
                return 0;
            }
            int left = sumTree(root.left);
            int right = sumTree(root.right);
            int data = root.data;
            int ltData = root.left == null ? 0 : root.left.data;
            int rtData = root.right == null ? 0 : root.right.data;
            root.data = left + right + ltData + rtData;
            return data;
        }
