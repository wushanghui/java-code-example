package pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身
 *
 * @author 吴尚慧
 * @since 2022/6/25 22:00
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
