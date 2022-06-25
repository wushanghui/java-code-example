package pattern.structural.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准女性
 *
 * @author 吴尚慧
 * @since 2022/6/25 21:46
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
