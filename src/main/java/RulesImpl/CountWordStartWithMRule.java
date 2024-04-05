package RulesImpl;

import Rule.WordRule;

public class CountWordStartWithMRule implements WordRule {

  public boolean rule(String word) {
    if(word == "" || word == null){
      return false;
    }
    return word.toUpperCase().startsWith("M");
  }
}
