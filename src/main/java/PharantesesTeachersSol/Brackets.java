package PharantesesTeachersSol;

import java.util.ArrayList;
import java.util.List;

public class Brackets implements Calculable{

  @Override
  public int calc(String origin) {

    List<Character> list = new ArrayList<>();

    int depth = 0;
    int max_depth = 0;
    for (int i=0; i<origin.length(); i++) {
      char c = origin.charAt(i);
      switch (c) {
        case '(': depth++; break;
        case ')': depth--; break;
        default : list.add(c);
      }
      if (depth < 0) throw new IllegalArgumentException("Extra ')'");
      max_depth = Math.max(max_depth, depth);
    }
    if (depth > 0) throw new IllegalArgumentException("Extra '('");
    return max_depth;
  }

}
