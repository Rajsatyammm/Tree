public static int calcHeight(Node curr, int n1) {
            if (curr == null) {
                return -1;
            }
            if (curr.data == n1) {
                return 0;
            }

            int lfht = calcHeight(curr.left, n1);
            int rtht = calcHeight(curr.right, n1);

            if (lfht == -1 && rtht == -1) {
                return -1;
            } else if (lfht == -1) {
                return rtht + 1;
            } else {
                return lfht + 1;
            }

        }
