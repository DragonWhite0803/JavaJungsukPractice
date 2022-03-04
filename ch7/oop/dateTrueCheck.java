
public class dateTrueCheck {
  
  public boolean dateTrue(String movielist, int inputDate) {
    if(movielist.contains("~")) {
      String[] checkDate = new String[2];
      checkDate = movielist.split("~");
      int beforeDate = Integer.parseInt(checkDate[0]);
      int afterDate = Integer.parseInt(checkDate[1]);
      if ((beforeDate <= inputDate) && (inputDate <= afterDate)) {
        return true;
      }else {
        return false;
      }
    }else {
      return false;
    }

  }
}
