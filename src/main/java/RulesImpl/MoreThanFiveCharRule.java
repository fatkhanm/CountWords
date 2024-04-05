package RulesImpl;

import Rule.WordRule;

public class MoreThanFiveCharRule implements WordRule {

  public boolean rule(String word) {
    if(word == null){
      return false;
    }
    return word.length() > 5;
  }
}
