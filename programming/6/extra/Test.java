class Test {
  public static void main(String[] args) {
    double decimal = 0.0;
    int dn = 9; //dividend
    int dv = 3; //divisor
    double place; 
    //what power of 10 are we at?
    for(int i = 0; i <= 16; i++){
      int value = dn / dv; //integer divison
      place = Math.pow(10, i * -1); //what place value are we at? 
      decimal += value * place; //mutliply value by place value, add to decimal
      dn = dn % dv * 10; //recalculate the dividend (dn)
    }
      System.out.println(decimal);
  }
}
