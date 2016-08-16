import java.util.List;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class Person {
  public Person() {
  }
  
  public Person(final Procedure1<Person> initializer) {
    initializer.apply(this);
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  private List<Person> friends;
  
  public List<Person> getFriends() {
    return this.friends;
  }
  
  public void setFriends(final List<Person> friends) {
    this.friends = friends;
  }
  
  public String getName() {
    return this.name;
  }
  
  public List<Person> getFriends() {
    return this.friends;
  }
  
  @Override
  public String toString() {
    String result = new ToStringBuilder(this).addAllFields().toString();
    return result;
  }
}
