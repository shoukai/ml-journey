package org.apframework.pagerank;

public class Test {
    @org.junit.Test
    public void test(){
        String team = "nba_team_list.json";
        String match = "nba_result_list";
        int max = 20;

        PageRank pageRank = new PageRank(team, match, max);
        pageRank.iteration(pageRank.getTeamMap(), pageRank.getMax());
        pageRank.writeToFile();
        pageRank.print();
    }
}
