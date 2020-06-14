package leetcodechallenge;

import java.util.LinkedList;
import java.util.List;

public class CheapestFlightsWithinKStops {
    static int totalCost=Integer.MAX_VALUE;
    public static void findCost(List<Integer>[] graph,int[][] cost,int src,int des,int k,int currCost,int[] visited){
        if(k<-1)
            return;
        if(src==des){
            totalCost=Math.min(totalCost,currCost);
            return;
        }
        visited[src]=1;
        for(int i=0;i<graph[src].size();i++){
            int pos=graph[src].get(i);
            if(visited[pos]==0&&currCost+cost[src][pos]<=totalCost)
                findCost(graph,cost,pos,des,k-1,currCost+cost[src][pos],visited);
        }
        visited[src]=0;

    }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        List<Integer>[] graph= new LinkedList[n+1];
        int[][] cost= new int[n+1][n+1];
        int[] visited= new int[n+1];
        for(int i=0;i<n;i++){
            graph[i]= new LinkedList<>();
        }
        for(int i=0;i<flights.length;i++){
            int v1=flights[i][0];
            int v2=flights[i][1];
            int weight=flights[i][2];
            graph[v1].add(v2);
            cost[v1][v2]=weight;
        }
        findCost(graph,cost,src,dst,K,0,visited);
        if(totalCost==Integer.MAX_VALUE)
            return -1;
        return totalCost;
    }
    public static void main(String[] args) {

    }
}
