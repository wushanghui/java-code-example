package pattern.structural.filter;

import java.util.List;

/**
 * 标准 接口
 *
 * @author 吴尚慧
 * @since 2022/6/25 21:43
 */
public interface Criteria {

    /**
     * 满足标准
     *
     * @param persons 人列表
     * @return 满足的人列表
     */
    public List<Person> meetCriteria(List<Person> persons);

}
