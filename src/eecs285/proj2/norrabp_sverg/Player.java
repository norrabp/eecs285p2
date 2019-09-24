package eecs285.proj2.norrabp_sverg;

public class Player {
  int playerIndex;
  double startColumn;
  double startRow;
  double speed;

  Player(int playerIndex, double startColumn, double startRow, double speed) {
    this.playerIndex = playerIndex;
    this.startColumn = startColumn;
    this.startRow = startRow;
    this.speed = speed;
  }

  public double getVectorOfTravel() {
    return 0.0;
  }

}


