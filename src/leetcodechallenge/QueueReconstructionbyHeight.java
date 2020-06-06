package leetcodechallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionbyHeight {
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a, b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        List<int[]> list= new ArrayList<>();
        for(int i=0;i<people.length;i++){
            list.add(people[i][1],people[i]);
        }
        return list.toArray(new int[people.length][2]);
    }
    public static void main(String[] args) {
    int[][] people={{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
    int[][] arrangedPeople=reconstructQueue(people);
    for (int i=0;i<arrangedPeople.length;i++){
        System.out.print("["+arrangedPeople[i][0]+","+arrangedPeople[i][1]+"]");
    }
    System.out.println();

    }
}
