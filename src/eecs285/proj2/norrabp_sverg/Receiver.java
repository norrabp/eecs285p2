package eecs285.proj2.norrabp_sverg;

public class Receiver extends Player {
  double intermediateColumn;
  double intermediateRow;
  double stopColumn;
  double stopRow;

  Receiver(int playerIndex, double startColumn, double startRow,
           double intermediateColumn, double intermediateRow, double stopColumn,
           double stopRow, double speed) {
    super(playerIndex, startColumn, startRow, speed);
    this.intermediateColumn = intermediateColumn;
    this.intermediateRow = intermediateRow;
    this.stopColumn = stopColumn;
    this.stopRow = stopRow;
  }

  @Override
  public double getVectorOfTravel() {
    return super.getVectorOfTravel();
  }

}
