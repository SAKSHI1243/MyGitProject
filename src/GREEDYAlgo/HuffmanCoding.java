package GREEDYAlgo;
import java.util.*;
class HuffmanNode {
    char alphabet;
    int frequency;
    HuffmanNode left, right;
    HuffmanNode(char alphabet, int frequency) {
        this.alphabet = alphabet;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
}
public class HuffmanCoding {
        public static void inorder(HuffmanNode root) {
            if (root == null) return;
            inorder(root.left);
            if (root.left == null && root.right == null && root.alphabet != '-') System.out.print(root.alphabet + " ");
            inorder(root.right);
        }
        public static void main(String[] args) {
            int n = 6;
            char[] alphabets = {'a','b','c','d','e','f'};
            int[] freq = {45, 13, 12, 16, 9, 5};
            PriorityQueue<HuffmanNode> pq = new PriorityQueue<>((x, y) -> x.frequency - y.frequency);
            for (int i = 0; i < n; i++) pq.add(new HuffmanNode(alphabets[i], freq[i]));
            while (pq.size() > 1) {
                HuffmanNode left = pq.poll();
                HuffmanNode right = pq.poll();
                HuffmanNode parent = new HuffmanNode('-', left.frequency + right.frequency);
                parent.left = left;
                parent.right = right;
                pq.add(parent);
            }
            HuffmanNode root = pq.peek();
            System.out.print("In-order traversal of the tree (Huffman): ");
            inorder(root);
            System.out.println();
        }
}