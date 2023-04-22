//Balanced BST id the BST having the height as less as possible 

public static Node buildBSTFromSA(Node root, int[] arr, int si, int ei) {
            if(si > ei) {
                return null;
            }
            int mid = si + (ei - si) / 2;

            root = new Node(arr[mid]);
            root.left = buildBSTFromSA(root, arr, si, mid - 1);
            root.right = buildBSTFromSA(root, arr, mid + 1, ei);
            
            return root;
        }
