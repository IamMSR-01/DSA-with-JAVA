package Day8;

public class TrieDS {

    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26];
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.endOfWord == false) {
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static boolean startWith(String prefix){
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }
    public static boolean wordBreak(String key){
        if (key.length() == 0) {
            return true;
        }
        for (int i = 0; i < key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);

            if (search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }

        return false;
    }

    public static int countNode(Node root){
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }

        return count + 1;
    }
    public static void main(String[] args) {
        String str = "ababa";

        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
