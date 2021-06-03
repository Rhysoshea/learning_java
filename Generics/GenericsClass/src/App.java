public class App {

    // Want to use generics to make the Team base class a generic class so we can build different types of teams off the same concept of a team but for different sports
    public static void main(String[] args) throws Exception {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        Team<SoccerPlayer> soccerTeam = new Team<>("Man U");
        adelaideCrows.addPlayer(joe);
        baseballTeam.addPlayer(pat);
        soccerTeam.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        // Team<String> brokenTeam = new Team<>("this won't work");
        // brokenTeam.addPlayer("no one");
        // type string can't be cast to type Player, no error will show until compilation
        // but extending T by Player means the IDE can pickup this check
    }
}
