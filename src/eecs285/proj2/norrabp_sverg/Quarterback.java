package eecs285.proj2.norrabp_sverg;

public class Quarterback extends Player {
  double stopColumn;
  double stopRow;
  double throwToColumn;
  double throwToRow;
  double throwSpeed;

  Quarterback(int playerIndex, double startColumn, double startRow,
              double stopColumn, double stopRow, double throwToColumn,
              double throwToRow, double speed, double throwSpeed) {
    super(playerIndex, startColumn, startRow, speed);
    this.stopColumn = stopColumn;
    this.stopRow = stopRow;
    this.throwToColumn = throwToColumn;
    this.throwToRow = throwToRow;
    this.throwSpeed = throwSpeed;
  }

  @Override
  public double getVectorOfTravel() {
    return super.getVectorOfTravel();
  }
}
