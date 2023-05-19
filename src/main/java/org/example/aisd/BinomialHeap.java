package org.example.aisd;

public class BinomialHeap {

    private Node head;
    private int size;

    public static class Node {
        int value;
        int degree;
        Node child;
        Node sibling;
        Node parent;

        public Node(int value) {
            this.value = value;
            this.degree = 0;
            this.child = null;
            this.sibling = null;
            this.parent = null;
        }
    }

    public BinomialHeap() {
        this.head = null;
        this.size = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        BinomialHeap newHeap = new BinomialHeap();
        newHeap.head = newNode;
        merge(newHeap);
        size++;
    }

    public void remove(int value) {
        if (head == null) {
            return;
        }
        Node nodeToRemove = search(head, value);
        if (nodeToRemove == null) {
            return;
        }
        Node parent = nodeToRemove.parent;
        while (parent != null) {
            swapNodes(nodeToRemove, parent);
            parent = nodeToRemove.parent;
        }
        extractMin();
        size--;
    }

    public boolean contains(int value) {
        if (head == null) {
            return false;
        }
        Node node = search(head, value);
        return node != null;
    }

    public int getSize() {
        return size;
    }

    public int findMin() {
        return head == null ? -1 : head.value;
    }

    public void merge(BinomialHeap otherHeap) {
        if (otherHeap == null) {
            return;
        }
        head = mergeTrees(head, otherHeap.head);
        otherHeap.head = null;
        size += otherHeap.getSize();
    }

    private Node mergeTrees(Node tree1, Node tree2) {
        if (tree1 == null) {
            return tree2;
        }
        if (tree2 == null) {
            return tree1;
        }
        if (tree1.value < tree2.value) {
            tree1.sibling = mergeTrees(tree1.sibling, tree2);
            tree1.parent = tree2;
            tree2.child = tree1;
            tree2.degree++;
            return tree1;
        } else {
            tree2.sibling = mergeTrees(tree2.sibling, tree1);
            tree2.parent = tree1;
            tree1.child = tree2;
            tree1.degree++;
            return tree2;
        }
    }

    private Node search(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (node.value == value) {
            return node;
        }
        Node child = search(node.child, value);
        if (child != null) {
            return child;
        }
        return search(node.sibling, value);
    }

    private void swapNodes(Node node1, Node node2) {
        int tempValue = node1.value;
        node1.value = node2.value;
        node2.value = tempValue;
    }

    private void extractMin() {
        Node minNode = head;
        Node prev = null;
        Node next = head.sibling;
        while (next != null) {
            if (next.value < minNode.value) {
                minNode = next;
                prev = head;
            } else {
                prev = next;
            }
            next = next.sibling;
        }
        if (prev == null && minNode == head) {
            head = head.child;
        } else if (prev == null) {
            head = minNode.sibling;
        } else {
            prev.sibling = minNode.sibling;
        }
        Node child = minNode.child;
        while (child != null) {
            Node tempSibling = child.sibling;
            child.sibling = head;
            head = child;
            child.parent = null;
            child = tempSibling;
        }
    }
}
