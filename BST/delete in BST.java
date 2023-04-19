public Node delete(Node root, int data) {
            if(root == null) {
                return null;
            }

            if(root.data > data) {
                root.left = delete(root.left, data);
            }
            else if(root.data < data) {
                root.right = delete(root.right, data);
            }
            else {
                // case 1 : no child
                if(root.left == null && root.right == null) {
                    return null;
                }

                // case 2 : one child
                if(root.left == null) {
                    return root.right;  
                }
                if(root.right == null) {
                    return root.left;
                }


                // case 3 : two child
                Node IS = findInorderSuccesor(root.right, data);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
            return root;
        }

        public Node findInorderSuccesor(Node root, int data) {
            while(root.left != null) {
                root = root.left;
            }
            return root;
        }
    }
