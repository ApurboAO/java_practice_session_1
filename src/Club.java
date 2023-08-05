public class Club {

  private int id;
  private String name;
  private Player[] players;
  int playerCount = 0;

  // add your code here

  // you are not allowed to write any other constructor
  public Club() {
    this.players = new Player[11];
  }

  public double getSalary() {
    double total = 0;
    for (int i = 0; i < playerCount; i++) {
      total += players[i].getSalary();
    }
    return total;
  }

  // add your code here
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addPlayer(Player player) {
    if (playerCount < players.length) {
      players[playerCount] = player;
      playerCount++;
    }
  }

  public Player getMaxSalaryPlayer() {
    double maxSalary = players[0].getSalary();
    int maxIndx = 0;
    for (int i = 1; i < playerCount; i++) {
      if (players[i].getSalary() > maxSalary) {
        maxSalary = players[i].getSalary();
        maxIndx = i;
      }
    }
    return players[maxIndx];
  }
}
