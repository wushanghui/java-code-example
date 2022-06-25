package pattern.structural.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准男性
 *
 * @author 吴尚慧
 * @since 2022/6/25 21:45
 */
public class CriteriaMale implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
