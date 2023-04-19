public boolean search(Node root, int data) {
            if (root == null) {
                return false;
            }
            if (root.data == data) {
                return true;
            }
            // boolean left, right;
            if (data > root.data) {
                return search(root.right, data);
            } else {
                return search(root.left, data);
            }

        }
