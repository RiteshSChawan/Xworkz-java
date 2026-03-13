class Cricket {
    String teamA;
    String teamB;
    int scoreA;
    int scoreB;
    int wicketsA;
    int wicketsB;
    int oversA;
    int oversB;
    String venue;
    String matchDate;
    String umpire;
    int totalBalls;
    int extras;
    String format;
    String manOfMatch;
    boolean dayNight;
    int maxOvers;
    String tossWinner;
    String tossDecision;
    String result;
    Cricket() {}
    Cricket(String teamA, String teamB, int scoreA, int scoreB,
            int wicketsA, int wicketsB, int oversA, int oversB,
            String venue, String matchDate, String umpire,
            int totalBalls, int extras, String format, String manOfMatch,
            boolean dayNight, int maxOvers, String tossWinner,
            String tossDecision, String result) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.wicketsA = wicketsA;
        this.wicketsB = wicketsB;
        this.oversA = oversA;
        this.oversB = oversB;
        this.venue = venue;
        this.matchDate = matchDate;
        this.umpire = umpire;
        this.totalBalls = totalBalls;
        this.extras = extras;
        this.format = format;
        this.manOfMatch = manOfMatch;
        this.dayNight = dayNight;
        this.maxOvers = maxOvers;
        this.tossWinner = tossWinner;
        this.tossDecision = tossDecision;
        this.result = result;
    }
}