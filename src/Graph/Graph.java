package Graph;

import java.util.*;

public class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();

     void addVertex(T s){
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T source, T destination, boolean isBidirectional){
        if(!map.containsKey(source))
            addVertex(source);

        if(!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if(isBidirectional)
            map.get(destination).add(source);
    }

    public String printGraph(){
        StringBuilder sb = new StringBuilder();
        for(T v : map.keySet()){
            sb.append(v.toString() + ": ");
            for(T w :map.get(v)){
                sb.append(w.toString() + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public Integer vertexCount(){
         return map.keySet().size();
    }


    public void depthFirstSearch(Map<T, List<T>> m, T start){
        Stack<T> stack = new Stack<>();
        HashSet<T> hs = new HashSet<>();
        stack.push(start);
        while(!stack.isEmpty()){
            T current = stack.pop();
            if(!hs.contains(current)){
                hs.add(current);
                System.out.println(current);
                for(T w : m.get(current)){
                    if(!hs.contains(w)) stack.push((w));
                }
            }
        }
    }

    public void breadthFirstSearch(Map<T, List<T>> m,T start){
         LinkedList<T> queue = new LinkedList<>();
         HashSet<T> hs = new HashSet<>();
         queue.add(start);
         while(!queue.isEmpty()){
             T current = queue.pop();
             if(!hs.contains(current)){
                 hs.add(current);
                 System.out.println(current);
                 for(T w : m.get(current)){
                     if(!hs.contains(w)) queue.add(w);
                 }
             }
         }
    }

    public static void main(String[] args){
        Graph<Integer> gph = new Graph<Integer>();
        gph.addEdge(0,1,false);
        gph.addEdge(0,4,false);
        gph.addEdge(1,2,true);
        gph.addEdge(1,3,true);
        gph.addEdge(4,3 ,true);
        System.out.println(gph.printGraph());
        gph.depthFirstSearch(gph.map,0);
        gph.breadthFirstSearch(gph.map, 0);

        Graph<Integer> g2 = new Graph<Integer>();
        g2.addEdge(0, 1, true);
        g2.addEdge(0, 4, true);
        g2.addEdge(1, 2, true);
        g2.addEdge(1, 3, true);
        g2.addEdge(1, 4, true);
        g2.addEdge(2, 3, true);
        g2.addEdge(3, 4, true);

        gph.depthFirstSearch(gph.map,0);
        gph.breadthFirstSearch(gph.map, 0);
    }
}
