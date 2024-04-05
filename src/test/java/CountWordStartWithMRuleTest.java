import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import RulesImpl.CountWordStartWithMRule;
import org.junit.Test;

public class CountWordStartWithMRuleTest {
  CountWordStartWithMRule countWordStartWithMRule = new CountWordStartWithMRule();

  @Test
  public void checkRuleIfWordIsNull(){
    assertFalse(countWordStartWithMRule.rule(null));
  }

  @Test
  public void checkRuleIfWordIsBlank(){
    assertFalse(countWordStartWithMRule.rule(""));
  }

  @Test
  public void checkRuleIfWordNotMatch(){
    assertFalse(countWordStartWithMRule.rule("Kamu"));
  }

  @Test
  public void checkRuleIfWordMatch(){
    assertTrue(countWordStartWithMRule.rule("Muka"));
  }
}
