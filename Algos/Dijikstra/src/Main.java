/**
 * Created by sasakiumi on 3/31/14.
 */
public class Main {
    public static void main(String[] args) {
        int N = 5;
        int[][] graph = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                graph[i][j] = Dijikstra.INF;
            }
        }
        graph[0][1] = graph[1][0] = 2;
        graph[0][2] = graph[2][0] = 5;
        graph[1][2] = graph[2][1] = 4;
        graph[1][3] = graph[3][1] = 6;
        graph[1][4] = graph[4][1] = 10;
        graph[2][3] = graph[3][2] = 2;
        graph[3][5] = graph[5][3] = 1;
        graph[4][5] = graph[5][4] = 3;
        graph[4][6] = graph[6][4] = 5;
        graph[5][6] = graph[6][5] = 9;

        for (int i = 1; i < 7; i++) {
            System.out.println(Dijikstra.shortestPath(graph, 0, 7, i));
        }
    }
}
