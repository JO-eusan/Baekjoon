import java.util.*;

class Solution {
    
    private int[] dx = {1, -1, 0, 0};
    private int[] dy = {0, 0, 1, -1};
    
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        
        List<Integer> days = new ArrayList<>();
        boolean[][] visited = new boolean[n][m];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!visited[i][j] && maps[i].charAt(j) != 'X') {
                    int area = bfs(i, j, visited, maps);
                    days.add(area);
                }
            }
        }
        
        Collections.sort(days);
        
        if(days.size() == 0) return new int[] {-1};
        
        int[] answer = new int[days.size()];
        
        for(int i=0; i<days.size(); i++) {
            answer[i] = days.get(i);
        }
        
        return answer;
    }
    
    private int bfs(int startX, int startY, boolean[][] visited, String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int area = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {startX, startY});
        visited[startX][startY] = true;
        area += (maps[startX].charAt(startY) - '0');
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                
                if(!visited[nx][ny] && maps[nx].charAt(ny) != 'X') {
                    q.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;
                    area += (maps[nx].charAt(ny) - '0');
                }
            }
        }
        
        return area;
    }
}