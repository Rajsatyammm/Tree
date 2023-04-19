public Node addInBST(Node root, int data) {

            Node newNode = new Node(data);
            if (root == null) {
                root = newNode;
                return root;
            }

            if (data <= root.data) {
                root.left = addInBST(root.left, data);
            } else {
                root.right = addInBST(root.right, data);
            }
            return root;
        }
