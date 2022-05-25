package Graph;

import java.util.*;

public class CountIsland<T> {
    Map<T, List<T>> map = new HashMap<>();

    private void addVertex(T s){
        map.put(s, new LinkedList<>());
    }

    public void addEdge(T source, T destination, boolean isBidirectional){
        if(!map.containsKey(source))
            addVertex(source);

        if(destination != null && !map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if(isBidirectional)
            map.get(destination).add(source);
    }

    public String printGraph(){
        StringBuilder sb = new StringBuilder();
        for(T v : map.keySet()){
            sb.append(v + ": ");
            for(T w : map.get(v)){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }



    HashSet<T> hs = new HashSet<>();
    public int breadthSearhFirst(Map<T, List<T>> m, T source){
        LinkedList<T> queue = new LinkedList<>();
        queue.add(source);
        int count = 1;
        while (!queue.isEmpty()){
            T current = queue.pop();
            if(!hs.contains(current)){
                hs.add(current);
                //System.out.println(current);
                for(T w : m.get(current)){
                    if(!hs.contains(w)) {
                        queue.add(w);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        CountIsland<Integer> graph = new CountIsland<Integer>();
        graph.addEdge(1,2,true);
        graph.addEdge(6,4,true);
        graph.addEdge(6,5,true);
        graph.addEdge(6,7,true);
        graph.addEdge(6,8,true);
        graph.addEdge(3,null,false);
        //System.out.print(graph.printGraph());

        ArrayList<Integer> ar = new ArrayList<>();
        for(Integer m : graph.map.keySet()){
            for(Integer v : graph.map.get(m)){
                if(v == null){  ar.add(1); }
                else if(v!=null) {
                    int area = graph.breadthSearhFirst(graph.map,v);
                    if(area>1) ar.add(area);
                }
            }
        }

        System.out.println("Number of island : " + ar.size());
        System.out.println("Area of individual Island : " + ar);
        System.out.println("Total area of Islands : " + ar.stream().reduce(0, Integer::sum));
    }
}
