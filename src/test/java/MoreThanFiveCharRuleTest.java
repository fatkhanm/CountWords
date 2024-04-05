import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

import RulesImpl.MoreThanFiveCharRule;
import org.junit.Test;

public class MoreThanFiveCharRuleTest {
  MoreThanFiveCharRule countWordStartWithMRule = new MoreThanFiveCharRule();

  @Test
  public void checkRuleIfWordIsNull(){
    assertFalse(countWordStartWithMRule.rule(null));
  }

  @Test
  public void checkRuleIfWordIsBlank(){
    assertFalse(countWordStartWithMRule.rule(""));
  }

  @Test
  public void checkRuleIfWordLessThanFive(){
    assertFalse(countWordStartWithMRule.rule("Kamu"));
  }

  @Test
  public void checkRuleIfWordMoreThanFive(){
    assertTrue(countWordStartWithMRule.rule("MukaGanteng"));
  }

}
