class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    HashMap<Integer, Node> mp = new HashMap<>();
    int capacity;
    Node dummyHead = new Node(-1, -1);
    Node dummyTail = new Node(-1, -1);

    public LRUCache(int capacity) {
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!mp.containsKey(key)) {
            return -1;
        }

        Node node = mp.get(key);
        moveForward(node, node.value);
        return node.value;
    }

    public void put(int key, int value) {
        if (mp.containsKey(key)) {
            moveForward(mp.get(key), value);
            return;
        }

        if (mp.size() >= capacity) {
            removeLast();
        }

        insertFront(key, value);
    }
    public void insertFront(int key, int value) {
        Node node = new Node(key, value);

        if (!mp.containsKey(key)) {
            mp.put(key, node);
        }
        Node dNextNode = dummyHead.next;
        dummyHead.next = node;
        node.prev = dummyHead;
        dNextNode.prev = node;
        node.next = dNextNode;
    }

    public void moveForward(Node node, int value) {
        // Detach node
        node.prev.next = node.next;
        node.next.prev = node.prev;

        // Update value
        node.value = value;

        // Insert at front
        Node first = dummyHead.next;

        dummyHead.next = node;
        node.prev = dummyHead;
        node.next = first;
        first.prev = node;
    }
    public void removeLast() {
        Node node = dummyTail.prev;
        Node prevNode = node.prev;
        prevNode.next = dummyTail;
        dummyTail.prev = prevNode;
        mp.remove(node.key);
        return;
    }

    public void printList(String id) {
        System.out.println();
        System.out.print(id + ": ");
        Node curr = dummyHead;
        while (curr != null) {
            System.out.print("(key: " + curr.key + ", value: " + curr.value + ")=>");
            curr = curr.next;
        }
    }
}
