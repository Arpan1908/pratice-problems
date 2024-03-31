
import java.util.*;

public class HashMapCode {
  static class HashMap<K, V> {
    private class Node { // defining the structure of a linked list
      K key;
      V value;

      public Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int n; // size of the nodes
    private int N; // size of the array
    private LinkedList<Node> buckets[]; // array of linked lists

    @SuppressWarnings("unchecked")
    public HashMap() {
      this.N = 4;
      this.buckets = new LinkedList[4];
      for (int i = 0; i < N; i++) {
        this.buckets[i] = new LinkedList<>();
      }
    }

    private int searchinLL(K key, int bi) {
      LinkedList<Node> ll = buckets[bi];
      int di = 0;
      for (int i = 0; i < ll.size(); i++) {
        if (ll.get(i).key == key) {
          return i;
        }
      }
      return -1;
    }

    private int hashFunction(K key) { // hash function to return hash value of a key
      int bi = key.hashCode();// bucket index should be between 0 to N-1
      return Math.abs(bi) % N;
    }

    private void reHash() {
      LinkedList<Node> oldBuckets[] = buckets;
      buckets = new LinkedList[N * 2];
      for (int i = 0; i < 2 * N; i++) {
        buckets[i] = new LinkedList<>();
      }
      n = 0;
      for (int i = 0; i < oldBuckets.length; i++) {
        if (oldBuckets[i] != null) {
          for (int j = 0; j < oldBuckets[i].size(); j++) {
            Node node = oldBuckets[i].get(j);
            put(node.key, node.value);
          }
        }
      }
    }

    public void put(K key, V value) {
      int bucketIndex = hashFunction(key); // bucket index
      int nodeIndex = searchinLL(key, bucketIndex); // node index

      if (nodeIndex == -1) { // key doesnt exists
        buckets[bucketIndex].add(new Node(key, value));
        n++;
      } else { // key exists in the linked list
        Node data = buckets[bucketIndex].get(nodeIndex);
        data.value = value;
      }

      double lambda = (double) n / N;

      if (lambda >= 2.0) {
        // rehash the array and make the size of the array double i.e. N*2
        reHash();

      }
    }

  }
}

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("a", 24);
    map.put("b", 25);

    System.out.println(map.get("a"));
  }

}
