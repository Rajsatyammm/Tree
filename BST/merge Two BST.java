// merge two BST
        public static Node mergeBST(Node root1, Node root2) {
            ArrayList<Integer> list1 = new ArrayList<>();
            inOrderStore(root1, list1);
            ArrayList<Integer> list2 = new ArrayList<>();
            inOrderStore(root2, list2);

            // merging list1 && list2
            ArrayList<Integer> finalList = new ArrayList<>();

            int i = 0, j = 0;
            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i) <= list2.get(j)) {
                    finalList.add(list1.get(i));
                    i++;
                } else {
                    finalList.add(list2.get(j));
                    j++;
                }
            }

            while (i < list1.size()) {
                finalList.add(list1.get(i));
                i++;
            }

            while (j < list1.size()) {
                finalList.add(list2.get(j));
                j++;
            }
            
            return buildBST(finalList, 0, finalList.size() - 1);
        }

        public static void inOrderStore(Node root, ArrayList<Integer> list) {
            if (root == null) {
                return;
            }
            inOrderStore(root.left, list);
            list.add(root.data);
            inOrderStore(root.right, list);
        }

        public static Node buildBST(ArrayList<Integer> list, int si, int ei) {
            if (si > ei) {
                return null;
            }
            int mid = (si + ei) / 2;
            Node root = new Node(list.get(mid));
            root.left = buildBST(list, si, mid - 1);
            root.right = buildBST(list, mid + 1, ei);

            return root;
        }
