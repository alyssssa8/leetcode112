import java.awt.image.ImageProducer;
import java.util.*;

public class SortCharactersByFrequency451 {
    public static void main(String[] args) {
        String s = "tree";
        frequencySort(s);

    }


//    method 1:
//        step one: save to map
//        use the count as index
//        loop from the back

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        List<Character> [] bucket = new List[s.length() + 1];// eeeee。  index from 0-5,  all 5 are same
        for (char key : map.keySet()){
            int frequency = map.get(key);
            if (bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos>= 0; pos--){
            if(bucket[pos] != null){
                for (char c : bucket[pos]) {
                    for (int i = 0; i < pos; i++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String frequencySort2(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        // big to small
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue().compareTo(a.getValue()));
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++){
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}
