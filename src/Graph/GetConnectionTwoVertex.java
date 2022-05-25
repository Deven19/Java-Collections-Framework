package Graph;

import java.util.*;

public class GetConnectionTwoVertex<T> {
    Map<T, List<T>> map = new HashMap<>();

    private void addVertex(T s){
        map.put(s, new LinkedList<T>());
    }

    public void addEdge(T source, T destination, boolean isBidirectional){
        if(!map.containsKey(source))
            addVertex(source);

        if(!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (isBidirectional) map.get(destination).add(source);
    }

    public String printGraph(){
        StringBuilder sb = new StringBuilder();
        for(T k: map.keySet()){
            sb.append(k + " : ");
            for(T v: map.get(k)){
                sb.append(v+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean breadthSearchFirst(Map<T, List<T>> m, T source, T destination){
        LinkedList<T> queue = new LinkedList<>();
        queue.add(source);
        HashSet<T> hs = new HashSet<>();
        while(!queue.isEmpty()){
            T current = queue.pop();
            System.out.println(current);
            if(!hs.contains(current)){
                hs.add(current);
                for(T v : m.get(current)){
                    if(v == destination) return true;
                    if(!hs.contains(v)) queue.add(v);
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        GetConnectionTwoVertex<Integer> graph = new GetConnectionTwoVertex<Integer>();
        graph.addEdge(1,2,true);
        graph.addEdge(1,3,true);
        graph.addEdge(3,4,true);
        graph.addEdge(3,5,true);
        graph.addEdge(6,7,true);
        System.out.println(graph.printGraph());

        System.out.println(graph.breadthSearchFirst(graph.map,1,6));
    }
}

